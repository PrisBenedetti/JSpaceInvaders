/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspaceinvaders.view;

import jspaceinvaders.Media.Paths;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;


public class LevelView extends JPanel{
    
    private static final Image image;
    private JButton back;
    private JRadioButton easy;
    private JLabel easytext;
    private JRadioButton medium;
    private JRadioButton hard;
    public JButton startgame;
     ButtonGroup bg;
     
     static {
            image = Paths.loadImage("backButtonWhite.png");
        }
    
    public LevelView() {
        super(new BorderLayout());
        
        createTop();
        createCenter();
        createBot();
        this.setOpaque(false);
        
    }

    public void addStartGameActionListener (ActionListener Al){
        startgame.addActionListener(Al);
        
    }
    public void addBackButtonActionListener (ActionListener Al){
        back.addActionListener(Al);
    }
    
    public void addLevelDifficulActionListener (ActionListener Al){
        easy.addActionListener(Al);
        medium.addActionListener(Al);
        hard.addActionListener(Al);
    }

    private void createTop (){
        JPanel top = new JPanel();

        top.setOpaque(false);
        this.add(top, BorderLayout.NORTH);

    }
  
    private void createCenter(){
       JPanel center = new JPanel();
       bg = new ButtonGroup();
       this.easy = new JRadioButton("Easy");
       easy.setForeground(Color.WHITE);
       easy.setFont(new java.awt.Font("", Font.ITALIC, 12));
       this.medium = new JRadioButton ("Medium");
       medium.setForeground(Color.WHITE);
       medium.setFont(new java.awt.Font("", Font.ITALIC, 12));
       this.hard = new JRadioButton("Hard");
       hard.setForeground(Color.WHITE);
       hard.setFont(new java.awt.Font("", Font.ITALIC, 12));
       bg.add(easy);
       bg.add(medium);
       bg.add(hard);
       easy.setOpaque(false);
       medium.setOpaque(false);
       hard.setOpaque(false);
       
       this.startgame = new JButton("Start");
       center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));
       easy.setAlignmentX(CENTER_ALIGNMENT);
       medium.setAlignmentX(CENTER_ALIGNMENT);
       hard.setAlignmentX(CENTER_ALIGNMENT);
       startgame.setAlignmentX(CENTER_ALIGNMENT);
       center.add(javax.swing.Box.createVerticalGlue());
       center.add(easy);
       center.add(javax.swing.Box.createVerticalGlue());
       center.add(medium);
       center.add(javax.swing.Box.createVerticalGlue());
       center.add(hard);
       center.add(javax.swing.Box.createVerticalGlue());
       center.add(startgame);
       startgame.setEnabled(false);
       center.setOpaque(false);
       
       this.add (center, BorderLayout.CENTER);
       
  
    }
  
    private void createBot(){
       JPanel bottom = new JPanel();
       bottom.setPreferredSize(new Dimension(this.getWidth(),50));
       bottom.setSize(new Dimension(this.getWidth(),50));
        this.back = new JButton(){

           @Override
           protected void paintComponent(Graphics g) {
             
               super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
               
               g.drawImage(image, 0, 0, 50, 25, this);
             
               
           }
           
        };
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        back.setFocusPainted(false);
        back.setPreferredSize(new Dimension(50,25));
        back.setSize(new Dimension(50,25));
  
        bottom.setLayout(new BorderLayout());
        bottom.add(back, BorderLayout.SOUTH);
        bottom.setBorder(new EmptyBorder(0, 10, 10, 0));
        bottom.setOpaque(false);
        
      
       this.add(bottom, BorderLayout.SOUTH);
  
    }
    
}
