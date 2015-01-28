package uHotDrawFramework;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import uHotDrawFigures.uAbstractFigure;
import uHotDrawFigures.uCompositeFigure;
import uHotDrawFigures.uRectangleFigure;

public class uDrawing extends uCompositeFigure {

    public uDrawing() {
        super();
    }

    public uAbstractFigure findFigure(int x, int y) {
        System.out.println("Busco figura");
        uAbstractFigure f = null;

        for (int i = 0; i < this.figures.size(); i++) {

            if ((this.figures.get(i).getDisplayBox().getX() == x) && (this.figures.get(i).getDisplayBox().getY() == y)) {
                System.out.println("He encontrado que es lo mismo ohhh");
                f = this.figures.get(i);
                return f;
                

            }

        }
        
        return f;

    }

    public ArrayList<uAbstractFigure> findFigures(Rectangle displayBox) {
        
        
        ArrayList <uAbstractFigure> f = new ArrayList();

        for (int i = 0; i < this.figures.size(); i++) {

            Point aux = new Point ((int) figures.get(i).getDisplayBox().getX(),(int)figures.get(i).getDisplayBox().getY());
            if (displayBox.contains(aux)) {

                f.add(this.figures.get(i));
                

            } 

        }

        return f;
    }
    
    
    public void addFigures (Rectangle displayBox){
        
        System.out.println("He entrado a AdFigures");
        
        for(int i=0; i<this.figures.size();i++){

            if(displayBox.contains((int) figures.get(i).getDisplayBox().getX(),(int)figures.get(i).getDisplayBox().getY())){
                this.add(figures.get(i));
            }
        }
        
        
        
    }
}
