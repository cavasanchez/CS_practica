/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.applet.Applet;
import java.applet.AudioClip;
import java.beans.Beans;
/**
 *
 * @author oscar
 */
public class uRectangleFigure extends uAbstractFigure {

    public uRectangleFigure(){
        super();
    }
    
    public uRectangleFigure(int x, int y, int altura, int anchura) {
        super(x,y,altura,anchura);
    }
    @Override
    public void draw(Graphics g){
        g.setColor(Color.GREEN);
        g.drawRect(this.displayBox.x,this.displayBox.y,
                this.displayBox.width,this.displayBox.height);
    }
    
    public uAbstractFigure clone(){
       uRectangleFigure clon=new uRectangleFigure();
       clon.setDisplayBox((Rectangle)this.displayBox.clone());
       return clon;
    }
}
