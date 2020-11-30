import java.util.Collection;
import java.util.HashSet;

public class ForeachTest {
    public static void main(String[] args)
    {
        Collection books = new HashSet();
        books.add("babyxun");
        books.add("loves");
        books.add("babyfei");
        for(Object obj: books)
        {
            String book = (String)obj;
            System.out.println(book);
            if(book.equals("loves"))
            {
                //引起异常
                books.remove(book);
            }
        }
        System.out.println(books);
    }
}
