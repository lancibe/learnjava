interface Product
{
    public double getPrice();
    public String getName();
}
public class AnonymousTest {
    public void test(Product p)
    {
        System.out.println("购买了一个"+p.getName()+"，花掉了"+p.getPrice());
    }
    public static void main(String[] args)
    {
        AnonymousTest ta = new AnonymousTest();
        ta.test(new Product() {
            @Override
            public String getName()
            {
                return "lancibe";
            }
            public double getPrice()
            {
                return 567.8;
            }
        });
    }
}
