package uHotDrawFramework;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import uHotDrawFigures.uElipseFigure;
import uHotDrawFigures.uRectangleFigure;
import Tools.Tool;
import Tools.uCreationTool;
import Tools.uPolylineCreationTool;
import Tools.uPolylineFigure;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import uHotDrawFigures.uElipseFigure;
import uHotDrawFigures.uRectangleFigure;
import Tools.Tool;
import Tools.uCreationTool;
import Tools.uPolylineFigure;
import Tools.uSelectionTool;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import uHotDrawFigures.uElipseFigure;
import uHotDrawFigures.uRectangleFigure;
import Tools.Tool;
import Tools.uCreationTool;
import Tools.uPolylineCreationTool;
import Tools.uPolylineFigure;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import uHotDrawFigures.uElipseFigure;
import uHotDrawFigures.uRectangleFigure;
import Tools.Tool;
import Tools.uCreationTool;
import Tools.uPolylineFigure;

public class uDrawingEditor extends JFrame implements ActionListener {

    public List tools;
    public uDrawingView view;
    public Tool currentTool;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;

    public uDrawingEditor() {
        super();
        JPanel barraHerramientas = new JPanel();
        b4 = new JButton("Rectangle");
        b4.setActionCommand("r");
        b4.addActionListener(this);
        barraHerramientas.add(b4);
        b5 = new JButton("Elipse");
        b5.setActionCommand("e");
        b5.addActionListener(this);
        barraHerramientas.add(b5);
        b6 = new JButton("Poligono");
        b6.setActionCommand("p");
        b6.addActionListener(this);
        barraHerramientas.add(b6);
        b7 = new JButton("Seleccionar");
        b7.setActionCommand("s");
        b7.addActionListener(this);
        barraHerramientas.add(b7);
        currentTool=new uCreationTool(this.getV(),new uElipseFigure(0,0,10,10));

        view = new uDrawingView();
        view.setEditor(this);
        //this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(barraHerramientas, BorderLayout.NORTH);
        this.getContentPane().add((uDrawingView) view, BorderLayout.CENTER);
        this.setVisible(true);
        this.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("e".equals(e.getActionCommand())) {
            //System.out.println("Boton ELIPSE pulsado");
            //Tool eT;
            currentTool=new uCreationTool(this.getV(),new uElipseFigure(0,0,50,30));
        }
        if ("r".equals(e.getActionCommand())) {
            //System.out.println("Boton RECTANGULO pulsado");
           // Tool rT;
            currentTool=new uCreationTool(this.getV(),new uRectangleFigure(0,0,40,25));
        }
        if ("p".equals(e.getActionCommand())) {
            //System.out.println("Boton POLIGONO pulsado");
           // Tool pT;
            currentTool=new uPolylineCreationTool(this.getV(),new uPolylineFigure());
        }
        if ("s".equals(e.getActionCommand())) {
            //System.out.println("Boton POLIGONO pulsado");
           // Tool pT;
            currentTool=new uSelectionTool(this.getV());
        }
    }

    public uDrawingView getV() {
        return view;
    }

    public void setV(uDrawingView v) {
        this.view = v;
        this.setContentPane(v);
    }

    public List getTools() {
        return tools;
    }

    public void setTools(List tools) {
        this.tools = tools;
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
