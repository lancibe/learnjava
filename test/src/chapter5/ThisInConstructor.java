public class ThisInConstructor {
    public int foo;
    public ThisInConstructor()
    {
        int foo = 0;
        //下面的代码将会把该构造器正在初始化的对象的foo成员变量设为6
        this.foo = 6;
    }
    public static void main(String[] args){
        System.out.println(new ThisInConstructor().foo);
    }
}
