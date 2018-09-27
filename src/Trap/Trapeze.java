package Trap;

public class Trapeze {
    public final double Side;
    public final double BigBase;
    public final double SmallBase;

    public Trapeze(double side, double bigBase, double smallBase)
    {
        if(side <= 0 || bigBase <= 0 || smallBase <= 0)
            throw new IllegalArgumentException();
        this.Side =side;
        this.BigBase = bigBase;
        this.SmallBase =smallBase;
    }

    public double getDiagonale()
    {
        return Math.sqrt(Side*Side + BigBase*SmallBase);
    }
}
