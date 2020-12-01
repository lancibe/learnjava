import java.util.HashSet;

class A
{
    //该类的equals方法总是返回true，但没有重写其hashCode方法
    public boolean equals (Object obj)
    {
        return true;
    }
}
class B
{
    //该类的hashCode方法总是返回1,但是没有重写其equals方法
    public int hashCode()
    {
        return 1;
    }
}
class C
{
    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 2;
    }
}
public class HashSetTest {
    public static void main(String[] args)
    {
        HashSet books = new HashSet();
        books.add(new A());
        books.add(new A());
        books.add(new B());
        books.add(new B());
        books.add(new C());
        books.add(new C());
        System.out.println(books);
    }
}
