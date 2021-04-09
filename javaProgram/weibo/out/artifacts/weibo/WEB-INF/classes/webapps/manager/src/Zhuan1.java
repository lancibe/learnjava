import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/zhuan1")
public class Zhuan1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("text/html;charset=utf-8");
     response.getWriter().write("登陆失败！");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*System.out.println("访问转1.......");
        request.setAttribute("p","hello");             //存储数据
        request.getRequestDispatcher("/zhuan2").forward(request,response);   //请求资源转发
*/
      this.doPost(request,response);
    }
}
