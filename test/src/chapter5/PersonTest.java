class Person
{
    public String names;
    public static int eyeNum;

    Person(int i){};
}

public class PersonTest {
    public static void main(String[] args)
    {
        //第一次主动使用Person类，该类自动进行初始化，则eyeNum变量开始起作用，输出0
        System.out.println("Person的eyeNum类变量"+Person.eyeNum);
        //创建Person对象
        Person p = new Person(1);

        //通过Person对象的引用p来访问Person对象的names实例变量，并通过实例访问eyeNum类变量
        System.out.println("p变量的names变量值是："+p.names +"p对象的eyeNum变量值是："+p.eyeNum);

        p.names = "lancibe";
        p.eyeNum = 2;

        //再次通过Person对象来访问name实例变量和eyeNum类变量
        System.out.println("p变量的names变量值是："+p.names +"p对象的eyeNum变量值是："+p.eyeNum);

        //前面通过p修改了Person的eyeNum，此处的Person.eyeNum将输出2
        System.out.println("Person的eyeNum类变量值："+Person.eyeNum);
        Person p2 = new Person(2);

        //p2访问的eyeNum类变量依然引用Person类的，因此依然输出2
        System.out.println("p2对象的eyeNum类变量值："+ p2.eyeNum);
    }
}
