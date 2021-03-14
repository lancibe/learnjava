package chapter2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/q2_check")
public class Q2_check extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String user = req.getParameter("user");
        String psw = req.getParameter("psw");
        if(user.equals(new String("lancibe")) && psw.equals("123456"))
            resp.sendRedirect("./true");
        else
            resp.sendRedirect("./false");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>check</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("</body>");
        out.println("</html>");
    }
}
