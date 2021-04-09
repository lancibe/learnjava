package jspTestdeom1;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class User {
    public User(String name, int age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public User() {
    }

    private  String name;
    private   int age;
    private Date  date;


    public String getDatas(){
        SimpleDateFormat sd=new SimpleDateFormat("yyyy年MM月dd号 HH:mm:ss");
        return sd.format(date);
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

    public Date getDate() {
        return date;
    }

    public void setData(Date data) {
        this.date = data;
    }
}
