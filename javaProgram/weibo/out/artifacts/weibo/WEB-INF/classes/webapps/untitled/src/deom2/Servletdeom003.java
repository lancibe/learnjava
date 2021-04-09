package deom2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servletdeom003")
public class Servletdeom003 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();      //获取Conkei对象得内容   并且返回了一个     Coonkei数组
        if(cookies!=null){
            for (Cookie cookie : cookies) {
                String name = cookie.getName();  //获取名
                String value = cookie.getValue(); //获取值
                System.out.println(name+":"+value);
                cookie.setMaxAge(0);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
