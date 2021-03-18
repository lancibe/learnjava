package chapter3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet("/download.do")
public class Download extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String passwd = req.getParameter("passwd");
        if("123456".equals(passwd))
        {
            resp.setContentType("application/html");//设置内容类型
            InputStream in = getServletContext().getResourceAsStream("/WEB-INF/test.html");//取得输入串流
            OutputStream out = resp.getOutputStream();//取得输出串流
            writeBytes(in, out);//读取文件并输出至浏览器
        }
    }
    private void writeBytes(InputStream in, OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        int length = -1;
        while((length = in.read(buffer)) != -1)
        {
            out.write(buffer, 0, length);
        }
        in.close();
        out.close();
    }
}
