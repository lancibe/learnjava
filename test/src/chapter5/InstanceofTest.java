public class InstanceofTest {
    public static void main(String[] args)
    {
        Object hello = "Hello";
        System.out.println("字符串是否是Object类的实例："+(hello instanceof Object));
        System.out.println("字符串是否是String类的实例："+(hello instanceof String));

        System.out.println("字符串是否是Math类的实例："+(hello instanceof Math));
        System.out.println("字符串是否是Comparable接口的实例"+(hello instanceof Comparable));

        String a = "Hello";
        //String类与Math类没有继承关系，所以下面代码无法通过编译
        //System.out.println("字符串是否是Math类的实例"+(a instanceof Math));
    }
}
