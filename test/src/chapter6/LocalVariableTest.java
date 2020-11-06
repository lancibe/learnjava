public class LocalVariableTest {
    public void test(final int a)
    {
        //不能对final修饰的形参赋值
        //a = 5;
    }

    public static void main(String[] args)
    {
        //定义final局部变量时指定默认值，则str变量无法被赋值
        final String str = "hello";
        //下面语句非法
        //str = "lancibe";
        final double d;
        //第一次赋值，允许
        d = 5.6;
        //重复赋值，非法
        //d = 3.14;

    }
}
