public class Overload {
    public void test()
    {
        System.out.println("test方法");
    }
    public void test(String msg)
    {
        System.out.println(msg);
    }
    public static void main(String[] args)
    {
        Overload ol = new Overload();
        ol.test();
        ol.test("lancibe");
    }
}
