package cn.ty.lq;

public class User {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public User(int id, String name, int age, String jg, String qq) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addrest=jg;
        this.qq = qq;
    }
   public User(){

   }
    private  int id;
    private  String name;
    private  int age ;

    public String getAddrest() {
        return addrest;
    }

    public void setAddrest(String addrest) {
        this.addrest = addrest;
    }

    private  String addrest;
    private  String  qq;
}
