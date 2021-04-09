package cn.ty.lq;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import static jdk.nashorn.internal.objects.NativeMath.random;

@WebServlet("/servletdemo2")
public class Servletdemo2 extends HttpServlet {
    protected void  doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuffer  sb=new StringBuffer();
        int white=100;
        int  height=50;
        BufferedImage img=new BufferedImage(white,height,BufferedImage.TYPE_INT_ARGB);
        Graphics g = img.getGraphics();
         g.setColor(Color.pink);
         g.fillRect(0,0,white,height);

         g.setColor(Color.green);
         g.drawRect(0,0,white-1,height-1);
        g.setFont(new Font("黑体",Font.BOLD,30));  //字体大小和呈现形式
        g.setColor(Color.green);  //设置文本颜色
         String chara="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm0123456789";
        Random random=new Random();
        for (int i = 1; i <=4 ; i++) {
           int  j=random.nextInt(chara.length());
            char c = chara.charAt(j);
           sb.append(c);
             g.drawString(c+"",20*i,25);
        }
           request.getSession().setAttribute("yzm",sb.toString());
        for (int i = 0; i <5 ; i++) {
            int x1 = random.nextInt(white);
            int x2 = random.nextInt(white);
            int y1 = random.nextInt(height);
            int y2 = random.nextInt(height);
            g.drawLine(x1,y1,x2,y2);
        }

        ImageIO.write(img,"jpg",response.getOutputStream());
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     this.doPost(request,response);
    }
}
