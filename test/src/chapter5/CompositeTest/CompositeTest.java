package chapter5.CompositeTest;
class Animal
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

class Bird
{
    private Animal a;
    public Bird(Animal a)
    {
        this.a=a;
    }

    public void breath()
    {
        a.breath();
    }

    public void fly()
    {
        System.out.println("自由地飞翔");
    }
}
class Wolf
{
    private Animal a;
    public Wolf(Animal a)
    {
        this.a = a;
    }
    public void breath()
    {
        a.breath();
    }
    public void run()
    {
        System.out.println("快速地奔跑");
    }
}

public class CompositeTest {
    public static void main(String[] args)
    {
        // 此时需要显式创建被组合的对象
        Animal a1 = new Animal();
        Bird b = new Bird(a1);
        b.breath();
        b.fly();

        Animal a2 = new Animal();
        Wolf w = new Wolf(a2);
        w.breath();
        w.run();
    }
}
