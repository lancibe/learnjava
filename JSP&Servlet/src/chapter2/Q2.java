package chapter2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/q2login.view")
public class Q2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        try
        {
            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter out = resp.getWriter();

            String name = req.getParameter("username");
            String pwd = req.getParameter("password");
            if(name.equals("lancibe") && pwd.equals("123456"))
                resp.sendRedirect("pass.html");
            else
                resp.sendRedirect("refuse.html");
        }
        catch (Exception ee)
        {
            ee.printStackTrace();
        }


    }
}
