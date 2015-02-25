/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author oscar
 */
public class uPolylineFigure extends uAbstractFigure{
    
    private ArrayList<Point> puntos;

    public uPolylineFigure() {
        puntos = new ArrayList();
    }

    public void draw(Graphics grafico) {
        int x;
        grafico.setColor(Color.RED);
        for(x=0; x<puntos.size()-1;x++){ 
            grafico.drawLine((int)this.puntos.get(x).getX(),
                    (int)this.puntos.get(x).getY(),
                    (int)this.puntos.get(x+1).getX() ,
                    (int)this.puntos.get(x+1).getY());
        }
    }

    public void addPoint(Point p) {
        puntos.add(p);
    }

    public boolean containsPoint(double x, double y) {
        boolean contains=false;
        Point p;
        Iterator <Point> it=this.puntos.iterator();
        while((it.hasNext())&&(!contains)){
            p=it.next();
            contains=((p.getX()==x)&&(p.getY()==y));
          }
          return contains;
    }

    public void moveBy(double x, double y) {
        for(Point p: this.puntos){
            p.move((int)x +(int) p.getX(),(int)y+ (int)p.getY());
        }
    }
}
