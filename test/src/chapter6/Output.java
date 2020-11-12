public interface Output {
    int MAX_CHCHE_LINE = 50;

    //接口中定义的普通方法只能是public的抽象方法
    void out();
    void getData(String msg);

    //在接口中默认方法，需要使用default修饰
    default void print(String... msgs)
    {
        for (String msg:msgs)
        {
            System.out.println(msg);
        }
    }
    default void test()
    {
        System.out.println("默认的抽象方法");
    }

    //在接口中定义类方法，需要使用static修饰
    static String staticTest()
    {
        return "接口里的类方法";
    }

    //定义私有方法
    private void foo()
    {
        System.out.println("foo私有方法");
    }

    //定义私有静态方法
    private static void bar()
    {
        System.out.println("bar私有静态方法");
    }
}
