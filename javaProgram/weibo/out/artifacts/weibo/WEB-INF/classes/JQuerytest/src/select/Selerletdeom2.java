package select;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.omg.CORBA.OBJ_ADAPTER;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/Selerletdeom2")
public class Selerletdeom2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //contain  ����     //msg   �ظ�����Ϣ
        response.setContentType("text/html;charset=utf-8");
        String username= request.getParameter("username");
        boolean inquiry = Username.inquiry(username);
        Map<String,Object> map=new HashMap<String, Object>();
        ObjectMapper  mapper=new ObjectMapper();
        if(inquiry){
            map.put("contain",inquiry);
            map.put("msg","�û����ظ��ˣ����㻻һ��");
        }else {
            map.put("contain",inquiry);
            map.put("msg","�û�������");
        }
        mapper.writeValue(response.getWriter(),map);
    }
}
