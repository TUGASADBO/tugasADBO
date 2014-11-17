/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author RICKY
 */
public class FireBoots extends JPanel {

    Image image;
    int x;
    int y;

    public FireBoots(int x, int y) {
        String imageName = "FireBoots.png";
        ImageIcon icon = null;
        this.x = x;
        this.y = y;
        java.net.URL imgURL = getClass().getClassLoader().getResource(imageName);
        icon = new ImageIcon(imgURL);
        image = icon.getImage();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.drawImage(image, x, y, this);
    }

}
