package cn.Selvet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/servletdeom1")
public class Servletdeom1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         shengfedao  s=new shengfedao();
        String ponses = s.hc();
        ObjectMapper objectMapper=new ObjectMapper();
        response.setContentType("application/json;charset=utf-8");
        System.out.println(ponses);
        String s1 = objectMapper.writeValueAsString(ponses);
        //objectMapper.writeValue(response.getWriter(),ponses);
        System.out.println(s1);
        response.getWriter().write(s1);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
