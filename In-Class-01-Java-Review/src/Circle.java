
public class Circle
{
    private double radius;

    public Circle(double radius)
    {
        super();
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    /**
     * @param radius the radius of the circle
     */
    public void setRadius(double radius)
    {
        this.radius = radius;
    }


    @Override
    public String toString()
    {
        return "Circle [radius=" + radius + "]";
    }
}
