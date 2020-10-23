public class OverloadVarargs {
    public void test(String msg)
    {
        System.out.println("方法一");
    }
    public void test(String ... books)
    {
        System.out.println("方法二");
    }

    public static void main(String[] args)
    {
        OverloadVarargs olv = new OverloadVarargs();
        //下面两次调用将执行第二个test方法
        olv.test();
        olv.test("aa","bb");
        //下面调用将执行第一个test方法
        olv.test("aa");
        //下面调用将执行第二个test方法
        olv.test(new String[]{"aa"});
    }
}
