public class StringCompareTest {
    public static void main(String[] args)
    {
        //s1直接引用常量池中的"lancibe"
        String s1 = "lancibe";
        String s2 = "lan";
        String s3 = "cibe";
        //s4后面的字符串值可以在编译时就确定下来
        //s4直接引用常量池的"lancibe"
        String s4 = "lan"+"cibe";
        //s5后面的字符串值可以在编译时就确定下来
        //s5直接引用常量池中的"lancibe"
        String s5 = "l"+"an"+"cibe";
        //s6后面的字符串值不能在编译时就确定下来
        //不能引用常量池中的字符串
        String s6 = s2+s3;
        //使用new调用构造器将会创建一个新的String对象
        //s7应用堆内存中新创建的String对象
        String s7 = new String("lancibe");
        System.out.println(s1==s4);//true
        System.out.println(s1==s5);//true
        System.out.println(s1==s6);//false
        System.out.println(s1==s7);//false

    }
}
