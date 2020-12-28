import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args)
    {
        //Comparator的实际类型时TreeSet的元素类型的父类，满足要求
        TreeSet<String> ts1 = new TreeSet<>(new Comparator<Object>() {
            @Override
            public int compare(Object fst, Object snd) {
                return hashCode() > snd.hashCode() ? 1
                        : hashCode() < snd.hashCode() ? -1 : 0;
            }
        });
        ts1.add("hello");
        ts1.add("wa");

        TreeSet<String> ts2 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() > o2.length() ? -1
                        : o1.length() < o2.length() ? 1 : 0;
            }
        });
        ts2.add("hello");
        ts2.add("wa");
        System.out.println(ts1);
        System.out.println(ts2);
    }
}
