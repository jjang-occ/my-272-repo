/**
 * CS 272 - Fall 2019
 * H01-IceCreamCone.java
 */
package occ.cs272.h01;

/**
 * @author <your OCC login name such as sgilbert>
 * @version <the date>
 * 
 */
public class IceCreamCone
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "Put your login ID here";
    public static final String ASSIGNMENT = "H01-B";

    // TODO: Complete this class
    
    private double height;
    private double radius;
    
    public IceCreamCone() { height = 0.0; radius = 0.0; }
    public IceCreamCone(double h, double r) { height = h; radius = r; }
    
    public double getSurfaceArea()
    {
        return Math.PI * radius * Math.sqrt(height * height + radius * radius);
    }
    public double getVolume()
    {
        return Math.PI * radius * radius * height / 3.0;
    }
    
}
