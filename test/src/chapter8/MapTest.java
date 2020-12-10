import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args)
    {
        Map map = new HashMap();
        //成对的放入多个key-value对
        map.put("lancibe", 20);
        map.put("fei",19);
        map.put("loves","forever");
        //多次放入的键值对中值可以重复
        map.put("xun",20);
        //放入重复的key时，新的value会覆盖原有的value
        //如果进行了覆盖，该方法返回被覆盖的value
        System.out.println(map.put("fei", 18));
        System.out.println(map);
        //判断是否包含key
        System.out.println("是否包含为fei的key："+map.containsKey("fei"));
        //判断是否包含value
        System.out.println("是否包含为19的value："+map.containsValue(19));

        //获取Map集合中的所有key组成的集合，通过遍历key来实现遍历所有的key-value对
        for (Object key: map.keySet()
             ) {
            //map.get(key)方法获取指定key对应的value
            System.out.println(key + "-->"+map.get(key));
        }
        map.remove("xun");//根据key来删除key-value对
        System.out.println(map);
    }
}
