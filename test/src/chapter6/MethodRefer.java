import javax.swing.*;

@FunctionalInterface
interface Converter
{
    Integer convert(String from);
}


@FunctionalInterface
interface MyTest
{
    String test(String a, int b, int c);
}

@FunctionalInterface
interface YourTest
{
    JFrame win(String title);
}


public class MethodRefer {
    public static void main(String[] args)
    {
        //引用类方法
        //Converter converter1 = from-> Integer.valueOf(from);
        Converter converter1 = Integer::valueOf;//两种写法都可
        Integer val = converter1.convert("99");
        System.out.println(val);

        //引用特定对象的实例方法
        //Converter converter2 = from -> "lancibe.org".indexOf(from);
        Converter converter2 = "lancibe.org"::indexOf;
        Integer value = converter2.convert("lan");
        System.out.println(value);

        //引用某类对象的实例方法
        //MyTest mt = (a,b,c) -> a.substring(b,c);
        MyTest mt = String::substring;
        String str = mt.test("I love Java", 2, 9);
        System.out.println(str);

        //引用构造器
        //YourTest yt = (String a) -> new JFrame(a);
        YourTest yt = JFrame::new;
        JFrame jf = yt.win("my window");
        System.out.println(jf);
    }
}
