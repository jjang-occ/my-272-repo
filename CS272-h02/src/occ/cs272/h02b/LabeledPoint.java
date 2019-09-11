package occ.cs272.h02b;

// http://codecheck.it/files?repo=bj4cc&problem=ch10/c10_exp_10_103
//TODO: implement toString

public class LabeledPoint
{
    private double x;
    private double y;
    private String label;

    /**
     * Constructs a labeled point with a given position and label.
     * @param anX the x-coordinate of the point
     * @param aY the y-coordinate of the point
     * @param aLabel the label of the point
     */
    public LabeledPoint(double anX, double aY, String aLabel)
    {
        x = anX;
        y = aY;
        label = aLabel;
    }

    // Implemented toString here...
    public String toString()
    {
        return getClass().getName() + "[x=" + x + ",y=" + y + ",label=" + label + "]";
    }

    public static String check(double x, double y, String s)
    {
        LabeledPoint lp = new LabeledPoint(x, y, s);
        return lp.toString();
    }
}