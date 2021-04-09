package cih;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@WebFilter("/*")
public class Filterdeom1 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        ServletRequest request = (ServletRequest) Proxy.newProxyInstance(req.getClass().getClassLoader(), req.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("getParameter")){     //当方法为getParmeter时
                    String value = (String) method.invoke(req, args);          //获取里面的参数
                  if(value!=null){                     //参数不为空
                      for (String s : list) {        //循环集合
                        if(value.contains(s)){           //判断  看看传进来的参数有不有包含  敏感词汇
                             value=value.replaceAll(s,"****");       //如果有就替换里面的敏感词汇
                        }
                      }
                  }
                  return value;
                }
                    if(method.getName().equals("getParameterMap")){
                        Map<String, String[]> parameterMap = req.getParameterMap();
                        Set<String> strings = parameterMap.keySet();
                        for (String s : strings) {
                            String ss = parameterMap.get(s)[0];
                            for (String li : list) {
                                if(ss.contains(li)){
                                    ss=ss.replaceAll(li,"***");
                                }
                            }
                         }
                    }

                  return method.invoke(req,args);
            }
        });


        chain.doFilter(request, resp);
    }
        private List<String> list=new ArrayList<String>();
    public void init(FilterConfig config) throws ServletException {

        try {
            //获取文件的路径
            //加载文件
            ServletContext servletContext = config.getServletContext();
            String realPath = servletContext.getRealPath("/WEB-INF/classes/敏感词汇.txt");
            //读取文件
            BufferedReader b = new BufferedReader(new InputStreamReader(new FileInputStream(realPath),"utf-8"));

            //将文件的每一行添加到list集合里面去
            String line=null;
            while ((line=b.readLine())!=null){
                list.add(line);               //把文件里面的文字添加到集合里面去
            }
            b.close();
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
