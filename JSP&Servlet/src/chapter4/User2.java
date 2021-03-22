package chapter4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HttpSessionDemoUser.view")
public class User2 extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        HttpSession session = request.getSession();
        if (session.getAttribute("login") == null)
        {
            response.sendRedirect("login.html");
        }
        else
        {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();

            out.println("<!DOCTYPE HTML PUBLIC>");
            out.println("<html>");
            out.println("<title>欢迎"+ session.getAttribute("login") +"</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>用户 "+ session.getAttribute("login") + "已登录</h1><br>");
            out.println("<br><a href='HttpSessionDemoLogout.view'>注销</a>");//执行注销的超链接
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
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
