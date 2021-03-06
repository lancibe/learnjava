package chapter5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name="ServletConfigDemo", urlPatterns={"/conf"},
        initParams={
                @WebInitParam(name="PARAM1",value="VALUE1"),
                @WebInitParam(name="PARAM2",value="VALUE2")
        })
public class ServletConfigDemo extends HttpServlet {
    private String PARAM1;
    private String PARAM2;
    public void init() throws ServletException {
        PARAM1 = getServletConfig().getInitParameter("PARAM1");
        PARAM2 = getServletConfig().getInitParameter("PARAM2");
    }
}
