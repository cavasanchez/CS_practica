/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotDrawFigures;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.applet.Applet;
import java.applet.AudioClip;
import java.beans.Beans;

/**
 *
 * @author oscar
 */
public class uDecoratorFigure extends uAbstractFigure{
    
    protected uAbstractFigure innerFigure;
    
    public void draw(Graphics g){
        innerFigure.draw(g);
 }

    public uAbstractFigure getInnerFigure() {
        return innerFigure;
    }

    public void setInnerFigure(uAbstractFigure innerFigure) {
        this.innerFigure = innerFigure;
    }

    public Rectangle getDisplayBox() {
        return displayBox;
    }

    public void setDisplayBox(Rectangle displayBox) {
        this.displayBox = displayBox;
    }
}
