import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class SimpleDraw {
    private final String RECT_SHAPE = "rect";
    private final String OVAL_SHAPE = "oval";
    private Frame f = new Frame("简单绘图");
    private Button rect = new Button("绘制矩形");
    private Button oval = new Button("绘制圆形");
    private MyCanvas drawArea = new MyCanvas();
    private String shape = "";

    class MyCanvas extends Canvas
    {
        //重写方法，实现绘画
        public void paint(Graphics g)
        {
            Random rand = new Random();
            if (shape.equals(RECT_SHAPE))
            {
                //设置画笔颜色
                g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                //随机地绘制一个矩形框
                g.drawRect(rand.nextInt(200),
                        rand.nextInt(120), 40, 60);
            }
            if (shape.equals(OVAL_SHAPE))
            {
                //设置画笔颜色
                g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                g.fillOval(rand.nextInt(200),
                        rand.nextInt(120), 50, 40);
            }
        }
    }
    public void init()
    {
        Panel p = new Panel();
        rect.addActionListener(e ->
        {
            shape = RECT_SHAPE;
            drawArea.repaint();
        });
        oval.addActionListener(e ->
        {
            shape = OVAL_SHAPE;
            drawArea.repaint();
        });
        p.add(rect);
        p.add(oval);
        drawArea.setPreferredSize(new Dimension(250, 180));
        f.add(drawArea);
        f.add(p, BorderLayout.SOUTH);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleDraw().init();
    }
}
