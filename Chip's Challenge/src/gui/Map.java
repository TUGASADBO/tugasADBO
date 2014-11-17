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
public class Map extends JPanel implements Runnable {

    BarrierGrid bg;
    Grid grid;
    FinishFloor finf;
    FireFloor fire;
    WallImage wall;
    ICImage ic;
    ChipDown chip;
    WaterBoots WB;
    WaterFloor Water;
    FireBoots FB;
    RemoveBoots RB;

    public Map() {
        Thread thread = new Thread(this);
        thread.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.gray);
        for (int i = 0; i < 550; i += 50) {
            for (int j = 0; j < 550; j += 50) {
                grid = new Grid(i, j);
                grid.paintComponent(g2d);

            }
        }
        int s = 50;
        chip = new ChipDown(5 * s, 1 * s);
        chip.paintComponent(g2d);
        ic = new ICImage(2 * s, 1 * s);
        ic.paintComponent(g2d);
        wall = new WallImage(3 * s, 1 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(2 * s, 2 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(3 * s, 2 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(2 * s, 3 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(3 * s, 3 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(3 * s, 4 * s);
        wall.paintComponent(g2d);

        wall = new WallImage(3 * s, 7 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(2 * s, 7 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(3 * s, 8 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(3 * s, 9 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(4 * s, 7 * s);
        wall.paintComponent(g2d);

        wall = new WallImage(6 * s, 7 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(7 * s, 7 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(7 * s, 8 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(7 * s, 9 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(8 * s, 7 * s);
        wall.paintComponent(g2d);

        wall = new WallImage(7 * s, 1 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(7 * s, 2 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(8 * s, 2 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(8 * s, 3 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(7 * s, 3 * s);
        wall.paintComponent(g2d);
        wall = new WallImage(7 * s, 4 * s);
        wall.paintComponent(g2d);

        bg = new BarrierGrid(5 * s, 7 * s);
        bg.paintComponent(g2d);

        fire = new FireFloor(5 * s, 5 * s);
        fire.paintComponent(g2d);
        fire = new FireFloor(4 * s, 5 * s);
        fire.paintComponent(g2d);
        fire = new FireFloor(5 * s, 6 * s);
        fire.paintComponent(g2d);
        fire = new FireFloor(6 * s, 5 * s);
        fire.paintComponent(g2d);
        fire = new FireFloor(5 * s, 4 * s);
        fire.paintComponent(g2d);

        ic = new ICImage(2 * s, 1 * s);
        ic.paintComponent(g2d);
        ic = new ICImage(8 * s, 1 * s);
        ic.paintComponent(g2d);
        ic = new ICImage(2 * s, 9 * s);
        ic.paintComponent(g2d);
        ic = new ICImage(8 * s, 9 * s);
        ic.paintComponent(g2d);

        finf = new FinishFloor(5 * s, 9 * s);
        finf.paintComponent(g2d);

        WB = new WaterBoots(1 * s, 1 * s);
        WB.paintComponent(g2d);
        WB = new WaterBoots(9 * s, 1 * s);
        WB.paintComponent(g2d);
        WB = new WaterBoots(6 * s, 2 * s);
        WB.paintComponent(g2d);

        FB = new FireBoots(2 * s, 4 * s);
        FB.paintComponent(g2d);
        FB = new FireBoots(8 * s, 4 * s);
        FB.paintComponent(g2d);
        FB = new FireBoots(4 * s, 2 * s);
        FB.paintComponent(g2d);

        RB = new RemoveBoots(2 * s, 6 * s);
        RB.paintComponent(g2d);
        RB = new RemoveBoots(8 * s, 6 * s);
        RB.paintComponent(g2d);

    }

    @Override
    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }
}
