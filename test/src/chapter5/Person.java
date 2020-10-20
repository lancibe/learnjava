public class Person {
    public String name;
    public int age;

    public void say(String content)
    {
        System.out.println(content);
    }
    public static void main(String[] args)
    {
        Person p;
        p = new Person();

        p.name = "lancibe";
        p.say("lancibe programming NO.1!");
        System.out.println(p.name);
    }
}
