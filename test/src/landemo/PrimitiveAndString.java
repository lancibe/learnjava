public class PrimitiveAndString {
    public static void main (String[] args){
        //一个基本类型的值和字符串进行连接运算时，基本类型的值自动转换为字符串
        String str1 = 3.5f + "";
        //输出3.5
        System.out.println(str1);

        //下面语句输出7Hello!
        System.out.println(3+4+"Hello!");

        //下面语句输出Hello!34
        System.out.println("Hello!"+3+4);
    }
}
