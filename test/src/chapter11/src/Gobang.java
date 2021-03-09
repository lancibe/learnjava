import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Gobang {
    //下面三个位图分别代表棋盘、黑子、白子
    BufferedImage table;
    BufferedImage black;
    BufferedImage white;
    //当鼠标移动时出现选择框
    BufferedImage selected;
    //定义棋盘大小
    private static int BOARD_SIZE = 15;
    //定义棋盘宽、高的像素
    private final int TABLE_WIDTH = 535;
    private final int TABLE_HEIGHT = 536;
    //定义棋盘坐标的像素值和棋盘数组之间的比率
    private final int RATE = TABLE_WIDTH / BOARD_SIZE;
    //定义棋盘坐标的像素值和棋盘数组之间的偏移距离
    private final int X_OFFSET = 5;
    private final int Y_OFFSET = 6;
    //定义一个二维数组来充当棋盘
    private String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
    //五子棋游戏的窗口
    JFrame f = new JFrame("五子棋游戏");
    //五子棋游戏棋盘对应的Canvas组件
    ChessBoard chessBoard = new ChessBoard();
    //当前选中点的坐标
    private int selectedX = -1;
    private int selectedY = -1;

    public void init()
            throws Exception
    {
        table = ImageIO.read(new File("/home/lancibe/Pictures/board.jpg"));
        black = ImageIO.read(new File("/home/lancibe/Pictures/black.jpg"));
        white = ImageIO.read(new File("/home/lancibe/Pictures/white.jpg"));
        selected = ImageIO.read(new File(""))
    }
    class ChessBoard extends JPanel
    {
        //重写JPanel的paint方法，实现绘画
        public void paint(Graphics g)
        {
            //绘制五子棋棋盘
            g.drawImage(table , 0, 0, null);
            //绘制选中点的红框
            if (selectedX >= 0 && selectedY >= 0)
                g.drawImage(selected, selectedX* RATE + X_OFFSET, selectedY*RATE + Y_OFFSET, null);
            //遍历数组，绘制棋子
            for (int i = 0; i < BOARD_SIZE; i++)
            {
                for ( int j = 0; j < BOARD_SIZE; j++)
                {
                    //绘制黑棋
                    if(board[i][j].equals("1"))
                    {
                        g.drawImage(black, i*RATE + X_OFFSET, j *RATE +Y_OFFSET, null);
                    }
                    //绘制白棋
                    if(board[i][j].equals("2"))
                    {
                        g.drawImage(white, i*RATE +X_OFFSET, j*RATE+Y_OFFSET, null);
                    }
                }
            }
        }
    }
}
