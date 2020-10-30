class Animals
{
    private void beat()
    {
        System.out.println("心脏跳动");
    }
    public void breath()
    {
        beat();
        System.out.println("呼吸中");
    }
}
class Birds extends Animals
{
    public void fly()
    {
        System.out.println("自由地飞翔");
    }
}
class Wolfs extends Animals
{
    public void run()
    {
        System.out.println("快速地奔跑");
    }
}

public class InheritTest {
    public static void main(String[] args)
    {
        Birds b = new Birds();
        b.breath();
        b.fly();
        Wolfs w = new Wolfs();
        w.breath();
        w.run();
    }
}
