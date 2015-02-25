/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uTools;

import java.awt.event.MouseEvent;
import uHotDrawFramework.uDrawingView;

/**
 *
 * @author oscar
 */
public abstract class uAbstractTool {
    uDrawingView view;



    public uDrawingView getView() {
        return view;
    }

    public void setView(uDrawingView view) {
        this.view = view;
    }
          
    public abstract void mouseDrag(MouseEvent aEvent);  
    
    public abstract void mouseUp(MouseEvent aEvent);

    public abstract void mouseMove(MouseEvent aEvent);
    
    public abstract void mouseDown(MouseEvent aEvent);
    
}
