import java.util.stream.IntStream;

public class IntStreamTest {
    public static void main(String[] args)
    {
        IntStream is = IntStream.builder()
                .add(20)
                .add(13)
                .add(-2)
                .add(18)
                .build();
        //下面调用聚类方法的代码每次只能执行一行
        //System.out.println("is所有元素的总和"+is.sum());
        //System.out.println("is所有元素的平方是否都大于20"+is.anyMatch(ele -> ele*ele > 20));

        //将is映射成一个新Stream，新Stream的每个元素是原Stream元素的2倍+1
        IntStream newIs = is.map(ele -> ele*2 +1);
        //使用方法引用的方式来遍历集合元素
        newIs.forEach(System.out::println);
    }
}
