/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspaceinvaders.Main;

import jspaceinvaders.controller.StartController;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class MasterController  {
   private JFrame window;
   private GenericController currentController;
   public static final int WINDOW_WIDTH = 640;
   public static final int WINDOW_HEIGHT = 400;

    public MasterController(JFrame window) {
        this.window = window;
    }
    public void showWindow(){
        window.setVisible(true);
    }
    public void showController (GenericController cc){
        Container contPane = window.getContentPane();
        
        if (currentController != null){
            contPane.remove(currentController.getView());
            currentController.setMasterController(null);
        }
        contPane.add(cc.getView(), BorderLayout.CENTER);
        contPane.validate();
        
        
        currentController = cc;
        cc.setMasterController(this);
        
    }
    
    /*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				JFrame window = new JFrame("Space Invaders");
              
                                window.getContentPane().setPreferredSize(new Dimension(400, 600));
                                window.setResizable(false);
                                window.setLocation(20, 20);
                                
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				Dimension screenBounds = Toolkit.getDefaultToolkit().getScreenSize();
				window.setBounds((screenBounds.width - WINDOW_WIDTH)/2, (screenBounds.height - WINDOW_HEIGHT)/2, WINDOW_WIDTH, WINDOW_HEIGHT);

				MasterController mc = new MasterController(window);

				GenericController gc1 = new StartController();
                               

				mc.showController(gc1);

                                window.pack();
                                
				mc.showWindow();
			}

		});
	}*/
    
}
