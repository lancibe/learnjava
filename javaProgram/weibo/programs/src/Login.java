import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/login.do"},
        initParams = {
                @WebInitParam(name = "SUCCESS_VIEW", value = "member.view"),
                @WebInitParam(name = "ERROR_VIEW", value = "index.html")
        }
)
public class Login extends HttpServlet {
    private final String USERS= "/home/lancibe/java/javaProgram/weibo/programs/users";
    private String SUCCESS_VIEW;
    private String ERROR_VIEW;

    @Override
    public void init() throws ServletException {
        SUCCESS_VIEW = getServletConfig().getInitParameter("SUCCESS_VIEW");
        ERROR_VIEW = getServletConfig().getInitParameter("ERROR_VIEW");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserService userService = (UserService)getServletContext().getAttribute("userService");
        String page = ERROR_VIEW;
        if(userService.checkLogin(username, password))
        {
            req.getSession().setAttribute("login", username);
            page = SUCCESS_VIEW;
        }
        resp.sendRedirect(page);
    }
    private boolean checkLogin(String username, String password) throws IOException
    {
        if(username != null && password != null)
        {
            for(String file : new File(USERS).list())
            {
                if(file.equals(username))
                {
                    BufferedReader reader = new BufferedReader(new FileReader(USERS + "/" + file + "/profile"));
                    String passwd = reader.readLine().split("\t")[1];
                    if(passwd.equals(password))
                        return true;
                }
            }
        }
        return false;
    }
}
