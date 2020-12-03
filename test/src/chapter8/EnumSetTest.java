import java.util.EnumSet;

enum Season
{
    SPRING,SUMMER,FALL,WINTER
}
public class EnumSetTest {
    public static void main(String[] args)
    {
        //创建一个EnumSet集合，集合元素就是Season枚举类的全部枚举值
        EnumSet es1 = EnumSet.allOf(Season.class);
        System.out.println(es1);

        //创建一个EnumSet空集合
        EnumSet es2 = EnumSet.noneOf(Season.class);
        System.out.println(es2);

        //手动添加两个元素
        es2.add(Season.WINTER);
        es2.add(Season.SPRING);
        System.out.println(es2);

        //以指定枚举值创建EnumSet集合
        EnumSet es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
        System.out.println(es3);
        EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
        System.out.println(es4);

        EnumSet es5 = EnumSet.complementOf(es4);
        System.out.println(es5);

    }
}
