public class ConversionTest {
    public static void main(String[] args)
    {
        double d = 13.4;
        long l = (long)d;
        System.out.println(l);
        int in = 5;
        //系统会提示：不可转换的类型
        //boolean b = (boolean)in;
        Object obj = "hello";
        String objStr = (String)obj;
        System.out.println(objStr);
        Object objPri = Integer.valueOf(5);
        //可以强制类型转换，而objPri变量的实际类型是Integer
        //所以下面代码运行时会引发ClassCastException异常
        String str = (String)objPri;
    }
}
