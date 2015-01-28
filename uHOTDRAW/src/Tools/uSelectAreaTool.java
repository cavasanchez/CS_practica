/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import uHotDrawFigures.uAbstractFigure;
import uHotDrawFigures.uRectangleFigure;
import uHotDrawFramework.uDrawingView;

/**
 *
 * @author Portátil
 */
public class uSelectAreaTool implements Tool 
{ 
 uDrawingView v;
 uRectangleFigure rf; 
 public uSelectAreaTool(uDrawingView dv){ 
 v=dv; 
 } 
 public void mouseDown(MouseEvent e){ 
 rf=new uRectangleFigure(e.getX(),e.getY(),0,0); 
 v.getDrawing().add(rf); 
 } 
 public void mouseUp(MouseEvent e){ 
 v.getDrawing().remove(rf);
 v.clearSelection();

     System.out.println("Pene-");
 
 v.getDrawing().addFigures(rf.getDisplayBox());
// ArrayList <uAbstractFigure> aux;
// aux = v.getDrawing().findFigures(rf.getDisplayBox());
// if (aux !=null){
//     System.out.println("He encontrado figuras en el area");
//    for (int i =0 ; i<aux.size(); i++){
//        v.addToSelection(aux.get(i));       
//        }        
//    } else {
//     System.out.println("NO HAY FIGURAS");
//     
// }
// 
 
    
 } 
 public void mouseDrag(MouseEvent e){ 
 int rx=rf.getDisplayBox().x; 
 int ry=rf.getDisplayBox().y; 
 int w=e.getX()-rx; 
 int h=e.getY()-ry; 
 rf.setSize(w,h); 
 } 
 public void mouseMove(MouseEvent e){ 
 } 
}