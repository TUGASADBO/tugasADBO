/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import gui.Map;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author i13026 i13011
 */
public class controller {
    public static void main(String[] args) {
        JFrame f = new JFrame("Chip's Challenge");
        Map map = new Map();
        f.getContentPane().add("Center", map);
        f.pack();
        f.setSize(new Dimension(960,640));
        f.setVisible(true);
    }
}
