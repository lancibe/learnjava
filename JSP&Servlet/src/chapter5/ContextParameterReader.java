package chapter5;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;

@WebListener // 使用@WebListener标注
public class ContextParameterReader extends HttpServlet {
    public void contextInitialized(ServletContextEvent sce)
    {
        ServletContext context = sce.getServletContext();
        String avatars = context.getInitParameter("AVATAR");
        context.setAttribute("avatars", avatars);
    }
    public void contextDestroyed(ServletContextEvent sce){}
}
