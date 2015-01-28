/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Alex
 */
public class uElipseFigure extends uAbstractFigure {

    private uElipseFigure(Rectangle rectangle) {
        this.displayBox=rectangle;
    
    }

    @Override
    public void draw(Graphics el) {
        el.setColor(Color.blue);
        el.drawOval(displayBox.x, displayBox.y, displayBox.width, displayBox.height);

    }

    public uElipseFigure(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public uAbstractFigure clone() {
        uAbstractFigure clon = new uElipseFigure((Rectangle) this.displayBox.clone());
        return clon;
    
    }
    
}