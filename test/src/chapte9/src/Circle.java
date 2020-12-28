import java.awt.*;

public class Circle extends Shape{
    //方法实现
    @Override
    public void draw(Canvas c) {
        System.out.println("在画布"+c+"上画一个圆");
    }
}
