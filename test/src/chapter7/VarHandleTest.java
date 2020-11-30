import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.Arrays;

class User
{
    String name;
    static int MAX_AGE;
}
public class VarHandleTest {
    public static void main(String[] args)
            throws Throwable
    {
        String[] sa = new String[]{"Lancibe", "love", "java"};
        //获取一个String[]数组的VarHandle对象
        VarHandle avh = MethodHandles.arrayElementVarHandle(String[].class);
        //比较并设置：如果第三个元素是java，则该元素被设置成python
        boolean r = avh.compareAndSet(sa, 2, "java", "python");
        //输出比较结果
        System.out.println(r);
        //看到第三个元素被替换
        System.out.println(Arrays.toString(sa));
        //获取sa数组的第二个元素
        System.out.println(avh.get(sa,1));
        //获取并设置：返回第三个元素，并将第三个元素设置为C++
        System.out.println(avh.getAndSet(sa, 2, "C++"));
        //看到第三个元素被替换成C++
        System.out.println(Arrays.toString(sa));

        //用findVarHandle方法获取User类中名为name、类型为String的实例变量
        VarHandle vh1 = MethodHandles.lookup().findVarHandle(User.class, "name", String.class);
        User user = new User();
        System.out.println(vh1.get(user));
        //通过VarHandle设置指定实例变量的值
        vh1.set(user, "孙悟空");
        //输出user的name实例变量的值
        System.out.println(user.name);
        //用findVarHandle方法获取User类中名为MAX_AGE、类型为Integer的类变量
        VarHandle vh2 = MethodHandles.lookup().findStaticVarHandle(User.class,"MAX_AGE", int.class);
        //通过VarHandle获取指定类变量的值
        System.out.println(vh2.get());
        //通过VarHandle设置指定类变量的值
        vh2.set(100);
        //输出User的MAX_AGE类变量
        System.out.println(User.MAX_AGE);
    }
}
