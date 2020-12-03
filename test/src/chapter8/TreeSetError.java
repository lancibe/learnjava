import java.util.TreeSet;

class Err{}

public class TreeSetError {
    public static void main(String[] args)
    {
        TreeSet ts = new TreeSet();
        ts.add(new Err());
    }
}
