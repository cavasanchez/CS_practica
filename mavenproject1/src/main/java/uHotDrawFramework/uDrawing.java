/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotDrawFramework;

import java.util.ArrayList;
import uHotDrawFigures.uCompositeFigure;

/**
 *
 * @author oscar
 */
public class uDrawing extends uCompositeFigure{
    
    protected ArrayList<uCompositeFigure> figuras;
    
public uDrawing(){
    super();
    figuras=new ArrayList<uCompositeFigure>();
    System.out.print(this);
}
}
