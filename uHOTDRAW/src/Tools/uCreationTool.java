package Tools;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import uHotDrawFigures.uAbstractFigure;
import uHotDrawFramework.uDrawingView;


public class uCreationTool implements Tool{

    public uAbstractFigure prototype;
    public uDrawingView v;

    public uAbstractFigure getPrototype() {
        return prototype;
    }

    public void setPrototype(uAbstractFigure prototype) {
        this.prototype = prototype;
    }
    public uCreationTool(){
        
    }

    public uCreationTool(uDrawingView v, uAbstractFigure prototype) {
        this.prototype = prototype;
        this.v = v;
    }

    public uDrawingView getV() {
        return v;
    }

    public void setV(uDrawingView v) {
        this.v = v;
    }
    

    public uAbstractFigure createFigure() throws CloneNotSupportedException {
        return (uAbstractFigure) prototype.clone();
    }

    @Override
    public void mouseDown(MouseEvent aEvent) {

    
    }

    @Override
    public void mouseUp(MouseEvent e) {
        try {
            uAbstractFigure f=createFigure();
            Rectangle r=f.getDisplayBox();
            Point p=new Point(e.getX()-r.x,e.getY()-r.y);
            f.moveBy(p.getX(), p.getY());
            this.getV().getDrawing().add(f);
          //  this.getV().repaint();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(uCreationTool.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void mouseMove(MouseEvent aEvent) {
        //System.out.print("Moviendo el raton sobre uCreationTool");
    }

    @Override
    public void mouseDrag(MouseEvent aEvent) {
        //System.out.println("Mouse Dragged");
    
    }
}
