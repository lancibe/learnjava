import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class HandDraw {
    //画图区的宽度
    private final int AREA_WIDTH = 500;
    //画图区高度
    private final int AREA_HEIGHT = 400;
    //下面的preX、preY保存了上一次鼠标拖动事件的鼠标坐标
    private int preX = -1;
    private int preY = -1;
    //定义一个右键菜单用于设置画笔颜色
    PopupMenu pop = new PopupMenu();
    MenuItem redItem = new MenuItem("red");
    MenuItem greenItem = new MenuItem("green");
    MenuItem blueItem = new MenuItem("blue");
    //定义一个BufferedImage对象
    BufferedImage image = new BufferedImage(AREA_WIDTH, AREA_HEIGHT, BufferedImage.TYPE_INT_RGB);
    //获取image对象的Graphics
    Graphics g = image.getGraphics();
    private Frame f = new Frame("简单手绘程序");
    private DrawCanvas drawArea = new DrawCanvas();
    //用于保存画笔颜色
    private Color foreColor = new Color(255, 0, 0);

    public void init()
    {
        ActionListener menuListener = e->
        {
            if(e.getActionCommand().equals("green"))
                foreColor = new Color(0, 255, 0);
            if(e.getActionCommand().equals("red"))
                foreColor = new Color(255, 0, 0);
            if(e.getActionCommand().equals("blue"))
                foreColor = new Color(0, 0, 255);
        };
        //为三个菜单添加事件监听器
        redItem.addActionListener(menuListener);
        blueItem.addActionListener(menuListener);
        greenItem.addActionListener(menuListener);
        //将菜单组合成右键菜单
        pop.add(redItem);
        pop.add(greenItem);
        pop.add(blueItem);
        //将右键菜单添加到drawArea对象中
        drawArea.add(pop);
        //将Image对象的背景色填充为白色
        g.fillRect(0, 0, AREA_WIDTH, AREA_HEIGHT);
        drawArea.setPreferredSize(new Dimension(AREA_WIDTH, AREA_HEIGHT));
        //监听鼠标移动动作
        drawArea.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if(preX > 0 && preY > 0)
                {
                    g.setColor(foreColor);
                    g.drawLine(preX, preY, e.getX(), e.getY());
                }
                preX = e.getX();
                preY = e.getY();
                drawArea.repaint();
            }
        });

        drawArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger())
                {
                    pop.show(drawArea, e.getX(), e.getY());
                }
                preX = -1;
                preY = -1;
            }
        });
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.add(drawArea);
        f.pack();
        f.setVisible(true);
    }

    class DrawCanvas extends Canvas
    {
        //重写paint
        @Override
        public void paint(Graphics g)
        {
            g.drawImage(image, 0, 0, null);
        }
    }

    public static void main(String[] args) {
        new HandDraw().init();
    }
}
