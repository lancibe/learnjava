package jackson;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ponson {
      private String name;
      private int age;
      private String grend;

      @JsonFormat(pattern = "yyyy-MM-dd")                    //格式化属性
      private Date bsd;

    @Override
    public String toString() {
        return "ponson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grend='" + grend + '\'' +
                ", bsd=" + bsd +
                '}';
    }

    public Date getBsd() {
        return bsd;
    }

    public void setBsd(Date bsd) {
        this.bsd = bsd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrend() {
        return grend;
    }

    public void setGrend(String grend) {
        this.grend = grend;
    }
}
