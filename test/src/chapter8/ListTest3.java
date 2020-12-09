import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
    public static void main(String[] args)
    {
        List books = new ArrayList();
        books.add(new String("lancibe"));
        books.add(new String("always"));
        books.add(new String("loves"));
        books.add(new String("fei"));

        //使用目标类型为Comparator的Lambda表达式来对List集合排序
        books.sort((o1,o2)->((String)o1).length()-((String)o2).length());
        System.out.println(books);
        books.replaceAll(ele->((String)ele).length());
        System.out.println(books);
    }
}
