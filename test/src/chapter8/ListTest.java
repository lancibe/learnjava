import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args)
    {
        List books = new ArrayList();
        //向books集合中添加三个元素
        books.add(new String("Lancibe"));
        books.add(new String("loves"));
        books.add(new String("fei"));
        System.out.println(books);

        //将新字符串对象插入在第二个位置
        books.add(1, new String("very"));
        for (int i = 0 ; i < books.size() ; i++)
        {
            System.out.println(books.get(i));
        }
        //删除第三个元素
        books.remove(2);
        System.out.println(books);
        //判断指定元素在List集合中的位置；输出1表明在第二位
        System.out.println(books.indexOf(new String("very")));
        //将第二个元素替换为新的字符串对象
        books.set(1, new String("loves"));
        System.out.println(books);
        //将books集合的第二个元素（包括到）第三个元素（不包括）截取成子集合
        System.out.println(books.subList(1, 2));
    }
}
