/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspaceinvaders.view;

import jspaceinvaders.Media.Paths;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class DecoView extends JPanel{
    private static final Image image;
    
   
    public DecoView() {
        super(new BorderLayout());
        
      
    }
    
    static{
        image = Paths.loadImage("sfondospace.png");
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
    
    
}