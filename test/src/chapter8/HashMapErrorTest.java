import java.util.HashMap;
import java.util.Iterator;

public class HashMapErrorTest {
    public static void main(String[] args)
    {
        HashMap ht = new HashMap();
        ht.put(new Ah(123), "lancibe");
        ht.put(new Ah(234), "xun");

        //获得Hashtable的keySet集合对应的迭代器
        Iterator it =ht.keySet().iterator();
        //取出Map中的第一个key，所对应的key-value对
        Ah first = (Ah)it.next();
        first.count = 14233;
        System.out.println(ht);

        ht.remove(new Ah(14233));
        System.out.println(ht);
        //无法获取剩下的value，将输出null
        System.out.println(ht.get(new Ah(14233)));
        System.out.println(ht.get(new Ah(123)));
    }
}
