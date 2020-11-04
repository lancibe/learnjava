package PrintObject;
class Person
{
    private String name;
    public Person(String name)
    {
        this.name = name;
    }
}

public class PrintObject {
    public static void main(String[] args)
    {
        Person p = new Person("lancibe");
        System.out.println(p);
    }
}
