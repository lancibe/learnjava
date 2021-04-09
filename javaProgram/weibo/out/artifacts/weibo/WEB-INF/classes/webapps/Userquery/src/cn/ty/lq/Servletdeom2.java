package cn.ty.lq;

import org.omg.CORBA.INTERNAL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Servletdeom2")
public class Servletdeom2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf8");
        int id = Integer.parseInt(request.getParameter("id"));
        int i = delete.tets(id);
        if(i>0){
            response.getWriter().write("删除成功<a href='/Userquery_war_exploded/yem1.jsp'>返回首页</a>");
        }else{
            response.getWriter().write("删除失败<a href='/Userquery_war_exploded/yem1.jsp'>返回首页</a>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
