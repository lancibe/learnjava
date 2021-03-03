import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowTest3 {
    public static void main(String[] args)
        throws FileNotFoundException
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
