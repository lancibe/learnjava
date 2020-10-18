public class AutoConversion {
    public static void main(String[] args){
        int a = 6;
        //int类型可以自动转为float类型
        float f = a;
        System.out.println(f);//输出6.0

        //定义一个byte类型的整数变量
        byte b = 9;
        //下面代码将出错，因为byte类型不能自动类型转换为char类型
        // char c = b;
        //byte类型变量可以自动类型转换为double类型变量
        double d = b;
        System.out.println(d);//输出9.0
    }
}
