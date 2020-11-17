public class EnumTest {
    public void judge(SeasonEnum s)
    {
        //switch语句里的表达式可以是枚举值
        switch (s)
        {
            case SPRING:
                System.out.println("spring");
                break;
            case SUMMER:
                System.out.println("summer");
                break;
            case FALL:
                System.out.println("fall");
                break;
            case WINTER:
                System.out.println("winter");
                break;
        }
    }
    public static void main(String[] args)
    {
        for(SeasonEnum a : SeasonEnum.values())
        {
            System.out.println(a);
        }
        //使用实例时，可以通过EnumClass.variable来访问
        new EnumTest().judge(SeasonEnum.SPRING);
    }
}
