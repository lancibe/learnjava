import java.util.Collection;
import java.util.HashSet;

public class CollectionEach {
    public static void main(String[] args)
    {
        //创建一个集合
        Collection books = new HashSet();
        books.add("babyxun");
        books.add("loves");
        books.add("babyfei");
        //调用forEach()方法遍历集合
        books.forEach(obj->System.out.println("迭代集合元素："+obj));
    }
}
