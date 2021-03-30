package chapter5;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "performance", urlPatterns = {"/*"})
public class PerformanceFilter implements Filter {
    private FilterConfig config;
    @Override
    public void init(FilterConfig config) throws ServletException{
        this.config = config;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long begin = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);
        config.getServletContext().log("Request process in " + (System.currentTimeMillis() - begin)+" milliseconds");
    }

    @Override
    public void destroy() {

    }
}
