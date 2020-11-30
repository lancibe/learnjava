import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args)
    {
        Collection c = new ArrayList();
        //添加元素
        c.add("lancibe");
        //虽然集合里不能放基本类型的值，但是Java支持自动装箱
        c.add(6);
        System.out.println("c集合里的元素个数为："+c.size());
        //删除指定元素
        c.remove(6);
        System.out.println("c集合里的元素个数为："+c.size());

        //判断是否包含指定字符串
        System.out.println("c集合是否包含\"lancibe\"字符串"+c.contains("lancibe"));
        c.add("loves");
        c.add("babyxun");
        System.out.println("c集合里的元素："+c);
        Collection books = new HashSet();
        books.add("babyxun");
        books.add("babyfei");
        System.out.println("c集合里是否完全包含books集合"+c.containsAll(books));
        //用c集合减去books集合里的元素
        c.removeAll(books);
        System.out.println("c集合里的元素："+c);
        //删除c集合里的所有元素
        c.clear();
        System.out.println("c集合里的元素："+c);
        //控制books集合里只剩下c集合里也包含的元素
        books.retainAll(c);
        System.out.println("books集合里的元素："+books);
    }
}
