/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;
import engine.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
/**
 *
 * @author i13026 i13011
 */
public class Drawer extends JPanel{
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
    Board board;
    
    public Drawer(Board board) throws IOException{
        this.board=board;
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
    }
    
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        for(int i=0;i<board.getLength();i++){
            for(int j=0;j<board.getLength();j++){
                Image img = null;
                if(board.getFloor()[i][j].getClass().equals(Wall.class)){
                    img=wallImage;
                } else if(board.getFloor()[i][j].getClass().equals(Barrier.class)){
                    img=barrierImage;
                } else if(board.getFloor()[i][j].getClass().equals(Chip.class)){
                    img=chip;
                } else if(board.getFloor()[i][j].getClass().equals(IntegratedCircuit.class)){
                    img=ICImage;
                } else if(board.getFloor()[i][j].getClass().equals(FireFloorr.class)){
                    img=fireImage;
                } else if(board.getFloor()[i][j].getClass().equals(FinishFloorr.class)){
                    img=finishImage;
                } else if(board.getFloor()[i][j].getClass().equals(PlainFloor.class)){
                    img=floorImage;
                } else if(board.getFloor()[i][j].getClass().equals(WaterFloor.class)){
                    img=waterImage;
                } else if(board.getFloor()[i][j].getClass().equals(FireBoots.class)){
                    img=fireShoeImage;
                } else if(board.getFloor()[i][j].getClass().equals(WaterBoots.class)){
                    img=waterShoeImage;
                } 
                g2d.drawImage(img,50*i,50*j,null);
            }
        }
    }
}
