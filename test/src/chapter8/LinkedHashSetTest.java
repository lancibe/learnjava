import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args)
    {
        LinkedHashSet books = new LinkedHashSet();
        books.add("lancibe");
        books.add("babyxun");
        System.out.println(books);
        books.remove("lancibe");
        books.add("lancibe");
        System.out.println(books);
    }
}
