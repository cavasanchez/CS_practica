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
public class uBorderDecoratorFigure extends uDecoratorFigure {

    public uBorderDecoratorFigure(uAbstractFigure figura) {
        super(figura);
    }

    @Override
    public void draw(Graphics g) {
        Rectangle r = innerFigure.getDisplayBox();
        super.draw(g);
        g.drawRect(r.x, r.y, r.width, r.height);
    }
}
