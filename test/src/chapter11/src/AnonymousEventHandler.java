import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonymousEventHandler {
    private Frame f = new Frame("test");
    private TextArea ta = new TextArea(6, 40);
    public void init()
    {
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("用户试图关闭窗口\n");
                System.exit(0);
            }
        });
        f.add(ta);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AnonymousEventHandler().init();
    }
}
