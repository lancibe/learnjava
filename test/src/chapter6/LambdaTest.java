public class LambdaTest {
    Runnable r = ()->{
        for (int i = 0 ; i < 100 ; i++)
        {
            System.out.println();
        }
    };
    Object obj1 = (Runnable)()->{
        for (int i = 0 ; i < 100 ; i++)
        {
            System.out.println();
        }
    };

    @FunctionalInterface
    interface FkTest
    {
        void run();
    }

    Object obj2 = (FkTest)() ->{
        for(int i = 0 ; i < 100 ; i++)
        {
            System.out.println();
        }
    };
}
