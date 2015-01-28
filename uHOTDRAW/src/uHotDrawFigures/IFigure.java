/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uHotDrawFigures;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Alex
 */
public interface IFigure extends Cloneable{
    
    /**
     *
     * @param objeto
     */
    public void draw(Graphics objeto);
    public void setDisplayBox(Rectangle displayBox);
    public void moveBy(double dx, double dy);
    public boolean containsPoint(double x, double y);
}
