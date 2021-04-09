package jtq;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import java.io.FileInputStream;

@WebListener
public class Listenerdeom1 implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("监听器删除");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("加载注册器");
        ServletContext servletContext = sce.getServletContext();
        String initParameter = servletContext.getInitParameter("namespace");
        String realPath = servletContext.getRealPath(initParameter);
        try {
            FileInputStream fis=new FileInputStream(realPath);
            System.out.println(fis);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
