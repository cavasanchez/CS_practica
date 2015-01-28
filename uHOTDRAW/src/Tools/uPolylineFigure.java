package Tools;

import java.awt.Graphics;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import uHotDrawFigures.uAbstractFigure;
import uHotDrawFigures.uRectangleFigure;

public class uPolylineFigure extends uAbstractFigure {
    
    List<Point> puntos;

    public uPolylineFigure() {
        puntos = new ArrayList<>();
    }
    
    public void addPunto(Point punto){
        puntos.add(punto);        
    }
    
    @Override
    public void draw(Graphics dibujo){
            for (int i=0; i<puntos.size()-1; i++){
                dibujo.drawLine(puntos.get(i).x, puntos.get(i).y, puntos.get(i+1).x, puntos.get(i+1).y);
            }
        }
    
    @Override
    public uAbstractFigure clone() {   
        return null;
    
    }
    
}
