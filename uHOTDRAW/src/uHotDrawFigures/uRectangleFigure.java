package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class uRectangleFigure extends uAbstractFigure{

    private uRectangleFigure(Rectangle rectangle) {
        this.displayBox=rectangle;    
    }
    
    @Override
    public void draw(Graphics rectangulo){
        rectangulo.setColor(Color.green);
        rectangulo.drawRect(displayBox.x, displayBox.y, displayBox.width, displayBox.height);
        
    }

    public uRectangleFigure(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    
    @Override
    public uAbstractFigure clone(){
        uAbstractFigure clon = new uRectangleFigure((Rectangle) this.displayBox.clone());
        return clon;
    }

    public void setSize(int w, int h) {
        displayBox.width=w;
        displayBox.height=h;
    }
    
}