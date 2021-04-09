package user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/success.view")
public class Success extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta content='text/html;charset=UTF-8'"+"http-equiv='content-type'>");
        out.println("<title>注册成功</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>会员 "+req.getParameter("username") + "注册成功</h1>");
        out.println("<a href='index.html'>回到登录界面</a>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
