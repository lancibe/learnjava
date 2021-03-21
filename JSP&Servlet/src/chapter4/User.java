package chapter4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CookieDemoUser.view")
public class User extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        if(request.getAttribute("user") == null)
        {
            response.sendRedirect("CookieDemoLogin.html");
        }
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01" + " Transitional//EN'>");
        out.println("<html>");
        out.println("<title>Servlet User</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" +
                request.getAttribute("user") + "已登录</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
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
