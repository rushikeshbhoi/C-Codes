import java.awt.*;
import java.awt.event.*;

class RushikeshFrame
{
    public RushikeshFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(600,300);  // (W,H)
        fobj.setVisible(true);
        fobj.addWindowListener(new RushikeshListener());
    }
}

class RushikeshListener implements WindowListener
{
    public void windowDeactivated(WindowEvent obj){}
    public void windowActivated(WindowEvent obj){}
    public void windowDeiconified(WindowEvent obj){}
    public void windowIconified(WindowEvent obj){}
    public void windowClosed(WindowEvent obj){}
    public void windowOpened(WindowEvent obj){}
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
}

class GUI3
{
    public static void main(String Arg[])
    {
        RushikeshFrame mobj = new RushikeshFrame("PPA49");
    }
}