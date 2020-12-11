import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args)
            throws Exception
    {
        Properties props = new Properties();
        //向Properties中添加属性
        props.setProperty("username", "lancibe");
        props.setProperty("password", "123456");
        //将Properties中的key-value对保存在a.ini中
        props.store(new FileOutputStream("a.ini"), "comment line");
        //新建一个Properties对象
        Properties props2 = new Properties();
        props2.setProperty("gender", "male");
        //将a.ini中的键值对追加到prop2中
        props2.load(new FileInputStream("a.ini"));
        System.out.println(props2);

    }
}
