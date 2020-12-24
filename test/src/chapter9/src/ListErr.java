import java.util.ArrayList;
import java.util.List;

public class ListErr {
    public static void main(String[] args)
    {
        //创建一个只想保存字符串的list集合
        List strList = new ArrayList();
        strList.add("Lancibe");
        strList.add("xun");
        //把一个Integer对象放入集合
        strList.add(5);
        strList.forEach(str -> System.out.println(((String)str).length()));
    }
}
