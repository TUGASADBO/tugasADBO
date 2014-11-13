/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author i13026 i13011
 */
public class BarrierGrid extends JPanel{
    Image image;
    int x;
    int y;
    public BarrierGrid(int x, int y){
        String imageName = "barrier.png";
        ImageIcon icon = null;
        this.x=x;
        this.y=y;
        java.net.URL imgURL = getClass().getClassLoader().getResource(imageName);
        icon = new ImageIcon(imgURL);
        image = icon.getImage();
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.white);
        g.drawImage(image,x,y,this);
    }
}
