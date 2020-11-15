interface Eatable
{
    void taste();
}
interface Flyable
{
    void fly(String weather);
}
interface Addable
{
    int add(int a, int b);
}

public class LambdaQs {
    //调用该方法需要Eatable对象
    public void eat(Eatable e)
    {
        System.out.println(e);
        e.taste();
    }
    //调用该方法需要Flyable对象
    public void drive(Flyable f)
    {
        System.out.println("我正在驾驶："+f);
        f.fly("晴天");
    }
    //调用该方法需要Addable
    public void test(Addable add)
    {
        System.out.println("5和3的和是"+add.add(5,3));
    }
    public static void main(String[] args)
    {
        LambdaQs lq = new LambdaQs();
        lq.eat(()->System.out.println("苹果味道不错"));
        lq.drive(weather->
        {
            System.out.println("今天天气是："+weather);
            System.out.println("直升机飞行平稳");
        });
        lq.test((a,b)->a+b);
    }
}
