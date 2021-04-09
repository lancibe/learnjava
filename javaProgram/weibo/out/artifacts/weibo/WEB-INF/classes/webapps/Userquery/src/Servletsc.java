import cn.ty.lq.delete;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servletsc")
public class Servletsc extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String[] uids = request.getParameterValues("uid");
        int tets=0;
        for (int i = 0; i <uids.length ; i++) {
            int i1 = Integer.parseInt(uids[i]);
             if (delete.tets(i1)>0){
                 tets=tets+1;
             }
        }
        if(tets>0){
            response.getWriter().write("删除成功<a href='/Userquery_war_exploded/yem1.jsp'>返回首页</a>");
        }else{
            response.getWriter().write("删除失败<a href='/Userquery_war_exploded/yem1.jsp'>返回首页</a>");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
