package chapter4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HttpSessionDemoLogout.view")
public class Logout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        HttpSession session = req.getSession();
        String user = (String) session.getAttribute("login");
        session.invalidate();//使HttpSession失效

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE HTML>");
        out.println("<html>");
        out.println("<title>注销</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>用户 "+ user + "已注销</h1><br>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
