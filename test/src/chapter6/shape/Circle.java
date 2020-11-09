package shape;

public class Circle extends shape.Shape {
    private double radius;
    public Circle(String color, double radius)
    {
        super(color);
        this.radius=radius;
    }

    public void setRadius(double radius)
    {
        this.radius=radius;
    }

    public double calPerimeter()
    {
        return 2*Math.PI*radius;
    }
    public String getType()
    {
        return getColor() + "圆形";
    }

    public static void main(String[] args)
    {
        shape.Shape s1 = new shape.Triangle("黄色", 3,4,5);
        shape.Shape s2 = new Circle("红色", 3);
        System.out.println(s1.getType());
        System.out.println(s1.calPerimeter());
        System.out.println(s2.getType());
        System.out.println(s2.calPerimeter());
    }
}
