import cn.ty.lq.Addtest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adddeom")
public class Adddeom extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        String id1 = request.getParameter("id");
        int id =Integer.parseInt(id1);
        String name = request.getParameter("name");
        String age1 = request.getParameter("age");
        int age = Integer.parseInt(age1);
        String jg = request.getParameter("jg");
        String qq = request.getParameter("qq");
        int i = Addtest.update(id, name, age, jg, qq);
        if(i>0){
            response.getWriter().write("添加成功!<a href='yem1.jsp' >返回首页</a>" );
        }else{
            response.getWriter().write("添加失败<a href='yem1.jsp' >返回首页</a>'");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
