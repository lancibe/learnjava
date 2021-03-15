package chapter2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/q2")
public class Q2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
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

/*
            Enumeration<String> names = req.getParameterNames();
            String finalName = null;
            String finalPassword = null;
            while (names.hasMoreElements())
            {
                String name = names.nextElement();
                String value = req.getParameter(name);

                if(name.equals("username"))
                    finalName=value;
                if(name.equals("password"))
                    finalPassword=value;
            }
            System.out.println(finalName);
            System.out.println(finalPassword);
            out.println("<a href=\"/war_exploded/q2_check?user="+ finalName +"&psw="+ finalPassword +"\"><input type=\"button\" value=登陆></a><br>");
*/


            out.println("</body>");
            out.println("</html>");
        }
        catch (Exception ee)
        {
            ee.printStackTrace();
        }


    }
}
