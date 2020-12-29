class Foo2
{
    public <T> Foo2(T t)
    {
        System.out.println(t);
    }
}
public class GenericConstructor {
    public static void main(String[] args)
    {
        new Foo2("lancibe");
        new Foo2(200);
        new <String> Foo2("xun");
        new <Double> Foo2(12.3);
    }
}
