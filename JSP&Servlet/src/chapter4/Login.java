package chapter4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CookieDemoLogin.do")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String passwd = req.getParameter("passwd");
        if("lancibe".equals(user) && "123456".equals(passwd))
        {
            String login = req.getParameter("login");
            if("auto".equals(login))
            {
                Cookie cookie = new Cookie("user", "lancibe");
                cookie.setMaxAge(7*24*60*60);
                resp.addCookie(cookie);
            }
            req.setAttribute("user", user);
            req.getRequestDispatcher("CookieDemoUser.view").forward(req,resp);
        }
        else
        {
            resp.sendRedirect("CookieDemoLogin.html");
        }
    }
}
