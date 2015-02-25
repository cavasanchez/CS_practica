/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uTools;

import java.awt.Point;
import java.awt.event.MouseEvent;
import uHotDrawFigures.uAbstractFigure;
import uHotDrawFigures.uPolylineFigure;
import uHotDrawFramework.uDrawingView;

/**
 *
 * @author oscar
 */
public class uPolylineCrationTool extends uCreationTool{

    uPolylineFigure polyline;
    
     public uPolylineCrationTool(uDrawingView view) {
        super(view);
    }
     
    public uPolylineFigure creationFigure(){
        return new uPolylineFigure();
    }
    
   public void mouseUp(MouseEvent e){
        Point p=new Point(e.getX(),e.getY());
        polyline.addPoint(p);
    }
    public void mouseDown(MouseEvent e){
        if (this.polyline==null){
            this.polyline=creationFigure();
            Point p=new Point(e.getX(),e.getY());
            this.polyline.addPoint(p);
            super.getView().getDrawing().add(this.polyline);
        }
    }

    public uPolylineFigure getPolyline() {
        return polyline;
    }

    public void setPolyline(uPolylineFigure polyline) {
        this.polyline = polyline;
    }
   
}

