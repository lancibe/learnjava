package chapter3;

import javax.imageio.ImageIO;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Locale;

@WebServlet("/chapter3.q1")
public class Q1 extends HttpServlet {
    private final String PATH = "/home/lancibe/java/JSP&Servlet/src/chapter3/OIP.jpeg";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("image/jpeg");
        String name = req.getParameter("name");
        File file = new File(PATH);

        Font font = new Font("Serif", Font.BOLD, 10);
        BufferedImage bufferedImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
        graphics2D.setBackground(Color.WHITE);
        graphics2D.clearRect(0, 0, 100, 100);
        graphics2D.setPaint(Color.RED);

        FontRenderContext context = graphics2D.getFontRenderContext();
        Rectangle2D bounds = font.getStringBounds(name, context);
        double x = (100 - bounds.getWidth()) / 2;
        double y = (100 - bounds.getHeight()) / 2;
        double ascent = -bounds.getY();
        double baseY = y + ascent;

        graphics2D.drawString(name, (int)x, (int)y);

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>addStringToImage</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<img src='"+ PATH +"'><br>");
        out.println("</body>");
        out.println("</html>");
    }
}
