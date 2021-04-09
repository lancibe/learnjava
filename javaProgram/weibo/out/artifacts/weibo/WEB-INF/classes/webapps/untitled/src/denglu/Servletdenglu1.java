package denglu;

import tets.deom.Servletdemo2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servletdenglu1")
public class Servletdenglu1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = request.getCookies();
        String value="";
        for (Cookie cookie : cookies) {
            value = cookie.getValue();
        }
        String yh = request.getParameter("yh");
        String mm = request.getParameter("mm");
        String yzm = request.getParameter("yzm");
        if (value.equals(yzm)) {
            int pd = pddenglu.pd(yh,mm);
            System.out.println(yh+":"+mm);
         if(pd==1){
             request.setAttribute("yh",yh);
             request.getRequestDispatcher("/Stetsdeom1").forward(request,response);
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
