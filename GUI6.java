import java.awt.event.*;
import javax.swing.*;

class RushikeshFrame
{
    public RushikeshFrame(String title)
    {
        JFrame fobj = new JFrame(title);
        fobj.setSize(600,300);  // (W,H)
        fobj.setVisible(true);

        JButton bobj = new JButton("Submit");
        fobj.add(bobj);
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

class GUI6
{
    public static void main(String Arg[])
    {
        RushikeshFrame mobj = new RushikeshFrame("PPA49");
    }
}