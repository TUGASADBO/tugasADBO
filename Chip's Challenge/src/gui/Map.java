/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author i13026 i13011
 */
public class Map extends JPanel implements Runnable{
    
    BarrierGrid bg ;
    Grid grid ;
    FinishFloor finf;
    FireFloor fire;
    WallImage wall;
    ICImage ic;
    ChipDown chip;
    
    public Map(){
        Thread thread = new Thread(this);
        thread.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.gray);
        for(int i=0;i<550;i+=50){
            for(int j=0;j<550;j+=50){
                grid = new Grid(i,j);
                grid.paintComponent(g2d);
                if(i==250&&j==250){
                    chip = new ChipDown(i,j);
                    chip.paintComponent(g2d);
                } else if(i==300&&j==250){
                    fire = new FireFloor(i,j);
                    fire.paintComponent(g2d);
                }
            }
        }
        bg = new BarrierGrid(50*8,50*8);
        bg.paintComponent(g2d);
    }
    
    @Override
    public void run() {
        while(true){
            repaint();
            try{
                Thread.sleep(100);
            } catch(InterruptedException ex){}
        }
    }
}
