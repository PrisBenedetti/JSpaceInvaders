/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspaceinvaders.view;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;


public class StartView extends JPanel{
 private JButton start;
 private JButton load;
 private JButton best_score;
 
   public StartView() {
        super(new BorderLayout());
        createTop();
        createCenter();
        createBottom();
        this.setOpaque(false);
    }
    
  public void addStartButtonListener(ActionListener al) {
        start.addActionListener(al);
    }
  
  public void addLoadButtonListener(ActionListener al){}
    
  public void addBestScoreButtonListener(ActionListener al){
        best_score.addActionListener(al);
    }
    
     private void createTop (){
        JPanel top = new JPanel();

        top.setOpaque(false);
        this.add(top, BorderLayout.NORTH);

    }
  private void createBottom(){
       JPanel bottom = new JPanel();
       bottom.setOpaque(false);
       this.add(bottom, BorderLayout.SOUTH);
       
   }
 
    private void createCenter(){
       JPanel center = new JPanel();
       this.start = new JButton("start");
       this.load = new JButton("load");
       this.best_score = new JButton("best score");
       center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));
       start.setAlignmentX(CENTER_ALIGNMENT);
       best_score.setAlignmentX(CENTER_ALIGNMENT);
       load.setAlignmentX(CENTER_ALIGNMENT);
       center.add(javax.swing.Box.createVerticalGlue());
       center.add(start);
       center.add(javax.swing.Box.createVerticalGlue());
       center.add(load);
       center.add(javax.swing.Box.createVerticalGlue());
       center.add(best_score);
       center.setOpaque(false);
       
       this.add (center, BorderLayout.CENTER);
       
       
   }
    

    
}
    
    
    
    
    

 
 
    

