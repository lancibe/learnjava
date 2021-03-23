import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/delete.do")
public class Delete extends HttpServlet {
    private final String USERS= "/home/lancibe/java/javaProgram/weibo/programs/users";
    private final String SUCCESS_VIEW = "member.view";
    private final String LOGIN_VIEW = "index.html";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("login") ==null)
        {
            resp.sendRedirect(LOGIN_VIEW);
            return;
        }
        String username = (String) req.getSession().getAttribute("login");
        String message = req.getParameter("message");
        File file = new File(USERS + "/" + username + "/" +message + ".txt");
        if(file.exists())
        {
            file.delete();
        }
        resp.sendRedirect(SUCCESS_VIEW);
    }
}
