public class ConstructorTest {
    public String name;
    public int count;

    public ConstructorTest(String name, int count)
    {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args)
    {
        ConstructorTest tc = new ConstructorTest("lancibe", 11);
        System.out.println(tc.name);
        System.out.println(tc.count);
    }
}
