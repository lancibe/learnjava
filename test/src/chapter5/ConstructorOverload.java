public class ConstructorOverload {
    public String name;
    public int count;
    public ConstructorOverload(){}

    public ConstructorOverload(String name, int count)
    {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args)
    {
        ConstructorOverload oc1 = new ConstructorOverload();
        ConstructorOverload oc2 = new ConstructorOverload("lancibe", 11);

        System.out.println(oc1.name + " " + oc1.count);
        System.out.println(oc2.name + " " + oc2.count);
    }
}
