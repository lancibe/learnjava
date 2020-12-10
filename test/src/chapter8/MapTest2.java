import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args)
    {
        Map map = new HashMap();
        map.put("lancibe", 20);
        map.put("fei",19);
        map.put("loves","forever");
        //尝试替换key为xun的value，由于没有对应key，因此Map没有改变
        map.replace("xun", 19);
        System.out.println(map);
        //使用原value于传入参数计算出来的结果覆盖原有value
        map.merge("fei", 19,
                (oldVal, param) -> (Integer)oldVal + (Integer)param);
        System.out.println(map);
        //当key为“java”对应的value为null（或不存在）时，使用计算的结果作为新的value
        map.computeIfAbsent("java",
                (key)->((String)key).length());
        System.out.println(map);
        //当key为“java”对应的value存在时，使用计算的结果作为新的value
        map.computeIfPresent("java",
                (key, value)->(Integer)value*(Integer)value);
        System.out.println(map);

    }
}
