import java.util.Hashtable;
import java.util.Objects;

class Ah
{
    int count;
    public Ah(int count)
    {
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return false;
        if(obj != null && obj.getClass() == Ah.class)
        {
            Ah a = (Ah)obj;
            return this.count == a.count;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.count;
    }
}

class Bh
{
    //重写equals方法

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
public class HashtableTest {
    public static void main(String[] args)
    {
        Hashtable ht = new Hashtable();
        ht.put(new Ah(123), "lancibe");
        ht.put(new Ah(234), "xun");
        ht.put(new Ah(345), new Bh());
        System.out.println(ht);
        System.out.println(ht.containsValue("test"));//返回true
        System.out.println(ht.containsKey(new Ah(123)));

        ht.remove(new Ah(345));
        System.out.println(ht);
    }
}
