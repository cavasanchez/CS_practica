package Tools;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import uHotDrawFigures.uAbstractFigure;
import uHotDrawFramework.uDrawingView;


public class uPolylineCreationTool extends uCreationTool {
    protected uPolylineFigure polyline;
    public uDrawingView v;

    public uPolylineCreationTool() {
    }

    public uPolylineCreationTool(uDrawingView v, uAbstractFigure prototype) {
        super(v, prototype);
    }
    
    
    
    @Override
    public uAbstractFigure createFigure() {
        uPolylineFigure figura = new uPolylineFigure();
//        Point p1 = new Point(20, 30);
//        Point p2 = new Point(140, 45);
//        Point p3 = new Point(57, 12);
//        Point p4 = new Point(80, 320);
//        figura.addPunto(p1);
//        figura.addPunto(p2);
//        figura.addPunto(p3);
//        figura.addPunto(p4);
        return figura;
    }
    
    @Override
    public void mouseDown(MouseEvent e) {
        if (this.polyline==null){
            this.polyline=(uPolylineFigure) createFigure();
            this.polyline.addPunto(new Point(e.getX(),e.getY()));
            uDrawingView v =  this.getV();
            v.getDrawing().add(this.polyline);
        } else {
            this.polyline.addPunto(new Point(e.getX(),e.getY()));
        }
    }

    @Override
    public void mouseUp(MouseEvent e) {
//            uAbstractFigure f=createFigure();
//            Rectangle r=f.getDisplayBox();
//            Point p=new Point(e.getX(),e.getY());
//            f.moveBy(p.getX(), p.getY());
//            this.getV().getDrawing().add(f);
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
