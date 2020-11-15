public class StaticInnerClassTest {
    private int prop1 = 5;
    private static int prop2 = 9;
    static class StaticInnerClass
    {
        //静态内部类里可以包含静态成员
        private static int age;
        public void accessOuterProp()
        {
            //如果访问prop1,则出现错误
            System.out.println(prop2);
        }
    }
}
