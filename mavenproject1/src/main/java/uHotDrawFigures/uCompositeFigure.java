package uHotDrawFigures;


import java.awt.Graphics;
import java.util.ArrayList;
import uHotDrawFigures.uAbstractFigure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class uCompositeFigure extends uAbstractFigure{
    private ArrayList<uAbstractFigure> figures;

    public uCompositeFigure() {
        this.figures = new ArrayList<uAbstractFigure>();
    }

    public ArrayList<uAbstractFigure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<uAbstractFigure> figures) {
        this.figures = figures;
    }
    
    public void add(uAbstractFigure figure){
        this.figures.add(figure);
    }
    
    public void remove(uAbstractFigure figure){
        this.figures.remove(figure);
    }
    
    @Override
    public void draw(Graphics g){
        for(uAbstractFigure figure: this.figures){
            figure.draw(g);
        }
    }

    
}
