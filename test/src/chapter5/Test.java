class Root
{
    static{
        System.out.println("Root静态初始化块");
    }
    {
        System.out.println("Root普通初始化块");
    }
    public Root()
    {
        System.out.println("Root无参数构造器");
    }
}

class Mid extends Root
{
    static{
        System.out.println("Mid静态初始化块");
    }
    {
        System.out.println("Mid普通初始化块");
    }
    public Mid()
    {
        System.out.println("Mid无参数构造器");
    }
    public Mid(String msg)
    {
        //通过this调用同一类的重载的构造器
        this();
        System.out.println("Mid带参数构造器，其参数值"+msg);
    }
}
class Leaf extends Mid
{
    static {
        System.out.println("Leaf静态初始化块");
    }
    {
        System.out.println("Leaf普通初始化块");
    }
    public Leaf()
    {
        //通过super调用父类中油一个字符串参数的构造器
        super("lancibe");
        System.out.println("执行Leaf的构造器");
    }
}
public class Test {
    public static void main(String[] args)
    {
        new Leaf();
        new Leaf();
    }
}
