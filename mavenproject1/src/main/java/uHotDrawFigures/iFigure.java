/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotDrawFigures;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author oscar
 */
public interface iFigure {
    public void draw(Graphics obj);
    public boolean containsPoint(double x,double y);
    public void moveBy(double dx, double dy);
    public Rectangle getDisplayBox();
    public void setDisplayBox(Rectangle displaybox);
    public uAbstractFigure clone(); 
}
