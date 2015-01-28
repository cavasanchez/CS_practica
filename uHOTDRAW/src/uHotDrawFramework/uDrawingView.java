package uHotDrawFramework;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import Tools.Tool;
import uHotDrawFigures.uAbstractFigure;

public class uDrawingView extends JPanel implements MouseMotionListener, MouseListener {

    public uDrawing drawing;
    public uDrawingEditor editor;
    
    public uDrawingView(){
        super();
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
    }

    public uDrawing getDrawing() {
        return drawing;
    }

    public void setDrawing(uDrawing drawing) {
        this.drawing = drawing;
    }

    public uDrawingEditor getEditor() {
        return editor;
    }

    public void setEditor(uDrawingEditor editor) {
        this.editor = editor;
    }

    @Override
    public void paint(Graphics objeto) {
        drawing.draw(objeto);
    }

    public Tool tool() {
        return editor.getCurrentTool();
    }

    @Override
    public void mousePressed(MouseEvent aEvent) {
        tool().mouseDown(aEvent);
        this.editor.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent aEvent) {
        tool().mouseUp(aEvent);
        this.editor.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent aEvent) {
//        System.out.println("Raton movido en la vista");
        tool().mouseMove(aEvent);
        this.editor.repaint();
    }

    @Override
    public void mouseDragged(MouseEvent aEvent) {
//        System.out.println("Raton dragged");
        tool().mouseDrag(aEvent);
    }

    //METODOS DE LOS IMPLEMENTS, NECESARIOS PARA COMPILAR
    @Override
    public void mouseClicked(MouseEvent e) {
//        System.out.println("Raton pulsado");
    
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        System.out.println("Raton dentro");
    
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        System.out.println("Raton fuera");
    
    }

    public void clearSelection() {
        this.drawing=null;
    }

    public void addToSelection(uAbstractFigure f) {
        this.drawing.add(f);
    }
}