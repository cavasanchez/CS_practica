/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author oscar
 */
public class uEllipseFigure extends uAbstractFigure {
    
    public uEllipseFigure(){
        super();
    }
    public uEllipseFigure (int x, int y, int altura, int anchura){
        super(x,y,altura,anchura);
    }
    
    @Override
    public void draw (Graphics g){
        g.setColor(Color.DARK_GRAY);
        g.drawOval(this.displayBox.x,this.displayBox.y,
                this.displayBox.width,this.displayBox.height);
    }
    
    @Override
    public uAbstractFigure clone(){
       uEllipseFigure clon=new uEllipseFigure();
       clon.setDisplayBox((Rectangle)this.displayBox.clone());
       return clon;
    }
}
