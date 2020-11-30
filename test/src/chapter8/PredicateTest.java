import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args)
    {
        Collection books = new HashSet();
        books.add(new String("lancibe"));
        books.add(new String("babyxun"));
        books.add(new String("loves"));
        books.add(new String("fei"));
        books.add(new String("babyfei"));
        //使用Lambda表达式（目标类型是predicate)过滤集合
        books.removeIf(ele ->((String)ele).length() < 5);
        System.out.println(books);

        System.out.println(calAll(books, ele->((String)ele).contains("xun")));
        System.out.println(calAll(books, ele->((String)ele).contains("baby")));
        System.out.println(calAll(books, ele->((String)ele).length() > 5));
    }
    public static int calAll(Collection books, Predicate p)
    {
        int total = 0;
        for(Object obj : books)
        {
            if(p.test(obj))
                total++;
        }
        return total;
    }
}
