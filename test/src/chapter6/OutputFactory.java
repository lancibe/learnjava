public class OutputFactory {
    public Output getOutput()
    {
        return new Printer();
    }
    public static void main(String[] args)
    {
        OutputFactory of = new OutputFactory();
        Computer c = new Computer(of.getOutput());
        c.keyIn("lancibe");
        c.keyIn("fei");
        c.print();
    }
}
