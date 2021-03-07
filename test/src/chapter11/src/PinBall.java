import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class PinBall {
    //桌面的宽度
    private final int TABLE_WIDTH = 300;
    //桌面高度
    private final int TABLE_HEIGHT = 400;
    //球拍的垂直位置
    private final int RACKET_Y = 340;

    //定义球拍的宽度、高度
    private final int RACKET_HEIGHT = 20;
    private final int RACKET_WIDTH = 60;

    //小球大小
    private final int BALL_SIZE = 16;
    private Frame f = new Frame("love you~");
    Random rand = new Random();

    //小球纵向运行速度
    private int ySpeed = 10;
    //返回一个-0.5~0.5的比率，用于控制小球的运行方向
    private double xyRate = rand.nextDouble() - 0.5;
    //小球横向运行速度
    private int xSpeed = (int)(ySpeed*xyRate*2);

    //ballX和ballY代表小球的坐标
    private int ballX = rand.nextInt(200) + 20;
    private int ballY = rand.nextInt(10) + 20;

    //racketX代表球拍的水平位置
    private int racketX = rand.nextInt(200);
    private MyCanvas tableArea = new MyCanvas();

    Timer timer;
    private int score = 0;

    //游戏是否结束的旗标
    private boolean isLose = false;

    public void init()
    {
        //设置桌面区域的最佳大小
        tableArea.setPreferredSize(new Dimension(TABLE_WIDTH, TABLE_HEIGHT));
        f.add(tableArea);
        //定义键盘监听器
        KeyAdapter keyProcessor = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT)
                {
                    if(racketX > 0)
                        racketX -= 10;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                {
                    if(racketX < TABLE_WIDTH-RACKET_WIDTH)
                        racketX += 10;
                }
            }
        };
        //增加“×”关闭
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //为窗口和tableArea对象分别添加键盘监听器
        f.addKeyListener(keyProcessor);
        tableArea.addKeyListener(keyProcessor);
        //定义每0.1秒执行一次的事件监听器
        ActionListener taskPerformer = evt ->
        {
            //如果小球碰到左右边框
            if(ballX <= 0 || ballX >= TABLE_WIDTH-BALL_SIZE)
                xSpeed=-xSpeed;
            //如果小球高度超出了球拍的位置，且横向不在球拍范围之内，则游戏结束
            if (ballY >= RACKET_Y -BALL_SIZE &&(ballX<racketX || ballX>racketX + RACKET_WIDTH))
            {
                timer.stop();
                isLose = true;
                tableArea.repaint();
            }
            //如果小球位于球拍之内， 且到达球拍位置，小球反弹
            else if (ballY <= 0 || (ballY >= RACKET_Y- BALL_SIZE && ballX> racketX&&ballX <=racketX +RACKET_WIDTH))
            {
                ySpeed=-ySpeed;
            }
            //小球坐标变化
            ballY += ySpeed;
            ballX += xSpeed;
            tableArea.repaint();
            score ++;
        };
        timer = new Timer(100, taskPerformer);
        timer.start();
        f.pack();
        f.setVisible(true);
    }

    class MyCanvas extends Canvas
    {
        //重写paint方法
        public void paint(Graphics g)
        {
            if (isLose) {
                g.setColor(new Color(255,0,0));
                g.setFont(new Font("Times", Font.BOLD, 25));
                g.drawString("游戏结束！\n你的得分是"+score , 50, 200 );
            }
            else
            {
                g.setColor(new Color(222, 118, 222, 255));
                g.fillOval(ballX,ballY,BALL_SIZE,BALL_SIZE);
                //设置颜色，并绘制球拍
                g.setColor(new Color(80, 80, 200, 200));
                g.fillRect(racketX, RACKET_Y, RACKET_WIDTH, RACKET_HEIGHT);
            }
        }
    }

    public static void main(String[] args) {
        new PinBall().init();
    }
}
