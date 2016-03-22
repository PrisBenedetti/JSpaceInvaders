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
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class Cannon{
        private static final int lifeCannon = 3;
        private static final int ROWS = 8;
	private static final int COLUMNS = 8;
        private static final Point[] pointsCannon0 = {new Point(7,3), new Point(7,4),new Point(4,5), new Point(5,5), new Point(6,5), new Point(7,5),
                                                new Point(0,6), new Point(1,6), 
                                                new Point(2,6), new Point(3,6),new Point(4,6), new Point(5,6),
                                                new Point(6,6), new Point(7,6), new Point(0,7), new Point(1,7),
                                                new Point(2,7), new Point(3,7),
                                                new Point(4,7), new Point(5,7), new Point(6,7), new Point(7,7)};
          private static final Point[] pointsCannon1 = {new Point(0,3), new Point(0,4),new Point(0,5), new Point(1,5), new Point(2,5), new Point(3,5),
                                                new Point(0,6), new Point(1,6), 
                                                new Point(2,6), new Point(3,6),new Point(4,6), new Point(5,6),
                                                new Point(6,6), new Point(7,6), new Point(0,7), new Point(1,7),
                                                new Point(2,7), new Point(3,7),
                                                new Point(4,7), new Point(5,7), new Point(6,7), new Point(7,7)};                                      
                                                
        
    	private static int width;
	private static int height;
	private static int xUnit;
	private static int yUnit;
        private static Rectangle2D.Double rect;
        
      
	
	
	
	/*private void printUnits(){
		System.out.println(xUnit);
		System.out.println(yUnit);
		System.out.println(getWidth());
		System.out.println(getHeight());
	}*/

        
        public static void paintCannon0(Graphics2D g2d, int x, int y, int cellWidth, int cellHeight) {
           Point[] array0 = pointsCannon0;
           g2d.setColor(Color.red);
           
            for(int i=0; i<array0.length; i++){
                rect.setRect(array0[i].getX()*cellWidth + x, array0[i].getY()*cellHeight+ y, cellWidth, cellHeight);
		g2d.draw(rect);
		g2d.fill(rect);
            }
        }
        
        public static void paintCannon1(Graphics2D g2d, int x, int y, int cellWidth, int cellHeight) {
            Point[] array1 = pointsCannon1;
           g2d.setColor(Color.red);
           
            for(int i=0; i<array1.length; i++){
                rect.setRect(array1[i].getX()*cellWidth + x, array1[i].getY()*cellHeight+ y, cellWidth, cellHeight);
		g2d.draw(rect);
		g2d.fill(rect); 
        }
	}
    
}
