import java.awt.*;
import static java.awt.BorderLayout.*;

public class BorderLayoutTest {
    public static void main(String[] args) {
        Frame f = new Frame("测试窗口");
        f.setLayout(new BorderLayout(30, 5));
        f.add(new Button("SOUTH"),SOUTH);
        f.add(new Button("NORTH"),NORTH);
        f.add(new Button("default"));
        f.add(new Button("EAST"), EAST);
        f.add(new Button("WEST"), WEST);

        f.pack();
        f.setVisible(true);
    }
}
