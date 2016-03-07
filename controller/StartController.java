/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspaceinvaders.controller;

//import BestScore.BestScoresController;
//import Game.GameController;
import javax.swing.JPanel;
import jspaceinvaders.Main.GenericController;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import jspaceinvaders.view.DecoView;
import jspaceinvaders.view.LevelView;
import jspaceinvaders.view.StartView;

public class StartController extends GenericController {

    private final DecoView decoview;
    private final StartView startview;
    private final LevelView levelview;
    
    public StartController() {
      this.decoview = new DecoView();
      this.startview = new StartView();
      this.levelview = new LevelView();
      
      decoview.add(startview, BorderLayout.CENTER);
      
      startview.addStartButtonListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
              decoview.remove(startview);
              decoview.add(levelview, BorderLayout.CENTER);
              decoview.validate();
              decoview.repaint();
              
            }
      });
      
      
      
      startview.addBestScoreButtonListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
          
             // BestScoresController Bsc = new BestScoresController();
              //getMasterController().showController(Bsc);
              
          }
      });
      
      levelview.addBackButtonActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
              levelview.startgame.setEnabled(false);
              decoview.remove(levelview);
              decoview.add(startview, BorderLayout.CENTER);
              decoview.validate();
              decoview.repaint();
              
              }
      });
        
      /*levelview.addStartGameActionListener(new ActionListener() {

         @Override
       
          public void actionPerformed(ActionEvent e) {
              String difficulty = getSelectedButtonText(levelview.bg);
              System.out.println(""+difficulty);
             // String imgPath ="/Users/alessiomac/Documents/BrickBreak/immagini/";
               String imgPath ="./immagini/";
              GameController gC = new GameController(400, 600, 20, 10, imgPath, difficulty);
              
              getMasterController().showController(gC);
              
               }
      });*/
        
      levelview.addLevelDifficulActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
          
              levelview.startgame.setEnabled(true);
              
          }
      });
        
        
    }
    
    @Override
    public JPanel getView() {
        return decoview;
    }
    
     public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    
}

