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

class RushikeshListener extends WindowAdapter
{
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
}

class GUI4
{
    public static void main(String Arg[])
    {
        RushikeshFrame mobj = new RushikeshFrame("PPA49");
    }
}