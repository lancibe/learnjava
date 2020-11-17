@FunctionalInterface
interface Displayable
{
    void display();
    default int add (int a , int b)
    {
        return a+b;
    }
}
public class LambdaAndInner {
    private int age = 12;
    private static String name = "1909";
    public void test()
    {
        String book = "Lancibe";
        Displayable dis = ()->
        {
            //访问"effectively final"的局部变量
            System.out.println("book的局部变量为："+book);
            System.out.println("外部类的age实例变量为："+age);
            System.out.println("外部类的name类变量为："+name);
        };
        dis.display();
        System.out.println(dis.add(3, 5));
    }
    public static void main(String[] args)
    {
        LambdaAndInner lambda = new LambdaAndInner();
        lambda.test();
    }
}
