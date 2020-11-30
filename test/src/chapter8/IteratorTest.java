import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args)
    {
        Collection books = new HashSet();
        books.add("babyxun");
        books.add("loves");
        books.add("babyfei");
        //获取books集合对应的迭代器
        Iterator it = books.iterator();
        while(it.hasNext())
        {
            //it.next()方法返回的数据类型是Object类型，因此需要强制类型转换
            String book = (String)it.next();
            System.out.println(book);
            if(book.equals("loves"))
            {
                //从集合中删除上一次next()方法返回的元素
                it.remove();
            }
            //对book变量赋值，不会改变集合元素本身
            book = "test";
        }
        System.out.println(books);
    }
}
