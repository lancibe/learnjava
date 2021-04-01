import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

@WebServlet(
        urlPatterns = {"/message.do"},
        initParams = {
                @WebInitParam(name = "SUCCESS_VIEW", value = "member.view"),
                @WebInitParam(name = "ERROR_VIEW", value = "member.view")
        }
)
public class Message extends HttpServlet {
    private final String USERS= "/home/lancibe/java/javaProgram/weibo/programs/users";
    private final String LOGIN_VIEW = "index.html";
    private String SUCCESS_VIEW;
    private String ERROR_VIEW;

    @Override
    public void init() throws ServletException {
        SUCCESS_VIEW = getServletConfig().getInitParameter("SUCCESS_VIEW");
        ERROR_VIEW = getServletConfig().getInitParameter("ERROR_VIEW");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("login") == null)
        {
            resp.sendRedirect(LOGIN_VIEW);
            return;
        }
        req.setCharacterEncoding("UTF-8");
        String blabla = req.getParameter("blabla");
        if(blabla != null && blabla.length() != 0)
        {
            if(blabla.length() < 140)
            {
                String username = (String)req.getSession().getAttribute("login");
                UserService userService = (UserService)getServletContext().getAttribute("userService");
                userService.addMessage(username, blabla);
                resp.sendRedirect(SUCCESS_VIEW);
            }
            else
            {
                req.getRequestDispatcher(ERROR_VIEW).forward(req,resp);
            }
        }
        else
            resp.sendRedirect(ERROR_VIEW);
    }
    private void addMessage(String username, String blabla)throws IOException
    {
        String file = USERS + "/" + username + "/" + new Date().getTime() + ".txt";
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(file), "UTF-8")
        );
        writer.write(blabla);
        writer.close();
    }
}
