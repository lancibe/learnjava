public class LocalInnerClass {
    public static void main(String[] args)
    {
        //定义局部内部类
        class InnerBase
        {
            int a;
        }
        class InnerSub extends InnerBase
        {
            int b;
        }
        //创建局部内部类的对象
        InnerSub is = new InnerSub();
        is.a = 5;
        is.b = 9;
        System.out.println(""+(is.a+is.b));
    }
}
