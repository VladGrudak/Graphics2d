/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Mikhail
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewJFrame frame = new NewJFrame();
        frame.setVisible(true);
    }

    public void draw(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setColor(Color.orange);
        gr2d.fillRect(21, 41, 179, 119);
    }

}
