package Pruebas;

import java.awt.Dimension;
import java.awt.Point;
import uHotDrawFigures.uBorderDecoratorFigure;
import uHotDrawFigures.uElipseFigure;
import uHotDrawFigures.uRectangleFigure;
import uHotDrawFramework.uDrawing;
import uHotDrawFramework.uDrawingEditor;
import uHotDrawFramework.uDrawingView;
import Tools.uPolylineCreationTool;
import Tools.uPolylineFigure;
import javax.swing.JFrame;

public class principal {

    public static void main(String[] args) {
        uDrawingView v; 
        uDrawing d = new uDrawing();
//        uRectangleFigure f1 = new uRectangleFigure(10, 10, 30, 30);
//        uElipseFigure f2 = new uElipseFigure(50, 50, 60, 60);
//        uBorderDecoratorFigure f3 = new uBorderDecoratorFigure(f2);
//        f3.moveBy(300, 300);
        uDrawingEditor e = new uDrawingEditor();
        uPolylineFigure pol = new uPolylineFigure();
        
        v = e.getV();
//        d.add(f1);
//        d.add(f2);
//        d.add(f3);
        d.add(pol);
        v.setDrawing(d);
        v.setPreferredSize(new Dimension(320, 240));
        /*e.setV(v);*/
        e.setVisible(true);
        e.pack();
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
