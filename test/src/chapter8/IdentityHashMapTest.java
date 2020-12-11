import java.util.IdentityHashMap;

public class IdentityHashMapTest {
    public static void main(String[] args)
    {
        IdentityHashMap ihm = new IdentityHashMap();
        ihm.put(new String("语文"), 89);
        ihm.put(new String("语文"), 78);
        //下面两个代码只会添加一个key-value对
        ihm.put("java", 93);
        ihm.put("java", 98);
        System.out.println(ihm);
    }
}
