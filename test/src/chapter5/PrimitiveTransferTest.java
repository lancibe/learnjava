public class PrimitiveTransferTest {
    public static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap方法内"+"a="+a+"b="+b);
    }
    public static void main(String[] args)
    {
        int a = 6;
        int b = 9;
        swap(a,b);
        System.out.println("main方法内"+"a="+a+"b="+b);
    }
}
