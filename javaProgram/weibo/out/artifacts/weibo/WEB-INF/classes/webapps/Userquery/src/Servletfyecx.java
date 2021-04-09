import cn.ty.lq.Fye;
import cn.ty.lq.pagban;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servletfyecx")
public class Servletfyecx extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String currpage = request.getParameter("c");
        String rows = request.getParameter("rs");
        pagban tets = Fye.tets(Integer.parseInt(currpage), Integer.parseInt(rows));
        request.setAttribute("p",tets);
        request.getRequestDispatcher("yem1.jsp").forward(request,response);
     //   System.out.println(tets.getList());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
