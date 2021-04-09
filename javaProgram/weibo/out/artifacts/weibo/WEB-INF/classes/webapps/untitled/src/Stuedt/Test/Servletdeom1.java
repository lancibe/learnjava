package Stuedt.Test;

import Stuedt.Stuedet;
import Stuedt.Stuendtsdeom1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/Servletdeom1")
public class Servletdeom1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");     //相应告诉浏览器   文本的编码
        request.setCharacterEncoding("utf-8");
        List<Stuedet> show = Stuendtsdeom1.show();
        for (int i = 0; i <show.size() ; i++) {
            response.getWriter().write(show.get(i).getName()+":"+show.get(i).getDz()+":"+show.get(i).getQq()+"<br>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
