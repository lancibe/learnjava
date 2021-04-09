import cn.ty.lq.Fye;
import cn.ty.lq.cxda;
import cn.ty.lq.pagban;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet("/Servletbao")
public class Servletbao extends HttpServlet {
    protected void doPost(HttpServletRequest  request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Map<String, String[]> parameterMap = request.getParameterMap();
 //       System.out.println(parameterMap.get("jg"));
        Set<String> strings = parameterMap.keySet();
        for (String s : strings) {
            System.out.println(s+":"+parameterMap.get(s));
        }
        String currpage = request.getParameter("c");
        String rows = request.getParameter("rs");
        if(currpage==null||rows==null){
            currpage="0";
            rows="5";
        }
        pagban tets = cxda.tets(Integer.parseInt(currpage), Integer.parseInt(rows),parameterMap);
        request.setAttribute("p",tets);
        request.getRequestDispatcher("yem1.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
