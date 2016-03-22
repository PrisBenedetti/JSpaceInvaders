/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspaceinvaders.Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;



public class Alien{
	
       
	private static final int ROWS = 8;
	private static final int COLUMNS = 8;
        private static final Point[] pointsAlien0 = {new Point(3,0), new Point(4,0),
                                                 new Point(2,1), new Point(3,1), new Point(4,1), new Point(5,1),
                                                new Point(1,2), new Point(2,2), new Point(3,2), new Point(4,2), new Point(5,2), new Point(6,2),
                                                new Point(0,3), new Point(1,3), new Point(3,3), new Point(4,3), new Point(6,3), new Point(7,3),
                                                new Point(0,4), new Point(1,4), new Point(2,4), new Point(3,4), new Point(4,4), new Point(5,4), new Point(6,4), new Point(7,4),
                                                new Point(1,5), new Point(3,5), new Point(4,5), new Point(6,5),
                                                new Point(0,6), new Point(7,6), 
                                                new Point(1,7), new Point(6,7)};
        
         private static final Point[] pointsAlien1 = {new Point(1,0), new Point(6,0),
                                                 new Point(2,1), new Point(5,1),
                                                new Point(0,2), new Point(3,2), new Point(4,2), new Point(7,2),
                                                new Point(0,3), new Point(2,3), new Point(3,3), new Point(4,3), new Point(5,3), new Point(7,3),
                                                new Point(0,4), new Point(1,4),  new Point(3,4), new Point(4,4), new Point(6,4), new Point(7,4),
                                                new Point(1,5), new Point(2,5), new Point(3,5), new Point(4,5), new Point(5,5), new Point(6,5),
                                                new Point(1,6), new Point(6,6), 
                                                new Point(2,7), new Point(5,7)};
         
          private static final Point[] pointsAlien2 = {new Point(1,0), new Point(6,0),
                                                 new Point(2,1), new Point(3,1), new Point(4,1), new Point(5,1),
                                                new Point(1,2), new Point(2,2), new Point(3,2), new Point(4,2), new Point(5,2), new Point(6,2),
                                                new Point(0,3), new Point(1,3), new Point(3,3), new Point(4,3), new Point(6,3), new Point(7,3),
                                                new Point(0,4), new Point(1,4), new Point(2,4), new Point(3,4), new Point(4,4), new Point(5,4), new Point(6,4), new Point(7,4),
                                                new Point(2,5), new Point(5,5),
                                                new Point(1,6), new Point(3,6), new Point(4,6), new Point(6,6), 
                                                new Point(0,7), new Point(2,7), new Point(5,7), new Point(7,7)};
	
	private static int width;
	private static int height;
	private static int xUnit;
	private static int yUnit;
        //private static Alien alien;
	private static Rectangle2D.Double rect;
        
      

	
	private void printUnits(){
		System.out.println(xUnit);
		System.out.println(yUnit);
	
	}

        
        public static void paintAlien(Graphics2D g2d, int x, int y, int cellWidth, int cellHeight, int alien) {
           Point[] array = pointsAlien0;
            if(alien == 0){
           g2d.setColor(Color.magenta);}
           else if(alien == 1){
               array = pointsAlien1;
               g2d.setColor(Color.cyan);
           }
           else if(alien == 2){
               array = pointsAlien2;
               g2d.setColor(Color.green);
           }
            for(int i=0; i<array.length; i++){
                rect.setRect(array[i].getX()*cellWidth + x, array[i].getY()*cellHeight+ y, cellWidth, cellHeight);
		g2d.draw(rect);
		g2d.fill(rect);
            }
            
	}

        



}