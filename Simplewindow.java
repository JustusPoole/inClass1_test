/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass1test;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author justus.poole483
 */
public class Simplewindow extends JFrame
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    public Simplewindow()
    {
        setSize(WIDTH,HEIGHT);
        Container contentPane = getContentPane();
        JLabel label = new JLabel
        ("You can display text using a label.");
        contentPane.add(label);
        contentPane.setBackground(Color.GREEN);
        addWindowListener(new Windowdestroyer());
    }
    public static void main(String[] args)
    { 
        Simplewindow window = new Simplewindow(); 
        window.setVisible(true); 
    } 
}
