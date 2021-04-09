package Stuedt.Test;

import Stuedt.Stuedet;
import Stuedt.addtets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servletaddtets")
public class Servletaddtets extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
           String name = request.getParameter("name");
           String dz=request.getParameter("dz");
           String qq=request.getParameter("qq");
       Boolean i = addtets.add(new Stuedet(name, dz, qq));
        if(i){
            response.getWriter().write("数据添加成功<script> alert('添加成功');  window.location.href='Stuets.jsp';</script>");
        }else{
            response.getWriter().write("数据添加失败<script> alert('添加失败');  window.location.href='Stuets.jsp';</script>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
