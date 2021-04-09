package denglu;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class Filterdeom1 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //1.强转
        HttpServletRequest request= (HttpServletRequest) req;
        String uri = request.getRequestURI();
               if(uri.contains("/yzm.html")||uri.contains("/Servletdenglu1")||uri.contains("/servletdemo2")||uri.contains("/Servletdenglu1")||uri.contains("/Stetsdeom1")){
                     chain.doFilter(req, resp);
               }else {
                   Object yh = request.getSession().getAttribute("yy");
                 if(yh!=null){
                       chain.doFilter(req, resp);
                 }else {
                     request.getRequestDispatcher("/yzm.html").forward(req,resp);
                 }
               }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
