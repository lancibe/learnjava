

public class integer {

    public static void main (String[] args)
    {
        // 下面代码是正确的，系统会自动把56当成byte值处理
        byte a = 56;

        // 下面代码是错误的，系统不会把这个数当成long类型来处理
        // long b = 9999999999999;
        long b = 9999999999999L;

        int binval = 0b10000000000000000000000000000011;
        System.out.println(binval);

        //定义一个八位的二进制整数，该数值默认占32位，因此它是一个正数
        //只是强制类型转换转换成byte时产生了溢出，最终导致binval2变成了-23
        int binval2= (byte)0b11101001;
        long binval3= 0B10000000000000000000000000000011L;
        System.out.println(binval2);//输出-23
        System.out.println(binval3);//输出2147483651
    }


}
