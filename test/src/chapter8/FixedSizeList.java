import java.util.Arrays;
import java.util.List;

public class FixedSizeList {
    public static void main(String[] args)
    {
        List fixedList = Arrays.asList("lancibe", "loves", "fei");
        //获取fixedList的实现类，讲输出Arrays$ArrayList
        System.out.println(fixedList.getClass());
        //使用方法引用遍历集合元素
        fixedList.forEach(System.out::println);
        //试图增加、删除元素都会引发不支持的操作异常
        fixedList.add("jubilant");
        fixedList.remove("lancibe");
    }
}
