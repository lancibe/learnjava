package OverrideEqualsRight;
class Person
{
    private String name;
    private String idStr;
    public Person(){}
    public Person(String name, String idStr)
    {
        this.name = name;
        this.idStr = idStr;
    }

    //Java推荐使用的getter和setter方法
    public void setName(String name) {
        this.name = name;
    }
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getName() {
        return name;
    }
    public String getIdStr() {
        return idStr;
    }

    public boolean equals(Object obj)
    {
        //如果两个对象是同一个对象
        if(this == obj)
            return true;

        //只有当obj是Person对象
        if(obj != null && obj.getClass() == Person.class)
        {
            Person personObj = (Person)obj;
            //并且当前对象的idStr与obj对象的idStr相等时才可以判断两个对象是否相等
            if(this.getIdStr().equals(personObj.getIdStr()))
            {
                return true;
            }
        }
        return false;
    }

}
public class OverrideEqualsRight {
    public static void main(String[] args)
    {
        Person p1 = new Person("lancibe", "19");
        Person p2 = new Person("babylan", "19");
        Person p3 = new Person("lancibe", "20");

        System.out.println("p1和p2是否相等？"
                + p1.equals(p2));
        System.out.println("p2和p3是否相等？"
                + p2.equals(p3));
    }
}
