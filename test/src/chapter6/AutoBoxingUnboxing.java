public class AutoBoxingUnboxing {
    public static void main(String[] args)
    {
        //直接把一个基本类型变量赋给Integer对象
        Integer inObj = 5;
        Object boolObj = true;
        int it = inObj;

        if(boolObj instanceof Boolean)
        {
            boolean b = (Boolean)boolObj;
            System.out.println(b);
        }
    }
}
