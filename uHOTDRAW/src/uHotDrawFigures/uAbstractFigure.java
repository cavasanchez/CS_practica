package uHotDrawFigures;

import com.sun.org.apache.bcel.internal.generic.IUSHR;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public abstract class uAbstractFigure implements IFigure, Cloneable {

    protected Rectangle displayBox;

   
    public uAbstractFigure() {
        this.displayBox = new Rectangle(20, 20, 30, 30);
    }

    public uAbstractFigure(int x, int y, int width, int height) {
        this.displayBox = new Rectangle(x, y, width, height);
    }

    @Override
    public void draw(Graphics elipse) {
        elipse.setColor(Color.red);
        elipse.drawOval(this.displayBox.x, this.displayBox.y, this.displayBox.width, this.displayBox.height);
    }

    public Rectangle getDisplayBox() {
        return displayBox;
    }

    @Override
    public void setDisplayBox(Rectangle displayBox) {
        this.displayBox = displayBox;
    }

    @Override
    public void moveBy(double dx, double dy) {
        displayBox.translate((int)dx,(int) dy);
    }

    @Override
    public boolean containsPoint(double x, double y) {
        return displayBox.contains(x, y);
    }
    
    @Override
        public abstract uAbstractFigure clone();
}