import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

public class SimpleClipboard {
    private Frame f = new Frame("test");
    private Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    private TextArea jtaCopyTo = new TextArea(5, 20);
    private TextArea jtaPaste = new TextArea(5, 20);
    private Button btCopy = new Button("复制");
    private Button btPaste = new Button("粘贴");

    public void init()
    {
        Panel p = new Panel();
        p.add(btCopy);
        p.add(btPaste);
        btCopy.addActionListener(event ->
        {
            //将一个多行文本域里的字符串封装成StringSelection对象
            StringSelection contents = new StringSelection(jtaCopyTo.getText());
            //将该对象放入剪贴板
            clipboard.setContents(contents, null);
        });
        btPaste.addActionListener(e ->
        {
            if(clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
            {
                try
                {
                    String content = (String)clipboard.getData(DataFlavor.stringFlavor);
                    jtaPaste.append(content);
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }
            }
        });
        //创建一个水平排列的Box容器
        Box box = new Box(BoxLayout.X_AXIS);
        //将两个多行文本域放在Box容器中
        box.add(jtaCopyTo);
        box.add(jtaPaste);
        //将按钮所在的Panel、Box容器添加到Frame窗口中
        f.add(p, BorderLayout.SOUTH);
        f.add(box,BorderLayout.CENTER);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleClipboard().init();
    }
}
