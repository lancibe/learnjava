import java.util.Collection;
import java.util.HashSet;

public class CollectionStream {
    public static void main(String[] args)
    {
        Collection books = new HashSet();
        books.add(new String("lancibe"));
        books.add(new String("babyxun"));
        books.add(new String("loves"));
        books.add(new String("fei"));
        books.add(new String("babyfei"));
        System.out.println(books);

        System.out.println(books.stream().filter(ele -> ((String)ele).contains("baby")).count());
        System.out.println(books.stream().filter(ele->((String)ele).contains("fei")).count());
        System.out.println(books.stream().filter(ele->((String)ele).length() > 5).count());

        //先调用Collection对象的stream()方法将集合转换为Stream
        //再调用Stream的mapToInt()方法获取原有的Stream对应的IntStream
        books.stream().mapToInt(ele->((String)ele).length())
                //调用forEach()方法遍历IntStream中的每个元素
                .forEach(System.out::println);

    }
}
