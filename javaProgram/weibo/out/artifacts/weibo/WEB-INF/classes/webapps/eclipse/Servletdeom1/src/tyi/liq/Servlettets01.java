package tyi.liq;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlettets01
 */
@WebServlet("/Servlettets01")
public class Servlettets01 extends HttpServlet {


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
        }
    
		
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = request.getCookies();
        String value="";
        for (Cookie cookie : cookies) {
            value = cookie.getValue();
        }
        String yh = request.getParameter("yh");
        String mm = request.getParameter("mm");
        	int pd=Test.tets(yh,mm);
         if(pd==1){
             request.getRequestDispatcher("/Stetsdeom1").forward(request,response);
         }else{
             response.getWriter().write("<h1>用户名或者是密错误！</h1>");
         }
	}

}
