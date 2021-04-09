package keng;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/keng.Testdemo1")
public class Testdemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod();        //获取请求方式
        System.out.println(method);

        String contextPath = request.getContextPath();       //获取虚拟目录
        System.out.println(contextPath);

        String servletPath = request.getServletPath();  //获取Servlet下得路径
        System.out.println(servletPath);

        String queryString = request.getQueryString();//获取get方式得请求方式
        System.out.println(queryString);

        String requestURI = request.getRequestURI(); //获取请求得uri
        System.out.println(requestURI);
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);

        String protocol = request.getProtocol();//获取协议得版本
        System.out.println(protocol);

        String remoteAddr = request.getRemoteAddr();//获取客户得ip
        System.out.println(remoteAddr);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

}
