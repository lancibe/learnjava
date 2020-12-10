import java.util.ArrayDeque;

public class ArrayDequeStack {
    public static void main(String[] args)
    {
        ArrayDeque stack = new ArrayDeque();
        stack.push("lancibe");
        stack.push("loves");
        stack.push("fei");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
