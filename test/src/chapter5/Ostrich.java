package bird;
import bird.*;

public class Ostrich extends bird.Bird {
    public void fly()
    {
        System.out.println("我不会飞");
    }
    public static void main(String[] args)
    {
        Ostrich os = new Ostrich();
        os.fly();
    }
}
