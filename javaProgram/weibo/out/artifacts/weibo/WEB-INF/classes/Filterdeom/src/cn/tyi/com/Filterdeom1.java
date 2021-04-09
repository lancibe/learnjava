package cn.tyi.com;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.xml.ws.WebFault;
import java.io.IOException;

@WebFilter("/*")                //访问全部资源都会先执行过滤器
public class Filterdeom1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("我的第一个过滤器程序！");
       filterChain.doFilter(servletRequest,servletResponse); //放行
    }

    @Override
    public void destroy() {

    }
}
