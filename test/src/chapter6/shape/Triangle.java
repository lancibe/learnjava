package chapter6.shape;

public class Triangle extends chapter6.shape.Shape {
    //定义三角形的三边
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c)
    {
        super(color);
        this.setSides(a, b, c);
    }
    public void setSides(double a, double b, double c)
    {
        if (a>=b+c || b>=a+c || c>=a+b)
        {
            System.out.println("三角形不合规");
            return;
        }
        this.a=a;
        this.b=b;
        this.c=c;
    }
    //重写Shape类的计算周长的抽象方法
    public double calPerimeter()
    {
        return a+b+c;
    }
    //重写Shape类的返回形状的抽象方法
    public String getType()
    {
        return "三角形";
    }
}
