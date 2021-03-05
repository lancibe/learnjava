import java.awt.*;

public class ScrollPaneTest {
    public static void main(String[] args) {
        Frame f = new Frame("测试窗口");
        //创建一个ScrollPane容器，指定总是具有滚动条
        ScrollPane sp = new ScrollPane(
                ScrollPane.SCROLLBARS_ALWAYS);
        //向ScrollPane容器中添加两个组件
        sp.add(new TextField(20));
        sp.add(new Button("click me"));
        f.add(sp);
        f.setBounds(30, 30, 250, 120);
        f.setVisible(true);
    }
}
