class BaseClass
{
    public int a = 5;
}

public class SubClass extends BaseClass{
    public int a = 7;
    public void accessOwner()
    {
        System.out.println(a);
    }
    public void accessBase()
    {
        //通过super来限定访问从父类继承得到的a实例变量
        System.out.println(super.a);
    }
    public static void main(String[] args)
    {
        SubClass sc = new SubClass();
        sc.accessOwner();
        sc.accessBase();
    }
}
