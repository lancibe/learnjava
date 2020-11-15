public class AccessStaticInnerClass {
    static class StaticInnerClass
    {
        private static int prop1 = 5;
        private int prop2 = 9;
    }
    public void accessInnerProp()
    {
        //类名.变量名
        System.out.println(StaticInnerClass.prop1);
        //调用构造器并访问
        System.out.println(new StaticInnerClass().prop2);
    }
}
