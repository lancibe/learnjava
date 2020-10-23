public class Recursive {
    public static int func(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n==1)
        {
            return 4;
        }
        else
        {
            return 2*func(n-1) + func(n-2);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(func(10));
    }
}
