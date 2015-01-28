/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.awt.event.MouseEvent;
import uHotDrawFigures.uAbstractFigure;
import uHotDrawFramework.uDrawingView;

/**
 *
 * @author Portátil
 */
public class uSelectionTool implements Tool{ 
 
private uDrawingView v; 
private Tool fChild; 
 public uSelectionTool(uDrawingView v1){ 
    v=v1; 
 } 
 public uAbstractFigure findFigure(int x,int y){ 
    return v.getDrawing().findFigure(x,y); 
 } 
 public void mouseDown(MouseEvent e){ 
 uAbstractFigure figure=findFigure(e.getX(),e.getY()); 
 if(figure!=null){ 
     System.out.println("BBBBBINNNNNNNGOOOOOOOOOOO!!!");
 fChild=new uDragTool(v,figure); 
 } else{ 
     System.out.println("Voy a SelectArea");
 fChild=new uSelectAreaTool(v); 
 } 
 fChild.mouseDown(e); 
 } 
 public void mouseUp(MouseEvent e){ 
 fChild.mouseUp(e); 
 } 
 public void mouseDrag(MouseEvent e){ 
 fChild.mouseDrag(e); 
 } 
 public void mouseMove(MouseEvent e){ 
 } 
}