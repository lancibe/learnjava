import cn.ty.lq.updatetest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servletupdate")
public class Servletupdate extends HttpServlet {
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
        System.out.println(id+name+age+jg+qq);
        int i = updatetest.update(id, name, age, jg, qq);
        if(i>0){
            response.getWriter().write("修改成功<a href='/Userquery_war_exploded/yem1.jsp'>返回首页</a>");
        }else{
            response.getWriter().write("修改失败<a href='/Userquery_war_exploded/yem1.jsp'>返回首页</a>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
