package denglu;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/Servletdenglu1")
public class Servletdenglu1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        Object yzm1 = session.getAttribute("yzm");
        session.removeAttribute("yzm");
        String yh = request.getParameter("yh");
        String mm = request.getParameter("mm");
        String yzm = request.getParameter("yzm");
        System.out.println(yzm+":"+yzm1);
        if (yzm1.equals(yzm)) {
            int pd = pddenglu.pd(yh,mm);
            System.out.println(yh+":"+mm);
         if(pd==1){
             request.getSession().setAttribute("yy",yh);
             request.getRequestDispatcher("/yem1.jsp").forward(request,response);
         }else{
             response.getWriter().write("<h1>用户名或者是密错误！</h1>");
         }
        }else{
            response.getWriter().write("<h1>验证码密错误！</h1>");
        }

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
