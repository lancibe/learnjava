package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.javafx.collections.MappingChange;
import org.omg.PortableServer.POA;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class posontets {

    public static void main(String[] args) throws Exception {
          ponson p=new ponson();
          p.setName("张三");
          p.setAge(23);
          p.setGrend("男");
          p.setBsd(new Date());
        ponson p1=new ponson();
        p1.setName("张三");
        p1.setAge(23);
        p1.setGrend("男");
        p1.setBsd(new Date());
          ObjectMapper objectMapper=new ObjectMapper();
      /*  String s = objectMapper.writeValueAsString(p);
        System.out.println(s);*/
     /*   String s = objectMapper.writeValueAsString(p);
        System.out.println(s);*/

    //    objectMapper.writeValue(new File("C:\\Users\\86166\\Desktop\\a.txt"),p);
    // objectMapper.writeValue(new FileWriter("C:\\Users\\86166\\Desktop\\b.txt"),p);

      /*  ArrayList<ponson> list=new ArrayList<ponson>();
        list.add(p);
        list.add(p1);
        String s = objectMapper.writeValueAsString(list);
        System.out.println(s);*/
  /*      Map<String,Object> map=new HashMap<>();
        map.put("name","张三");
        map.put("age",24);
        map.put("grend","男");
        String s = objectMapper.writeValueAsString(map);
        System.out.println(s);*/


      String son="{\"grend\":\"男\",\"name\":\"张三\",\"age\":24}";
        ponson ponson = objectMapper.readValue(son, ponson.class);
        System.out.println(ponson);
    }
}
