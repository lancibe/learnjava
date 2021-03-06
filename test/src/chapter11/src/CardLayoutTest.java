import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CardLayoutTest {
    Frame f = new Frame("测试窗口");
    String[] names = {"1st", "2nd", "3rd", "4th", "5th"};
    Panel p1 = new Panel();
    public void init()
    {
        final CardLayout c = new CardLayout();
        p1.setLayout(c);
        for(int i = 0 ; i < names.length ; i++)
        {
            p1.add(names[i], new Button(names[i]));
        }
        Panel p = new Panel();
        ActionListener listener = e ->
        {
            switch (e.getActionCommand())
            {
                case "previous":
                    c.previous(p1);
                    break;
                case "next":
                    c.next(p1);
                    break;
                case "first":
                    c.first(p1);
                    break;
                case "last":
                    c.last(p1);
                    break;
                case "third":
                    c.show(p1, "3rd");
                    break;
            }
        };
        //控制显示上一张的按钮
        Button previous = new Button("previous");
        previous.addActionListener(listener);
        Button next = new Button("next");
        next.addActionListener(listener);
        Button first = new Button("first");
        first.addActionListener(listener);
        Button last = new Button("last");
        last.addActionListener(listener);
        Button third = new Button("third");
        third.addActionListener(listener);

        p.add(previous);
        p.add(next);
        p.add(first);
        p.add(last);
        p.add(third);
        f.add(p1);
        f.add(p, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutTest().init();
    }
}
