import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {
    public static void main(String[] args)
    {
        String regStr = "Java is not very easy :(";
        System.out.println("目标字符串："+regStr);
        Matcher m = Pattern.compile("\\w+").matcher(regStr);
        while(m.find())
        {
            System.out.println(m.group()+"\n子串起始位置："+m.start()+"\n子串结束位置："+m.end());
        }
    }
}
