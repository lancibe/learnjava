package chapter3;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@WebServlet("/chapter3.q2")
public class Q2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Q2Captcha captcha = new Q2Captcha();
        resp.setHeader("Cache-Control", "no-cache");
        resp.setContentType("image/jpeg");
        BufferedImage bufferedImage = captcha.getImage();
        ImageIO.write(bufferedImage, "JPEG", resp.getOutputStream());
        String verified = captcha.getText();
        req.getSession().setAttribute("verified", verified);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}
