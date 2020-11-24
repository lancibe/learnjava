public class MathTest {
    public static void main(String[] args)
    {
        //三角运算
        //弧度转角度
        System.out.println("Math.toDegrees(1.57):"+Math.toDegrees(1.57));
        //将角度转换为弧度
        System.out.println("Math.toRadians(90):"+Math.toRadians(90));
        //计算反余弦，返回的角度范围在0.0到pi之间
        System.out.println("Math.acos(1.2):"+Math.acos(1.2));
        //计算双曲正弦
        System.out.println("Math.sinh(1.2):"+Math.sinh(1.2));
        //将矩形坐标(x,y)转换为极坐标(r, thet)
        System.out.println("Math.atan2(0.1, 0.2):"+Math.atan2(0.1, 0.2));

        //取整运算
        //向下取整
        System.out.println("Math.floor(-1.2):"+Math.floor(-1.2));
        //向上取整
        System.out.println("Math.ceil(2.3):"+Math.ceil(2.3));
        //四舍五入
        System.out.println("Math.round(3.4):"+Math.round(3.4));

        //下面是乘方开方指数运算
        //欧拉数的e的n次幂
        System.out.println("Math.exp(2):"+Math.exp(2));


    }
}
