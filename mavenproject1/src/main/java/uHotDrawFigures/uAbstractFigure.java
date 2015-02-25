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
public class uAbstractFigure implements iFigure{
    
    public Rectangle displayBox;

    public uAbstractFigure() {
        this.displayBox = new Rectangle(20,20,30,30);
    }
    public uAbstractFigure(int x, int y, int altura, int anchura){
        this.displayBox=new Rectangle(x,y,altura,anchura);
    }
    
    public void draw(Graphics g){
        g.setColor(Color.YELLOW);
        g.drawOval(this.displayBox.x,this.displayBox.y,
                this.displayBox.width,this.displayBox.height);   
    }

    public Rectangle getDisplayBox() {
        return displayBox;
    }

    public void setDisplayBox(Rectangle displayBox) {
        this.displayBox = displayBox;
    }
    
    public void moveBy(double x, double y) {
        this.displayBox.translate((int)x, (int)y);
    }
    
    public boolean containsPoint(double x,double y){
        return this.displayBox.contains(x, y);
    }
    
    @Override
    public uAbstractFigure clone(){
       uAbstractFigure clon=new uAbstractFigure();
       clon.setDisplayBox(this.displayBox);
       return clon;
                
    }
}
