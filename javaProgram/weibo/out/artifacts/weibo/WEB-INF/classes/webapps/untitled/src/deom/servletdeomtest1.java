package deom;

import Utils.DownLoadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/servletdeomtest1")
public class servletdeomtest1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filename = request.getParameter("filename");
         //获取参数
        ServletContext context = this.getServletContext();
        String realPath = context.getRealPath("/img/" + filename);
        FileInputStream fis=new FileInputStream(realPath);
        String mimeType = context.getMimeType(filename);
        String header = request.getHeader("user-agent");
         filename = DownLoadUtils.getFileName(header, filename);
        response.setHeader("content-disposition","attachment;filename="+filename);

        //将输入流得数据写出到输出流中
        ServletOutputStream outputStream = response.getOutputStream();
        byte[] bytes=new byte[1024];
        int i=0;
        while ((i=fis.read(bytes))!=-1){
         outputStream.write(bytes,0,i);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 this.doPost(request,response);
    }
}
