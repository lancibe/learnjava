import java.util.TreeSet;

class Z implements Comparable
{
    int age;
    public Z(int age)
    {
        this.age = age;
    }
    //重写equals方法，总是返回true
    public boolean equals(Object obj)
    {
        return true;
    }
    //重写了compareTo方法，总是返回1
    public int compareTo(Object obj)
    {
        return 1;
    }
}
public class TreeSetTest2 {
    public static void main(String[] args)
    {
        TreeSet set = new TreeSet();
        Z z1 = new Z(6);
        set.add(z1);
        System.out.println(set.add((z1)));
        //下面输出set集合，会发现有两个元素
        System.out.println(set);
        //修改set集合的第一个元素的age变量
        ((Z)(set.first())).age = 9;
        //输出set集合的最后一个元素的age变量，发现也变为了9
        System.out.println(((Z)(set.last())).age);
    }
}
