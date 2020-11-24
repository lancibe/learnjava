import java.util.Objects;

public class ObjectsTest {
    static ObjectsTest obj;
    public static void main(String[] args)
    {
        System.out.println(Objects.hashCode(obj));
        System.out.println(Objects.toString(obj));
        //obj不能为null，如果obj为null则引发异常
        System.out.println(Objects.requireNonNull(obj, "obj参数不能是null"));
    }
}
