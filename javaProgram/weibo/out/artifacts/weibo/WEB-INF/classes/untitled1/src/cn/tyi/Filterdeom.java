package cn.tyi;

import javax.servlet.*;
import java.io.IOException;

public class Filterdeom implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器启动完成");
        filterChain.doFilter(servletRequest,servletResponse);  //放行
    }

    @Override
    public void destroy() {

    }
}
