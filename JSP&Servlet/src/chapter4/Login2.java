package chapter4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/HttpSessionDemoLogin.do")
public class Login2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String passwd = req.getParameter("passwd");
        if("lancibe".equals(user) && "123456".equals(passwd))
        {
            req.getSession().setAttribute("login", user);
            req.getRequestDispatcher("/HttpSessionDemoUser.view").forward(req, resp);
        }
        else
        {
            resp.sendRedirect("Login.html");
        }
    }
}
