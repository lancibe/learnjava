import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerTest {
    private Frame f = new Frame("test");
    private TextArea ta = new TextArea(6, 40);
    public void init()
    {
        f.addWindowListener(new MyListener());
        f.add(ta);
        f.pack();
        f.setVisible(true);
    }
    class MyListener implements WindowListener
    {
        @Override
        public void windowActivated(WindowEvent e) {
            ta.append("窗口被激活\n");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            ta.append("窗口被关闭\n");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            ta.append("用户关闭窗口\n");
            System.exit(0);
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            ta.append("窗口失去焦点\n");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            ta.append("窗口被恢复\n");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            ta.append("窗口被最小化\n");
        }

        @Override
        public void windowOpened(WindowEvent e) {
            ta.append("窗口初次被打开\n");
        }
    }

    public static void main(String[] args)
        throws Exception
    {
        new WindowListenerTest().init();
    }
}
