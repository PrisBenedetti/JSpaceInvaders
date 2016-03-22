/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspaceinvaders.view;

//import jspaceinvaders.Model.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
//import javax.swing.Timer;
import javax.swing.JPanel;

public class GameBoard extends JPanel {
        public static final int ROWSBOARD=20;
	public static final int COLUMNSBOARD=20;
        private static int width;
	private static int height;
	private static int xUnit;
	private static int yUnit;
        private static GameBoard gameboard;
	private static Rectangle2D.Double rect;
        private static int alien=0;
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
          private static final Point[] pointsBarrier0 = {new Point(0,0), new Point(1,0),new Point(2,0), new Point(3,0), new Point(4,0), new Point(5,0),new Point(6,0), new Point(7,0),
                                                 
                                               
                                                new Point(0,1), new Point(1,1), new Point(2,1), new Point(3,1), new Point(4,1), new Point(5,1), new Point(6,1), new Point(7,1),
                                                
                                                new Point(0,2), new Point(1,2), new Point(2,2), new Point(3,2), new Point(4,2), new Point(5,2), new Point(6,2), new Point(7,2),
                                                 
                                                new Point(0,3), new Point(1,3),new Point(2,3), new Point(3,3), new Point(4,3), new Point(5,3),new Point(6,3), new Point(7,3), 
                                                new Point(0,4), new Point(1,4),new Point(2,4), new Point(3,4),
                                                new Point(0,5), new Point(1,5), new Point(2,5), new Point(3,5),
                                                new Point(0,6), new Point(1,6),
                                                new Point(0,7), new Point(1,7)};
        private static final Point[] pointsBarrier1 = {new Point(0,0), new Point(1,0),new Point(2,0), new Point(3,0), new Point(4,0), new Point(5,0),new Point(6,0), new Point(7,0),
                                                 
                                               
                                                new Point(0,1), new Point(1,1), new Point(2,1), new Point(3,1), new Point(4,1), new Point(5,1), new Point(6,1), new Point(7,1),
                                                
                                                new Point(0,2), new Point(1,2), new Point(2,2), new Point(3,2), new Point(4,2), new Point(5,2), new Point(6,2), new Point(7,2),
                                                 
                                                new Point(0,3), new Point(1,3),new Point(2,3), new Point(3,3), new Point(4,3), new Point(5,3),new Point(6,3), new Point(7,3), 
                                                new Point(4,4), new Point(5,4),new Point(6,4), new Point(7,4),
                                                new Point(4,5), new Point(5,5), new Point(6,5), new Point(7,5),
                                                new Point(6,6), new Point(7,6),
                                                new Point(6,7), new Point(7,7)};
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
        
       public GameBoard(){
		super();
		setLayout(null);
		rect = new Rectangle2D.Double();
                setBackground(Color.BLACK);
               
        }
	private void updateUnits(){
		width = this.getWidth();
		height = this.getHeight();
		xUnit = (int)width/COLUMNSBOARD;
		yUnit = (int)height/ROWSBOARD;
	}
        /*private void printUnits(){
		System.out.println(xUnit);
		System.out.println(yUnit);
		System.out.println(getWidth());
		System.out.println(getHeight());
	}*/
        
    @Override
	protected void paintComponent(Graphics g) {
                
		super.paintComponent(g);
		updateUnits();
                System.out.println(xUnit);
                System.out.println(yUnit);
                System.out.println(alien);
                System.out.println(getWidth());
		System.out.println(getHeight());
		Graphics2D g2d = (Graphics2D) g;
                for(int i=2; i<7; i++){
                    for(int j=5; j<15; j++){
                        if (i==2) alien = 0;
                        if(i==3||i==4)
                                alien = 1;
                        if(i==5||i==6)
                                alien =2;
                        paintAlien(g2d, j*xUnit, i*yUnit, xUnit/10, yUnit/10, alien);
                    }
                }
                int i = 16;
                for(int j=2; j<COLUMNSBOARD; j++){
                    if(j==2||j==9||j==16){
                     paintBarrier0(g2d, j*xUnit, i*yUnit, xUnit/7, yUnit/7);
                    }
                    if(j==3||j==10||j==17){
                               paintBarrier1(g2d, j*xUnit, i*yUnit, xUnit/7, yUnit/7);
                               j+=5;
                     }
                }
                paintCannon0(g2d, 5*xUnit, 19*yUnit, xUnit/7, yUnit/7);
                paintCannon1(g2d, 6*xUnit, 19*yUnit, xUnit/7, yUnit/7);
            
                
        }
    private void paintAlien(Graphics2D g2d, int x, int y, int cellWidth, int cellHeight, int alien) {
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
    private void paintBarrier0(Graphics2D g2d, int x, int y, int cellWidth, int cellHeight) {
           Point[] array0 = pointsBarrier0;
           g2d.setColor(Color.yellow);
           
            for(int i=0; i<array0.length; i++){
                rect.setRect(array0[i].getX()*cellWidth + x, array0[i].getY()*cellHeight+ y, cellWidth, cellHeight);
		g2d.draw(rect);
		g2d.fill(rect);
            }
        }
        
        private void paintBarrier1(Graphics2D g2d, int x, int y, int cellWidth, int cellHeight) {
            Point[] array1 = pointsBarrier1;
           g2d.setColor(Color.yellow);
           
            for(int i=0; i<array1.length; i++){
                rect.setRect(array1[i].getX()*cellWidth + x, array1[i].getY()*cellHeight+ y, cellWidth, cellHeight);
		g2d.draw(rect);
		g2d.fill(rect); 
        }
	}
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
