import javax.swing.*;

public class AllLookAndFeel {
    public static void main(String[] args) {
        System.out.println("当前系统可用的所有LAF有:");;
        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
        {
            System.out.println(info.getName() + "-->" + info);
        }
    }
}
