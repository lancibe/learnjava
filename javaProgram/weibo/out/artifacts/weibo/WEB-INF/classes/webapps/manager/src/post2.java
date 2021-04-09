import deom.Druidtest.DruidTest;
import deom.utilsgong.JDBcUtls;
import org.springframework.jdbc.core.JdbcTemplate;
import r.User;
import shujk.TEst;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/post2")
public class post2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String a = req.getParameter("p");
        String b = req.getParameter("m");
        User user = new User();
        user.setName(a);
        user.setName2(b);
    //    int i = TEst.tet(a,b);

           int i=TEst.tet(a,b);
        if(i==0){
            req.getRequestDispatcher("/zhuan1").forward(req,resp);
        }else{
            req.setAttribute("user",user);
            req.getRequestDispatcher("/zhuan2").forward(req,resp);
            System.out.println("ok");
        }


    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

         this.doGet(req,resp);
    }
}
