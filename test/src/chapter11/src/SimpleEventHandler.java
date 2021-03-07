import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleEventHandler extends WindowAdapter {
    private Frame f = new Frame("test");
    private TextArea ta = new TextArea(6, 40);
    public void init()
    {
        //将该类的默认对象作为事件监听器对象
        f.addWindowListener(this);
        f.add(ta);
        f.pack();
        f.setVisible(true);
    }
    public void windowClosing(WindowEvent e)
    {
        System.out.println("用户关闭窗口\n");
        System.exit(0);
    }

    public static void main(String[] args) {
        new SimpleEventHandler().init();
    }
}
