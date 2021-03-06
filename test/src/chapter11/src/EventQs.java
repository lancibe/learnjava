import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventQs {
    private Frame f = new Frame("test");
    private Button ok = new Button("确定");
    private TextField tf = new TextField(30);
    public void init()
    {
        //注册事件监听器
        ok.addActionListener(new OkListener());
        f.add(tf);
        f.add(ok, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);

    }
    //定义事件监听器类
    class OkListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("用户单击了ok按钮");
            tf.setText("Hello world");
        }
    }

    public static void main(String[] args) {
        new EventQs().init();
    }
}
