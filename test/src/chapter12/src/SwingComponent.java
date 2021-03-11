import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

public class SwingComponent {
    JFrame f = new JFrame("test");
    //定义一个按钮，并为之指定图标
    Icon okIcon = new ImageIcon("file:///home/lancibe/Pictures/black.jpg");
    JButton ok = new JButton("确认", okIcon);
    //定义两个单选按钮，其中一个初始处于选中状态
    JRadioButton male = new JRadioButton("男",true);
    JRadioButton female = new JRadioButton("女", false);
    //定义一个ButtonGroup将上面的两个按钮组合在一起
    ButtonGroup bg = new ButtonGroup();
    //定义一个复选框，初始处于没有选中状态
    JCheckBox married = new JCheckBox("是否已婚", false);
    String[] colors = new String[]{"红色","绿色","蓝色"};
    //定义一个下拉选择框
    JComboBox<String> colorChooser = new JComboBox<>(colors);
    //定义一个列表选择框
    JList<String> colorList = new JList<>(colors);
    //定义一个多行文本域
    JTextArea ta = new JTextArea(8, 20);
    //定义一个单行文本域
    JTextField name = new JTextField(40);
    JMenuBar mb = new JMenuBar();
    JMenu file = new JMenu("文件");
    JMenu edit = new JMenu("编辑");
    //创建“新建”菜单栏
    JMenuItem newItem = new JMenuItem("新建");
    JMenuItem saveItem = new JMenuItem("保存");
    JMenuItem exitItem = new JMenuItem("退出");
    JCheckBoxMenuItem autoWrap = new JCheckBoxMenuItem("自动换行");
    JMenuItem copyItem = new JMenuItem("复制");
    JMenuItem pasteItem = new JMenuItem("粘贴");
    JMenu format = new JMenu("格式");

    JMenuItem commentItem = new JMenuItem("注释");
    JMenuItem cancelItem = new JMenuItem("取消注释");

    //定义一个右键菜单用于设置程序风格
    JPopupMenu pop = new JPopupMenu();
    //用于组合三个风格菜单项的ButtonGroup
    ButtonGroup flavorGroup = new ButtonGroup();
    //创建五个单选按钮，用于设定程序外观风格
    JRadioButtonMenuItem metalItem = new JRadioButtonMenuItem("Metal风格",true);
    JRadioButtonMenuItem nimbusItem = new JRadioButtonMenuItem("Nimbus风格");
    JRadioButtonMenuItem windowsItem = new JRadioButtonMenuItem("Windows风格");
    JRadioButtonMenuItem classicItem = new JRadioButtonMenuItem("Windows经典风格");
    JRadioButtonMenuItem motifItem = new JRadioButtonMenuItem("Motif风格");

    public void init()
    {
        JPanel bottom = new JPanel();
        bottom.add(name);
        bottom.add(ok);
        f.add(bottom, BorderLayout.SOUTH);
        //创建一个装载了下拉选择框、三个JCheckbox的JPanel
        JPanel checkPanel = new JPanel();
        checkPanel.add(colorChooser);
        bg.add(male);
        bg.add(female);
        checkPanel.add(male);
        checkPanel.add(female);
        checkPanel.add(married);
        //创建一个垂直排列组件的Box，盛装多行文本域
        Box topLeft = Box.createVerticalBox();
        //使用JScrollPane作为普通组件的JViewPort
        JScrollPane taJsp = new JScrollPane(ta);
        topLeft.add(taJsp);
        topLeft.add(checkPanel);
        //创建一个水平排列的Box，盛装topLeft、colorList
        Box top = Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);

        f.add(top);

        newItem.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_DOWN_MASK));
        newItem.addActionListener(e -> ta.append("用户点击了“新建”菜单\n"));
        //为file菜单添加菜单项
        file.add(newItem);
        file.add(saveItem);
        file.add(exitItem);
        //为edit菜单添加菜单项
        edit.add(autoWrap);
        edit.addSeparator();
        edit.add(copyItem);
        edit.add(pasteItem);
        //为commentItem组件添加提示信息
        commentItem.setToolTipText("将程序代码注释起来");
        //为format菜单添加菜单项
        format.add(commentItem);
        format.add(cancelItem);
        //使用添加new JMenuItem("-")的方式并不能添加菜单分隔符
        edit.add(format);
        //将file、edit菜单添加到mb菜单条中
        mb.add(file);
        mb.add(edit);
        //为f窗口设置菜单条
        f.setJMenuBar(mb);
        //组合右键菜单并安装右键菜单
        flavorGroup.add(metalItem);
        flavorGroup.add(nimbusItem);
        flavorGroup.add(windowsItem);
        flavorGroup.add(classicItem);
        flavorGroup.add(motifItem);
        pop.add(metalItem);
        pop.add(nimbusItem);
        pop.add(windowsItem);
        pop.add(classicItem);
        pop.add(motifItem);
        //为五个风格该菜单创建事件监听器
        ActionListener flavorListener = e ->
        {
            try
            {
                switch (e.getActionCommand()) {
                    case "Metal风格" -> changeFlavor(1);
                    case "Nimbus风格" -> changeFlavor(2);
                    case "Windows风格" -> changeFlavor(3);
                    case "Windows经典风格" -> changeFlavor(4);
                    case "Motif风格" -> changeFlavor(5);
                }
            }
            catch (Exception ee)
            {
                ee.printStackTrace();
            }
        };
        //为五个风格菜单项添加事件监听器
        metalItem.addActionListener(flavorListener);
        nimbusItem.addActionListener(flavorListener);
        windowsItem.addActionListener(flavorListener);
        classicItem.addActionListener(flavorListener);
        motifItem.addActionListener(flavorListener);
        //调用该方法即可设置右键菜单，无需使用事件机制
        ta.setComponentPopupMenu(pop);
        //设置关闭窗口时退出程序
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
    //定义一个方法用于改变界面风格
    private void changeFlavor(int flavor) throws Exception
    {
        switch (flavor) {
            case 1 -> UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            case 2 -> UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            case 3 -> UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            case 4 -> UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
            case 5 -> UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAmdFeel");
        }
    }

    public static void main(String[] args) {
        new SwingComponent().init();
    }

}
