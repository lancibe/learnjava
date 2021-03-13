package chapter2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@WebServlet("/q1")
public class Q1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        //使用一个map集合来保存所有的参数列表
        Map<String, String[]> parameterMap= req.getParameterMap();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>q1</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("IP:"+req.getRemoteAddr()+ //该方法用于获得客户端的IP地址
                " 已于"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+ //获取系统日期、时间
                " 通过端口"+req.getRemotePort()+"连接至服务器"+"<br>");//获取客户端端口

        for(Map.Entry<String, String[]> entry : parameterMap.entrySet())
        {
            out.println("key="+entry.getKey() + ",value=" + entry.getValue()[0] +"<br>");
        }
        out.close();
    }
}
