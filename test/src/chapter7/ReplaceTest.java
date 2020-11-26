import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceTest {
    public static void main(String[] args)
    {
        String[] msgs=
                {
                        "Java has regular expressions in 1.4",
                        "regular expressions now expressing is Java",
                        "Java represses oracular expressions"
                };
        Pattern p = Pattern.compile("re\\w+");
        Matcher match = null;
        for (int i = 0; i < msgs.length ; i++)
        {
            if(match == null)
            {
                match = p.matcher(msgs[i]);
            }
            else
            {
                match.reset(msgs[i]);
            }
            System.out.println(match.replaceAll("哈哈:)"));
        }
    }
}
