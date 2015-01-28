/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uHotDrawFigures;

import java.awt.Graphics;

/**
 *
 * @author Alex
 */
public class uDecoratorFigure extends uAbstractFigure{
    
    public uAbstractFigure innerFigure;
    
    @Override
    public void draw(Graphics g) {
        innerFigure.draw(g);
    }
    /**
     *
     * @param figura
     */
    public uDecoratorFigure(uAbstractFigure figura) {
        innerFigure=figura;
    }

    @Override
    public uAbstractFigure clone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
