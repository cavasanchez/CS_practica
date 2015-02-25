package com.mycompany.mavenproject1;


import java.awt.Dimension;
import java.awt.Point;
import uHotDrawFigures.uBorderDecoratorFigure;
import uHotDrawFigures.uEllipseFigure;
import uHotDrawFigures.uPolylineFigure;
import uHotDrawFigures.uRectangleFigure;
import uHotDrawFramework.uDrawing;
import uHotDrawFramework.uDrawingEditor;
import uHotDrawFramework.uDrawingView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class main {
    public static void main(String args[]){
        
        uDrawing d=new uDrawing();
        uRectangleFigure f1=new uRectangleFigure();
        uEllipseFigure f2=new uEllipseFigure();
        uBorderDecoratorFigure f4 = new uBorderDecoratorFigure();
        f2.displayBox.setBounds(80, 80, 60, 60);
        f1.displayBox.setBounds(10, 10, 30, 30);
        f4.setInnerFigure(f2);
        d.add(f1);
        d.add(f2);
        d.add(f4);
        uDrawingEditor e=new uDrawingEditor();
        uDrawingView v =e.getDrawingview();
        v.setDrawing(d);
        v.setPreferredSize(new Dimension(320,240));
      
    
        e.setVisible(true);
        e.pack();
        
    }
}
