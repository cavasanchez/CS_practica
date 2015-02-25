package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class uBorderDecoratorFigure extends uDecoratorFigure{
    @Override
    public void draw(Graphics g){
        super.draw(g);
        g.setColor(Color.CYAN);
        g.drawRect((int)innerFigure.displayBox.getX(),
                (int)innerFigure.displayBox.getY(),
                (int)innerFigure.displayBox.getWidth(), 
                (int)innerFigure.displayBox.getHeight());
 }

}
