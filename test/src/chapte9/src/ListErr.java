import java.util.ArrayList;
import java.util.List;

public class ListErr {
    public static void main(String[] args)
    {
        List strList=new ArrayList();
        strList.add("lancibe");
        strList.add("xun");
        strList.add(5);
        strList.forEach(str -> System.out.println(((String)str).length()));
    }
}
