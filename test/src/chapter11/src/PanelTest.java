import java.awt.*;

public class PanelTest {
    public static void main(String[] args) {
        Frame f = new Frame("测试窗口");
        //创建一个Panel容器
        Panel p = new Panel();
        //向Panel容器中添加两个组件
        p.add(new TextField(20));
        p.add(new Button("click me"));
        //将Panel容器添加到Frame窗口中
        f.add(p);
        //设置窗口的大小、位置
        f.setBounds(30, 30, 250, 120);
        //将窗口显示出来
        f.setVisible(true);
    }
}
