package chapter4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CookieDemoIndex.do")
public class Index extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Cookie[] cookies = request.getCookies();
        if(cookies != null)
        {
            for(Cookie cookie : cookies)
            {
                String name = cookie.getName();
                String value = cookie.getValue();
                if("user".equals(name) && "lancibe".equals(value))
                {
                    request.setAttribute(name, value);
                    request.getRequestDispatcher("/CookieDemoUser.view").forward(request, response);
                    return;
                }
            }
        }
        response.sendRedirect("CookieDemoLogin.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
