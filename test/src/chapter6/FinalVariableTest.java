public class FinalVariableTest {
    //定义成员变量时指定默认值，合法
    final int a = 6;

    //下面变量将在构造器或初始化块中分配初始值
    final String str;
    final int c;
    final static double d;
    //初始化块，可以对没有指定默认值的实例变量指定初始值
    {
        str = "hello";
        //不能为a重新赋值，因此下面语句非法
        //a = 9;
    }
    //静态初始化块，可以对没有指定默认值的类变量指定初始值
    static {
        d = 5.6;
    }

    //构造器，可对既没有指定初始值，又没有在初始化块中指定初始值的实例变量指定初始值
    public FinalVariableTest()
    {
        //如果在初始化块中已经对str指定了初始值
        //那么在构造器中不能对final变量赋初始值，下面赋值语句非法
        // str = 'java';
        c = 5;
    }
    public void changeFinal()
    {
        //普通方法不能为final修饰的成员变量赋值
        //d = 1.2;
        //不能再普通方法中为final成员变量指定初始值
        //ch = 'a';
    }
    public static void main(String[] args)
    {
        FinalVariableTest ft = new FinalVariableTest();
        System.out.println(ft.a);
        System.out.println(ft.c);
        System.out.println(ft.d);
    }
}
