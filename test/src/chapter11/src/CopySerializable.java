import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;

public class CopySerializable {
    Frame f = new Frame("复制对象");
    Button copy = new Button("复制");
    Button paste = new Button("粘贴");
    TextField name = new TextField(15);
    TextField age = new TextField(15);
    TextArea ta = new TextArea(3, 30);
    //创建系统剪贴板
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    public void init()
    {
        Panel p = new Panel();
        p.add(new Label("姓名"));
        p.add(name);
        p.add(new Label("年龄"));
        p.add(age);
        f.add(p, BorderLayout.NORTH);
        f.add(ta);
        Panel bp = new Panel();
        copy.addActionListener(e -> copyDog());
        paste.addActionListener(e ->
        {
            try
            {
                readDog();
            }
            catch (Exception ee)
            {
                ee.printStackTrace();
            }
        });
        bp.add(copy);
        bp.add(paste);
        f.add(bp, BorderLayout.SOUTH);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.pack();
        f.setVisible(true);
    }
    public void copyDog()
    {
        Dog d = new Dog(name.getText(), Integer.parseInt(age.getText()));
        SerialSelection ls = new SerialSelection(d);
        clipboard.setContents(ls, null);
    }
    public void readDog()
    {
        DataFlavor peronFlavor = new DataFlavor(DataFlavor.javaSerializedObjectMimeType + ";class=Dog");
        if(clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
        {
            Dog d = (Dog)clipboard.getData(peronFlavor);
            ta.setText(d.toString());
        }
    }

    public static void main(String[] args) {
        new CopySerializable().init();
    }
}
