
import java.io.File;

public class test {
    public static void main(String[] args)
    {
        File file = new File("");
        File[] list = file.listFiles();

        // 如果目录下文件存在
        if (file.exists() && file.isDirectory())
        {
            for (int i = 0; i < list.length; i++)
            {
                //取文件名子存入name中
                String name = list[i].getName();
                // 截取.之前的字符串出来
                int index = name.indexOf(".");
                // 截取.xxx出来
                int index2 = name.lastIndexOf(".");
                String name3 = name.substring(index2);
                // 拼接字符串
                String newName = "迅宝爱你哦" + (i + 1) + name3;
                //重命名
                File dest = new File("" + "/" + newName);
                list[i].renameTo(dest);
                System.out.println(dest.getName());
            }
        }
    }
}
