/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uTools;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import uHotDrawFigures.uAbstractFigure;
import uHotDrawFramework.uDrawingView;

/**
 *
 * @author oscar
 */
public class uCreationTool extends uAbstractTool{

    private uAbstractFigure prototype;

    public uCreationTool(uDrawingView view){
        super.setView(view);
    }
    
    public uCreationTool(uDrawingView vista, uAbstractFigure figure) {
        super.setView(vista);
        this.setPrototype(figure);
    }

    public uAbstractFigure creationFigure() {
        return prototype.clone();
    }

    public uAbstractFigure getPrototype() {
        return prototype;
    }

    public void setPrototype(uAbstractFigure prototype) {
        this.prototype = prototype;
    }
    
    @Override
    public void mouseDrag(MouseEvent aEvent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseUp(MouseEvent e) {
        uAbstractFigure figure = creationFigure();
        Rectangle rectangle = figure.getDisplayBox();
        Point p = new Point(e.getX() - rectangle.x, e.getY() - rectangle.y);
        figure.moveBy(p.getX(), p.getY());
        super.getView().getDrawing().add(figure);
    }

    @Override
    public void mouseMove(MouseEvent aEvent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDown(MouseEvent aEvent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
