package chapter2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/q2")
public class Q2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try
        {
            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter out = resp.getWriter();

            out.println("<html>");
            out.println("<head>");
            out.println("<title>login</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("用户名:<input type=text name=username><br>");
            out.println("密&emsp;码:<input type=password name=password><br>");
            out.println("<a href=\"/war_exploded/q2\"><input type=submit value=登陆></a><br>");
            out.println("</body>");
            out.println("</html>");

            /*
            Enumeration<String> names = req.getParameterNames();
            String finalName = new String();
            String finalPassword = new String();
            while (names.hasMoreElements())
            {
                String name = names.nextElement();
                String value = req.getParameter(name);

                if(name.equals("username"))
                    finalName=value;
                if(name.equals("password"))
                    finalPassword=value;
            }
            if(finalName.equals("lancibe") && finalPassword.equals("123456"))
                resp.sendRedirect("./success.html");
            else
                resp.sendRedirect("./fail.html");

             */
        }
        catch (Exception ee)
        {
            ee.printStackTrace();
        }


    }
}
