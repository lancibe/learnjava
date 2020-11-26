import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroup {
    public static void main(String[] args)
    {
        //使用字符串模拟从网络上得到的网页源码
        String str = "Lancibe, tel:13512341234"
                + "Lan, tel:15701234567"
                + "Xun, tel:14288886666";

        Matcher m = Pattern.compile("((13\\d)|(15\\d)|(14\\d))\\d{8}").matcher(str);

        while(m.find())
        {
            System.out.println(m.group());
        }
    }
}
