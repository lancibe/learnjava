import javax.swing.*;
import java.awt.*;

public class BoxLayoutTest {
    private Frame f = new Frame("测试窗口");
    public void init()
    {
        f.setLayout(new BoxLayout(f, BoxLayout.Y_AXIS));
        //下面按钮将会垂直排列
        f.add(new Button("first"));
        f.add(new Button("second"));
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutTest().init();
    }
}
