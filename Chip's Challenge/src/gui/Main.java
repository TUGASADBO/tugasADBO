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
public class Main extends JPanel implements Runnable{

    private static int FRAME_WIDTH;
    private static int FRAME_HEIGHT;
    private static JFrame frame;
    Thread thread;
    Board board;
    GamePlay game;
    Chip chip;
    Image wallImage;
    Image floorImage;
    Image barrierImage;
    Image ICImage;
    Image finishImage;
    Image fireImage;
    Image fireShoeImage;
    Image waterShoeImage;
    Image waterImage;
    Image chipDown;
    Image chipLeft;
    Image chipRight;
    Image chipUp;
    Graphics2D g2d;
    int curX;
    int curY;
    int time;

    public Main() throws IOException {
        setBackground(new Color(210, 210, 210));
        resetGame();
        wallImage = ImageIO.read(getClass().getClassLoader().getResource("image/wall.png"));
        floorImage = ImageIO.read(getClass().getClassLoader().getResource("image/plainFloor.png"));
        ICImage = ImageIO.read(getClass().getClassLoader().getResource("image/IC.png"));
        barrierImage = ImageIO.read(getClass().getClassLoader().getResource("image/barrier.png"));
        finishImage = ImageIO.read(getClass().getClassLoader().getResource("image/finishFloor.png"));
        fireImage = ImageIO.read(getClass().getClassLoader().getResource("image/fireFloor.png"));
        fireShoeImage = ImageIO.read(getClass().getClassLoader().getResource("image/fireShoes.png"));
        waterShoeImage = ImageIO.read(getClass().getClassLoader().getResource("image/waterShoes.png"));
        waterImage = ImageIO.read(getClass().getClassLoader().getResource("image/waterFloor.png"));
        chipDown = ImageIO.read(getClass().getClassLoader().getResource("image/chipDown.png"));
        chipLeft = ImageIO.read(getClass().getClassLoader().getResource("image/chipLeft.png"));
        chipRight = ImageIO.read(getClass().getClassLoader().getResource("image/chipRight.png"));
        chipUp = ImageIO.read(getClass().getClassLoader().getResource("image/chipUp.png"));
        thread = new Thread(this);
        thread.start();
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            Floor flo = null;
            Floor floAwal = null;
            int xAwal;
            int yAwal;
            int xMove;
            int yMove;

            @Override
            public void keyPressed(KeyEvent e) {
                floAwal = board.getFloor()[(curX / 50) - 1][(curY / 50) - 1];
                xAwal = (curX / 50) - 1;
                yAwal = (curY / 50) - 1;
                if (!game.isWin() && !game.getIsGameOver()) {
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_LEFT:
                            xMove = ((curX - 50) / 50) - 1;
                            yMove = (curY / 50) - 1;
                            flo = board.getFloor()[xMove][yMove];
                            if (flo.isObstacles()) {
                                if ((flo.getClass().equals(Barrier.class)) && (board.getChipLeft() == 0)) {
                                    board.setFloor(new PlainFloor(), xMove, yMove);
                                    curX -= 50;
                                }
                            } else {
                                curX -= 50;
                            }
                            chip.setDirection(4);
                            break;
                        case KeyEvent.VK_RIGHT:
                            xMove = ((curX + 50) / 50) - 1;
                            yMove = (curY / 50) - 1;
                            flo = board.getFloor()[xMove][yMove];
                            if (flo.isObstacles()) {
                                if ((flo.getClass().equals(Barrier.class)) && (board.getChipLeft() == 0)) {
                                    board.setFloor(new PlainFloor(), xMove, yMove);
                                    curX += 50;
                                }
                            } else {
                                curX += 50;
                            }
                            chip.setDirection(2);
                            break;
                        case KeyEvent.VK_DOWN:
                            xMove = (curX / 50) - 1;
                            yMove = ((curY + 50) / 50) - 1;
                            flo = board.getFloor()[xMove][yMove];
                            if (flo.isObstacles()) {
                                if ((flo.getClass().equals(Barrier.class)) && (board.getChipLeft() == 0)) {
                                    board.setFloor(new PlainFloor(), xMove, yMove);
                                    curY += 50;
                                }
                            } else {
                                curY += 50;
                            }
                            chip.setDirection(1);
                            break;
                        case KeyEvent.VK_UP:
                            xMove = (curX / 50) - 1;
                            yMove = ((curY - 50) / 50) - 1;
                            flo = board.getFloor()[xMove][yMove];
                            if (flo.isObstacles()) {
                                if ((flo.getClass().equals(Barrier.class)) && (board.getChipLeft() == 0)) {
                                    board.setFloor(new PlainFloor(), xMove, yMove);
                                    curY -= 50;
                                }
                            } else {
                                curY -= 50;
                            }
                            chip.setDirection(3);
                            break;
                    }
                    repaint();
                    flo = board.getFloor()[xMove][yMove];
                    if (flo.isCanMove()) {
                        if (flo.isKill()) {
                            if ((flo.getClass().equals(FireFloor.class) && !chip.wearFireBoot()) || ((flo.getClass().equals(WaterFloor.class) && !chip.wearWaterBoot()))) {
                                game.setIsGameOver(true);
                            }
                        } else if (flo.getClass().equals(IntegratedCircuit.class)) {
                            board.setChipLeft();
                            game.setScore(game.getScore()+100);
                        } else if (flo.getClass().equals(FinishFloor.class)) {
                            game.setScore(game.getScore()+(time*10));
                            if (game.getLevel() == game.getListBoard().size()) {
                                game.setWin(true);
                            } else {
                                levelUp();
                            }
                            
                        }
                        if (!flo.isObstacles()) {
                            if (flo.getClass().equals(FireFloor.class) || flo.getClass().equals(WaterFloor.class)) {
                            } else {
                                board.setFloor(new PlainFloor(), xMove, yMove);
                            }
                        }
                        if (flo.getClass().equals(FireBoots.class)) {
                            chip.setWearFireBoot(true);
                        } else if (flo.getClass().equals(WaterBoots.class)) {
                            chip.setWearWaterBoot(true);
                        }
                    }
                } else if (game.getIsGameOver() || game.isWin()) {
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_ENTER:
                            resetGame();
                            break;
                    }
                    repaint();
                }
            }
        });
    }

    public void clear(Graphics g) {
        super.paintComponent(g);
    }

    public void paintComponent(Graphics g) {
        g2d = (Graphics2D) g;
        g2d.setFont(new Font("Calibri", 20, 24));
        if (game.getIsGameOver()) {
            clear(g);
            g2d.drawString("YOU FAIL!", (FRAME_WIDTH / 3), (FRAME_HEIGHT / 2) - 50);
            g2d.drawString("Your Score = " + game.getScore(), (FRAME_WIDTH / 3), FRAME_HEIGHT / 2);
            g2d.drawString("Press Enter to Restart", (FRAME_WIDTH / 3), (FRAME_HEIGHT / 2)+50);
        } else if (game.isWin()) {
            clear(g);
            g2d.drawString("YOU WIN!", (FRAME_WIDTH / 3), (FRAME_HEIGHT / 2) - 50);
            g2d.drawString("Your Score = " + game.getScore(), (FRAME_WIDTH / 3), FRAME_HEIGHT / 2);
            g2d.drawString("Press Enter to restart", (FRAME_WIDTH / 3), (FRAME_HEIGHT / 2) + 50);
        } else {
            clear(g);
            g2d.drawString("LEVEL : " + game.getLevel(), 50, 35);
            g2d.drawString("TIME : " + this.time , 175, 35);
            g2d.drawString("CHIP LEFT : " + board.getChipLeft(), 300, 35);
            g2d.drawString("SCORE : "+game.getScore(),450,35);
            for (int i = 0; i < board.getLength(); i++) {
                for (int j = 0; j < board.getHeight(); j++) {
                    Image img = this.getImage(board.getFloor()[i][j]);
                    g2d.drawImage(img, 50 * (i + 1), 50 * (j + 1), null);
                    if (chip.getDirection() == 1) {
                        g2d.drawImage(chipDown, curX, curY, null);
                    } else if (chip.getDirection() == 2) {
                        g2d.drawImage(chipRight, curX, curY, null);
                    } else if (chip.getDirection() == 3) {
                        g2d.drawImage(chipUp, curX, curY, null);
                    } else if (chip.getDirection() == 4) {
                        g2d.drawImage(chipLeft, curX, curY, null);
                    }
                }
            }
        }
    }

    public Image getImage(Floor floor) {
        Image img = null;
        for (int i = 0; i < board.getLength(); i++) {
            for (int j = 0; j < board.getLength(); j++) {
                if (floor.getClass().equals(Wall.class)) {
                    img = wallImage;
                } else if (floor.getClass().equals(Barrier.class)) {
                    img = barrierImage;
                } else if (floor.getClass().equals(FireFloor.class)) {
                    img = fireImage;
                } else if (floor.getClass().equals(FinishFloor.class)) {
                    img = finishImage;
                } else if (floor.getClass().equals(PlainFloor.class)) {
                    img = floorImage;
                } else if (floor.getClass().equals(WaterFloor.class)) {
                    img = waterImage;
                } else if (floor.getClass().equals(FireBoots.class)) {
                    img = fireShoeImage;
                } else if (floor.getClass().equals(WaterBoots.class)) {
                    img = waterShoeImage;
                } else if (floor.getClass().equals(IntegratedCircuit.class)) {
                    img = ICImage;
                }
            }
        }
        return img;
    }

    public void levelUp() {
        game.setFinish(false);
        chip.setWearFireBoot(false);
        chip.setWearWaterBoot(false);
        chip.setDirection(1);
        game.addLevel();
        board = game.getBoard();
        time = board.getTime();
        game.setTime(time);
        setDimension(board);
        curX = ((board.getLength() + 1) * 50) / 2;
        curY = ((board.getHeight() + 1) * 50) / 2;
    }

    public void resetGame() {
        game = new GamePlay();
        board = game.getBoard();
        chip = board.getChip();
        chip.setWearFireBoot(false);
        chip.setWearWaterBoot(false);
        chip.setDirection(1);
        game.setScore(0);
        game.setIsGameOver(false);
        game.setFinish(false);
        game.setWin(false);
        time = board.getTime();
        game.setTime(time);
        setDimension(board);
        curX = ((board.getLength() + 1) * 50) / 2;
        curY = ((board.getHeight() + 1) * 50) / 2;
    }

    public void setDimension(Board board) {
        FRAME_WIDTH = ((board.getLength() + 1) * 50) + 50;
        FRAME_HEIGHT = ((board.getHeight() + 1) * 50) + 70;
        frame.setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void run() {
        while(true){
            time--;
            if(time == 0){
                game.setIsGameOver(true);
            }
            repaint();
            try{
                Thread.sleep(1000);
            } catch(InterruptedException ex){}
        }
    }
    
    public static void main(String[] args) throws IOException {
        frame = new JFrame("Chip's Challenge");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        Main ma = new Main();
        frame.getContentPane().add("Center", ma);
        frame.pack();
        frame.setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
