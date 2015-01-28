
package uHotDrawFigures;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import uHotDrawFigures.IFigure;
import uHotDrawFigures.uAbstractFigure;


public class uCompositeFigure extends uAbstractFigure {

    public List<uAbstractFigure> figures;   //List es el objeto colección

    public uCompositeFigure() {
        this.figures = new ArrayList<uAbstractFigure>();
    }

    public Collection<uAbstractFigure> getFigures() {
        return figures;
    }

    public void add(uAbstractFigure figura) {
        this.figures.add(figura);
    }

    public void remove(uAbstractFigure figura) {
        this.figures.remove(figura);
    }

    @Override
    public void draw(Graphics g) {
        for (IFigure f : figures) { //Hasta que no haya final continua
            f.draw(g);
        }
    }

    public uCompositeFigure(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public uAbstractFigure clone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}