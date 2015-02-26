/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotDrawFramework;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import uHotDrawFigures.uEllipseFigure;
import uHotDrawFigures.uPolylineFigure;
import uHotDrawFigures.uRectangleFigure;
import uTools.uAbstractTool;
import uTools.uCreationTool;
import uTools.uPolylineCrationTool;

/**
 *
 * @author oscar
 */
public class uDrawingEditor extends javax.swing.JFrame implements ActionListener{
    
    
    private ArrayList<uAbstractTool> tool;
    
    private uAbstractTool currentTool;

    private uDrawingView drawingview;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private uAbstractTool eT;
    private uAbstractTool rT;
    private uAbstractTool pT;
    
    public uDrawingView getDrawingview() {
        return drawingview;
    }

    public void setDrawingview(uDrawingView drawingview) {
        this.drawingview = drawingview;
    }
    public uAbstractTool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(uAbstractTool currentTool) {
        this.currentTool = currentTool;
    }
    
    

    public ArrayList<uAbstractTool> getTool() {
        return tool;
    }

    public void setTool(ArrayList<uAbstractTool> tool) {
        this.tool = tool;
    }    
    
    
    /**
     * Creates new form uDrawingEditor
     */
    public uDrawingEditor() {
        super();
        JPanel barraHerramientas = new JPanel();
        b4 = new JButton("Rectangle");
        b4.setActionCommand("r");
        b4.addActionListener(this);
        barraHerramientas.add(b4);
        b5 = new JButton("Ellipse");
        b5.setActionCommand("e");
        b5.addActionListener(this);
        barraHerramientas.add(b5);
        b6 = new JButton("Polyline");
        b6.setActionCommand("p");
        b6.addActionListener(this);
        barraHerramientas.add(b6);
        drawingview=new uDrawingView();
        drawingview.setEditor(this);
        rT =new uCreationTool(this.getDrawingview(),new uRectangleFigure(0,0,10,10));
        eT =new uCreationTool(this.getDrawingview(),new uEllipseFigure(0,0,10,10));
        pT =new uPolylineCrationTool(this.getDrawingview());
        this.getContentPane().setLayout(new BorderLayout());             
        this.getContentPane().add(barraHerramientas, BorderLayout.NORTH);
        this.getContentPane().add((uDrawingView)drawingview, BorderLayout.CENTER);

        this.setVisible(true);
        this.pack();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(uDrawingEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uDrawingEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uDrawingEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uDrawingEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uDrawingEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("e".equals(e.getActionCommand())) {
            setCurrentTool(eT);
        }
        if ("r".equals(e.getActionCommand())) {
            setCurrentTool(rT);
        }
        if ("p".equals(e.getActionCommand())) {
            setCurrentTool(pT);
            pT=new uPolylineCrationTool(this.getDrawingview());
        }

    }
    
}