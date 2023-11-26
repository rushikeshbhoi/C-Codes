import java.awt.*;

class RushikeshFrame
{
    public RushikeshFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(600,300);  // (W,H)
        fobj.setVisible(true);
    }
}

class GUI2
{
    public static void main(String Arg[])
    {
        RushikeshFrame mobj = new RushikeshFrame("PPA49");
    }
}