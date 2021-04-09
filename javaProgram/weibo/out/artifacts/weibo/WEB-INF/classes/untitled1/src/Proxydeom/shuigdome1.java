package Proxydeom;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class shuigdome1 {
    public static void main(String[] args) {
           shuigtest shuigtest=new shuigtest();
        shuig proxry = (shuig) Proxy.newProxyInstance(shuigtest.getClass().getClassLoader(), shuigtest.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            /*
                  proxy：代理对象
                  method： 代理对象调用的方法 被封装成了对象
                  args：传递的实际参数

             *
             * */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName());

                return null;
            }
        });
         proxry.show();
    }
}
