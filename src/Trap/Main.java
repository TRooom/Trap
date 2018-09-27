package Trap;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        frame.getContentPane().add(new Canvas(new Trapeze(300, 600,150)));
        frame.setSize(1200,1200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}

class Canvas extends JPanel
{
    public final Trapeze Trapeze;

    public Canvas(Trapeze trapeze)
    {
        this.Trapeze = trapeze;
    }
    public void paint(Graphics e)
    {
        int b = (int)((Trapeze.BigBase - Trapeze.SmallBase) / 2);
        int h =(int)Math.sqrt(Trapeze.Side*Trapeze.Side - Math.sqrt(b));
        e.drawLine(0,1000,(int)Trapeze.BigBase,1000);

        e.drawLine(0,1000,b,1000-h);
        e.drawLine(b,1000-h,b+(int)Trapeze.SmallBase, 1000-h);
        e.drawLine(b+(int)Trapeze.SmallBase, 1000-h,(int)Trapeze.BigBase,1000);
        e.drawLine(0,1000,b+ (int)Trapeze.SmallBase,1000-h);
    }

}


