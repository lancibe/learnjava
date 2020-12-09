import java.util.ArrayList;
import java.util.List;

class As
{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
public class ListTest2 {
    public static void main(String[] args)
    {
        List books = new ArrayList();
        books.add(new String("lancibe"));
        books.add(new String("loves"));
        books.add(new String("fei"));
        System.out.println(books);
        //这两次删除，由于重写了equals方法，故两次删除都删除了第一个元素
        books.remove(new As());
        System.out.println(books);
        books.remove(new As());
        System.out.println(books);
    }
}
