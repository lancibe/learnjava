import java.awt.*;
import static java.awt.BorderLayout.*;

public class BorderLayoutTest2 {
    public static void main(String[] args) {
        Frame f = new Frame("测试窗口");
        f.setLayout(new BorderLayout(30, 5));
        f.add(new Button("SOUTH"), SOUTH);
        f.add(new Button("NORTH"), NORTH);

        Panel p = new Panel();
        p.add(new TextField(20));
        p.add(new Button("click me"));
        f.add(p);
        f.add(new Button("EAST"), EAST);
        f.pack();
        f.setVisible(true);
    }
}
