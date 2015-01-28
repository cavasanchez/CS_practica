package Tools;

import java.awt.event.MouseEvent;


public interface Tool {

    public void mouseDown(MouseEvent aEvent);

    public void mouseUp(MouseEvent aEvent);

    public void mouseMove(MouseEvent aEvent);

    public void mouseDrag(MouseEvent aEvent);
}
