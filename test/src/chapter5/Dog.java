public class Dog {
    public void jump()
    {
        System.out.println("正在jump");
    }

    public void run()
    {
        this.jump();
        System.out.println("正在run");
    }
}
