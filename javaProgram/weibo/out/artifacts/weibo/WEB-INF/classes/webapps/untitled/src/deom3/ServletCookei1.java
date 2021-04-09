package deom3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/ServletCookei1")
public class ServletCookei1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             response.setContentType("text/html;charset=utf-8");
            Cookie[] cookies = request.getCookies();
           if(cookies!=null){
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
               if(name.equals("kh")){
                   String value = cookie.getValue();
              //     value=URLEncoder.encode(value,"utf-8");
                   response.getWriter().write("<h1>欢迎您再次访问，你上次访问得时间上："+value+"</h1>");
                   System.out.println(value);
                   Date date=new Date();
                   SimpleDateFormat  sb=new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
                   String format = sb.format(date);
                 //   format = URLEncoder.encode(format, "utf-8");
                    cookie.setMaxAge(60*60*24*30);
                    cookie.setValue(format);
             break;
               }
            }
        }else{
            Date date=new Date();
            SimpleDateFormat  sb=new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
            String format = sb.format(date);
            Cookie cookie=new Cookie("kh",format);
            response.addCookie(cookie);
            response.getWriter().write("<h1>欢迎您首次访问</h1>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
