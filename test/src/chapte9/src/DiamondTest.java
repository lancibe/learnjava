import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiamondTest {
    public static void main(String[] args)
    {
        //java自动推断出ArrayList的<>里应该是String
        List<String> books = new ArrayList<>();
        books.add("lancibe");
        books.add("xun");
        //遍历
        books.forEach(str -> System.out.println(str.length()));

        //使用map，结果一样
        Map<String, List<String>> schoolsInfo = new HashMap<>();
        List<String> schools = new ArrayList<>();
        schools.add("123");
        schools.add("456");
        schoolsInfo.put("xx", schools);
        schoolsInfo.forEach((key, value) -> System.out.println(key+"-->"+value));
    }
}
