import java.util.ArrayList;
import java.util.List;

public class GenericList {
    public static void main(String args[])
    {
        //创建一个只想保存字符串的List集合
        List<String> strList = new ArrayList<>();
        strList.add("lancibe");
        strList.add("xun");
        //下面代码直接引起编译错误
        strList.add(5);
        strList.forEach(str -> System.out.println(str.length()));
    }
}
