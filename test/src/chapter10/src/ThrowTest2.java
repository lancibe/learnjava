import java.io.FileOutputStream;

public class ThrowTest2 {
    public static void main(String[] args)
        throws Exception
    {
        try
        {
            new FileOutputStream("b.txt");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            throw ex;
        }
    }
}
