import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(
        urlPatterns = {"/register.do"},
        initParams = {
                @WebInitParam(name = "SUCCESS_VIEW", value = "success.view"),
                @WebInitParam(name = "ERROR_VIEW", value = "error.view")
        }
)
public class Register extends HttpServlet {
    private final String USERS =  "/home/lancibe/java/javaProgram/weibo/programs/users";
    private String SUCCESS_VIEW;
    private String ERROR_VIEW;

    @Override
    public void init() throws ServletException {
        SUCCESS_VIEW = getServletConfig().getInitParameter("SUCCESS_VIEW");
        ERROR_VIEW = getServletConfig().getInitParameter("ERROR_VIEW");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confirmedPasswd = req.getParameter("confirmedPasswd");
        UserService userService = (UserService)getServletContext().getAttribute("userService");
        List<String> errors = new ArrayList<>();
        if(isInvalidEmail(email))
        {
            errors.add("未填写邮箱或格式不正确");
        }
        if(userService.isInvalidUsername(username))
        {
            errors.add("用户名为空或已存在");
        }
        if(isInvalidPassword(password, confirmedPasswd))
        {
            errors.add("请确认密码符合格式病再次确认密码");
        }
        String resultPage = ERROR_VIEW;
        if(!errors.isEmpty())
        {
            req.setAttribute("errors", errors);
        }
        else
        {
            resultPage = SUCCESS_VIEW;
            userService.createUserData(email, username, password);
        }
        req.getRequestDispatcher(resultPage).forward(req, resp);
    }

    private boolean isInvalidEmail(String email)
    {
        return email == null || !email.matches("^[_a-z0-9-]+([.]" + "[_a-z0-9-]+)*@[a-z0-9-]+([.][a-z0-9-]+)*$");
    }
    private boolean isInvalidUsername(String username)
    {
        for(String file : new File(USERS).list())
        {
            if(file.equals(username))
                return true;
        }
        return false;
    }
    private boolean isInvalidPassword(String password, String confirmedPasswd)
    {
        return  password == null || password.length()<6 || password.length()>16 || !password.equals(confirmedPasswd);
    }
    private void createUserData(String email, String username, String password) throws IOException
    {
        File userhome = new File(USERS + "/" +username);
        userhome.mkdir();
        BufferedWriter writer = new BufferedWriter(new FileWriter(userhome + "/profile"));
        writer.write(email + "\t" + password);
        writer.close();
    }
}
