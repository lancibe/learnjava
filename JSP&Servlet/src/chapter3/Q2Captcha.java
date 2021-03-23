package chapter3;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public class Q2Captcha {
    private final int weigh = 50;
    private final int height = 25;
    private final Random random = new Random();
    private final String[] fontNames = {"Source Code Pro", "FreeMono", "Courier New", "Times New Roman"};
    private final String codes = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final Color backgroundColor = new Color(255,255,255);
    private String text;

    private Color randomColor()
    {
        int red = random.nextInt(200);
        int green = random.nextInt(200);
        int blue = random.nextInt(200);
        return new Color(red, green, blue);
    }

    private Font randomFont()
    {
        int index = random.nextInt(fontNames.length);
        String fontName = fontNames[index];
        int style = random.nextInt(4);
        int size = random.nextInt(6) + 15;
        return new Font(fontName, style, size);
    }

    private void drawLine(BufferedImage image)
    {
        int num = 3;
        Graphics2D graphics2D = (Graphics2D)image.getGraphics();
        for(int i = 0 ; i < num ; i++)
        {
            int x1 = random.nextInt();
            int y1 = random.nextInt();
            int x2 = random.nextInt();
            int y2 = random.nextInt();
            graphics2D.setStroke(new BasicStroke(1.5F));
            graphics2D.setColor(Color.BLUE);
            graphics2D.drawLine(x1, y1, x2, y2);
        }
    }

    private char randomChar()
    {
        int index = random.nextInt(codes.length());
        return codes.charAt(index);
    }

    private BufferedImage createImage()
    {
        BufferedImage image = new BufferedImage(weigh, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = (Graphics2D)image.getGraphics();
        graphics2D.setColor(this.backgroundColor);
        graphics2D.fillRect(0, 0, weigh, height);
        return image;
    }

    public BufferedImage getImage()
    {
        BufferedImage image = createImage();
        Graphics2D graphics2D = (Graphics2D)image.getGraphics();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < 4 ; i++)
        {
            String s = randomChar()+"";
            stringBuilder.append(s);
            float x = i*1.0F*weigh/4;
            graphics2D.setFont(randomFont());
            graphics2D.setColor(randomColor());
            graphics2D.drawString(s, x, height - 5);
        }
        this.text = stringBuilder.toString();
        drawLine(image);
        return image;
    }

    public String getText()
    {
        return text;
    }

    private static void output(BufferedImage image, OutputStream out) throws IOException
    {
        ImageIO.write(image, "JPEG", out);
    }

}
