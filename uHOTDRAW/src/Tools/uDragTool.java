/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import uHotDrawFigures.uAbstractFigure;
import uHotDrawFramework.uDrawingView;

/**
 *
 * @author Portátil
 */
public class uDragTool implements Tool{
    
 private uDrawingView v; 
 private uAbstractFigure figure; 
 
 public uDragTool(uDrawingView dv,uAbstractFigure f){ 
 v=dv; 
 figure=f; 
 } 
 public void mouseDown(MouseEvent e){ 
 } 
 public void mouseUp(MouseEvent e){ 
 } 
 public void mouseDrag(MouseEvent e){ 
 Rectangle r=figure.getDisplayBox(); 
 Point p=new Point(e.getX()-r.x,e.getY()-r.y); 
 figure.moveBy(p.x,p.y); 
 } 
 public void mouseMove(MouseEvent e){ 
 }
    
}
