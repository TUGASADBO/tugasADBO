/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import engine.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author i13026 i13011
 */
public class Main extends JPanel {

    Board board;
    //Drawer drawer;
    Image wallImage;
    Image floorImage;
    Image barrierImage;
    Image ICImage;
    Image finishImage;
    Image fireImage;
    Image fireShoeImage;
    Image waterShoeImage;
    Image waterImage;
    Image chip;
    int curX;
    int curY;
    boolean open;

    public Main() throws IOException {
        board = new Board();
        wallImage = ImageIO.read(getClass().getClassLoader().getResource("image/wall.png"));
        floorImage = ImageIO.read(getClass().getClassLoader().getResource("image/plainFloor.png"));
        ICImage = ImageIO.read(getClass().getClassLoader().getResource("image/IC.png"));
        barrierImage = ImageIO.read(getClass().getClassLoader().getResource("image/barrier.png"));
        finishImage = ImageIO.read(getClass().getClassLoader().getResource("image/finishFloor.png"));
        fireImage = ImageIO.read(getClass().getClassLoader().getResource("image/fireFloor.png"));
        fireShoeImage = ImageIO.read(getClass().getClassLoader().getResource("image/fireShoes.png"));
        waterShoeImage = ImageIO.read(getClass().getClassLoader().getResource("image/waterShoes.png"));
        waterImage = ImageIO.read(getClass().getClassLoader().getResource("image/waterFloor.png"));
        chip = ImageIO.read(getClass().getClassLoader().getResource("image/chip.png"));
        //drawer = new Drawer(board);
        curX = 300;
        curY = 300;
        open = false;
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            Floor flo = null;

            @Override
            public void keyPressed(KeyEvent e) {
                if (!board.getIsFinish() && !board.getIsGameOver()) {
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_LEFT:
                            
                            flo = board.getFloor()[((curX - 50) / 50) - 1][((curY) / 50) - 1];
                            if ((flo.getClass().equals(Barrier.class)) && (board.getChipLeft() == 0)){
                                board.setFloor(new PlainFloor(), (curX / 50) - 1, (curY / 50) - 1);
                                board.setFloor(new Chip(), ((curX - 50) / 50) - 1, ((curY / 50) - 1));
                                curX -= 50;
                            }
                            else if (flo.isCanMove()) {
                                if (flo.isKill()) {
                                    board.setIsGameOver();
                                } else if (flo.getClass().equals(IntegratedCircuit.class)) {
                                    board.setChipLeft();
                                }
                                board.setFloor(new PlainFloor(), (curX / 50) - 1, (curY / 50) - 1);
                                board.setFloor(new Chip(), ((curX - 50) / 50) - 1, ((curY / 50) - 1));
                                curX -= 50;
                            }
                            
                            break;
                        case KeyEvent.VK_RIGHT:
                            flo = board.getFloor()[((curX + 50) / 50) - 1][(curY / 50) - 1];
                            if ((flo.getClass().equals(Barrier.class)) && (board.getChipLeft() == 0)){
                                board.setFloor(new PlainFloor(), (curX / 50) - 1, (curY / 50) - 1);
                                board.setFloor(new Chip(), ((curX + 50) / 50) - 1, ((curY / 50) - 1));
                                curX += 50;
                            }
                            else if (flo.isCanMove()) {
                                if (flo.isKill()) {
                                    board.setIsGameOver();
                                } else if (flo.getClass().equals(IntegratedCircuit.class)) {
                                    board.setChipLeft();
                                }
                                board.setFloor(new PlainFloor(), (curX / 50) - 1, (curY / 50) - 1);
                                board.setFloor(new Chip(), ((curX + 50) / 50) - 1, ((curY / 50) - 1));
                                curX += 50;
                            }
                            break;
                        case KeyEvent.VK_DOWN:
                            flo = board.getFloor()[((curX) / 50) - 1][((curY + 50) / 50) - 1];
                            if ((flo.getClass().equals(Barrier.class)) && (board.getChipLeft() == 0)) {
                                board.setFloor(new PlainFloor(), (curX / 50) - 1, (curY / 50) - 1);
                                board.setFloor(new Chip(), 5, 7);
                                curY+=50;
                            } else if (flo.isCanMove()) {
                                if (flo.isKill()) {
                                    board.setIsGameOver();
                                } else if (flo.getClass().equals(IntegratedCircuit.class)) {
                                    board.setChipLeft();
                                }
                                if ((flo.getClass().equals(Barrier.class)) && (board.getChipLeft() == 0)) {

                                    board.setFloor(new PlainFloor(), 5, 7);
                                }
                                board.setFloor(new PlainFloor(), (curX / 50) - 1, (curY / 50) - 1);
                                board.setFloor(new Chip(), ((curX) / 50) - 1, (((curY + 50) / 50) - 1));
                                curY += 50;
                            }
                            break;
                        case KeyEvent.VK_UP:
                            flo = board.getFloor()[((curX) / 50) - 1][((curY - 50) / 50) - 1];
                            if ((flo.getClass().equals(Barrier.class)) && (board.getChipLeft() == 0)){
                                board.setFloor(new PlainFloor(), (curX / 50) - 1, (curY / 50) - 1);
                                board.setFloor(new Chip(), ((curX) / 50) - 1, (((curY - 50) / 50) - 1));
                                curY -= 50;
                            }
                            else if (flo.isCanMove()) {
                                if (flo.isKill()) {
                                    board.setIsGameOver();
                                } else if (flo.getClass().equals(IntegratedCircuit.class)) {
                                    board.setChipLeft();
                                }
                                board.setFloor(new PlainFloor(), (curX / 50) - 1, (curY / 50) - 1);
                                board.setFloor(new Chip(), ((curX) / 50) - 1, (((curY - 50) / 50) - 1));
                                curY -= 50;
                            }
                            if ((board.equals(Barrier.class)) && (open == true)) {
                                board.setFloor(new PlainFloor(), 5, 7);
                            }
                            break;
                    }
                    repaint();

                }
            }
        });
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < board.getLength(); i++) {
            for (int j = 0; j < board.getLength(); j++) {
                Image img = null;
                if (board.getFloor()[i][j].getClass().equals(Wall.class)) {
                    img = wallImage;
                } else if (board.getFloor()[i][j].getClass().equals(Barrier.class)) {
                    img = barrierImage;
                } else if (board.getFloor()[i][j].getClass().equals(Chip.class)) {
                    img = chip;
                } else if (board.getFloor()[i][j].getClass().equals(IntegratedCircuit.class)) {
                    img = ICImage;
                } else if (board.getFloor()[i][j].getClass().equals(FireFloor.class)) {
                    img = fireImage;
                } else if (board.getFloor()[i][j].getClass().equals(FinishFloor.class)) {
                    img = finishImage;
                } else if (board.getFloor()[i][j].getClass().equals(PlainFloor.class)) {
                    img = floorImage;
                } else if (board.getFloor()[i][j].getClass().equals(WaterFloor.class)) {
                    img = waterImage;
                } else if (board.getFloor()[i][j].getClass().equals(FireBoots.class)) {
                    img = fireShoeImage;
                } else if (board.getFloor()[i][j].getClass().equals(WaterBoots.class)) {
                    img = waterShoeImage;
                }
                g2d.drawImage(img, 50 * (i + 1), 50 * (j + 1), null);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        JFrame game = new JFrame("Chip's Challenge");
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setResizable(false);
        Main ma = new Main();
        game.getContentPane().add("Center", ma);
        game.pack();
        game.setSize(new Dimension(650, 670));
        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }
}
