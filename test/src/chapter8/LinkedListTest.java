import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args)
    {
        LinkedList books = new LinkedList();
        //将字符串元素加入队列尾部
        books.offer("lancibe");
        //将字符串元素加入栈的顶部
        books.push("loves");
        //将字符串元素插入到队列的头部、相当于是栈的顶部
        books.offerFirst("fei");
        //以List的方式来遍历集合元素
        for(int i = 0; i < books.size() ; i++)
        {
            System.out.println("以队列的方式遍历"+books.get(i));
        }
        //访问并不删除栈顶的元素
        System.out.println(books.peekFirst());
        //访问并不删除队列的最后一个元素
        System.out.println(books.peekLast());
        //将栈顶元素弹出栈
        System.out.println(books.pop());
        //下面将看到队列中第一个元素被删除
        System.out.println(books);
        //访问并删除队列的最后一个元素
        System.out.println(books.pollLast());
        System.out.println(books);
    }
}
