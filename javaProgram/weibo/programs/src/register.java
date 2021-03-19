import javax.servlet.ServletException;
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

@WebServlet("/register.do")
public class register extends HttpServlet {
    private final String USERS =  "/home/lancibe/java/javaProgram/weibo/programs/users";
    private final String SUCCESS_VIEW = "success.view";
    private final String ERROR_VIEW = "error.view";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confirmedPasswd = req.getParameter("confirmedPasswd");
        List<String> errors = new ArrayList<>();
        if(isInvalidEmail(email))
        {
            errors.add("未填写邮箱或格式不正确");
        }
        if(isInvalidUsername(username))
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
            createUserData(email, username, password);
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
