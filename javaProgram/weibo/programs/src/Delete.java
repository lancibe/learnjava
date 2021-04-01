import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/delete.do"},
        initParams = {
                @WebInitParam(name = "SUCCESS_VIEW", value = "member.view")
        }
)
public class Delete extends HttpServlet {
    private final String USERS= "/home/lancibe/java/javaProgram/weibo/programs/users";
    private String SUCCESS_VIEW;
    private final String LOGIN_VIEW = "index.html";

    @Override
    public void init() throws ServletException {
        SUCCESS_VIEW = getServletConfig().getInitParameter("SUCCESS_VIEW");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("login") ==null)
        {
            resp.sendRedirect(LOGIN_VIEW);
            return;
        }
        String username = (String) req.getSession().getAttribute("login");
        String message = req.getParameter("message");
        UserService userService = (UserService)getServletContext().getAttribute("userService");
        userService.deleteMessage(username, message);
        resp.sendRedirect(SUCCESS_VIEW);
    }
}
