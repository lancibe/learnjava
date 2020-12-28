interface Foo<T>
{
    void test(T t);
}

public class AnnoymousDiamond {
    public static void main(String[] args)
    {
        //制定Foo类中泛型为String
        Foo<String> f = new Foo<String>() {
            //必须要进行方法的重载，test方法的参数类型为String
            @Override
            public void test(String s) {
                System.out.println("test方法的s参数为："+s);
            }
        };

        //使用泛型通配符，此时相当于通配符的上限为Object
        Foo<?> fo = new Foo<Object>() {
            @Override
            public void test(Object o) {
                System.out.println("test方法的o参数为"+o);
            }
        };

        //使用泛型通配符，此时通配符上限为Number
        Foo<? extends Number> fn = new Foo<Number>() {
            @Override
            public void test(Number number) {
                System.out.println("test方法的Number参数为："+number);
            }
        };
    }
}
