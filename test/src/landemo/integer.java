

public class integer {

    public static void main (String[] args)
    {
        // 下面代码是正确的，系统会自动把56当成byte值处理
        byte a = 56;

        // 下面代码是错误的，系统不会把这个数当成long类型来处理
        // long b = 9999999999999;
        long b = 9999999999999L;
    }


}
