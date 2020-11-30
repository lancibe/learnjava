import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorErrorTest {
    public static void main(String[] args)
    {
        Collection books = new HashSet();
        books.add("babyxun");
        books.add("loves");
        books.add("babyfei");
        //获取books集合对应的迭代器
        Iterator it = books.iterator();
        while (it.hasNext())
        {
            String book = (String)it.next();
            System.out.println(book);
            if(book.equals("loves"))
            {
                //使用Iterator迭代过程中，不可修改集合元素，下面代码将引发异常
                books.remove(book);
            }
        }
    }
}
