class DataWrap
{
    int a;
    int b;
}

public class ReferenceTransferTest {
    public static void swap(DataWrap dw)
    {
        int temp = dw.a;
        dw.a = dw.b;
        dw.b = temp;
        System.out.println("swap方法内"+"a="+dw.a+",b="+dw.b);
    }
    public static void main(String[] args)
    {
        DataWrap dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("main方法内"+"a="+dw.a+",b="+dw.b);
    }
}
