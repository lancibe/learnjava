public class MultiExceptionTest {
    public static void main(String[] args) {
        try
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println("您输入的两个数相除的结果是："+c);
        }
        catch (IndexOutOfBoundsException|NumberFormatException|ArithmeticException ie)
        {
            System.out.println("程序发生了数组越界、数字格式异常、算数异常之一");
            //有final修饰 故下面代码错误
            //ie = new ArithmeticException("test");
        }
        catch (Exception e)
        {
            System.out.println("未知异常");
            //没有final修饰 故下面代码正确
            e = new RuntimeException("test");
        }
    }
}
