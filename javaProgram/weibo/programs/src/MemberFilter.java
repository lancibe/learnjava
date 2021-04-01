import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(
        urlPatterns = {"/delete.do", "/logout.do", "/message.do", "/member.view"},
        initParams = {
                @WebInitParam(name = "LOGIN_VIEW", value = "index.html")
        }
)
public class MemberFilter implements Filter {
    private String LOGIN_VIEW;
    public void init(FilterConfig config) throws ServletException
    {
        this.LOGIN_VIEW = config.getInitParameter("LOGIN_VIEW");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        if(req.getSession().getAttribute("login") != null){
            filterChain.doFilter(servletRequest, servletResponse);
        }
        else
        {
            HttpServletResponse resp = (HttpServletResponse)servletResponse;
            resp.sendRedirect(LOGIN_VIEW);
        }
    }

    @Override
    public void destroy() {
    }
}
