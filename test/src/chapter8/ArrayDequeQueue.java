import java.util.ArrayDeque;

public class ArrayDequeQueue {
    public static void main(String[] args)
    {
        ArrayDeque queue = new ArrayDeque();
        queue.offer("lancibe");
        queue.offer("loves");
        queue.offer("fei");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
