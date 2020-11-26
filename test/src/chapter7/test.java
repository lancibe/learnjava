public class test {
    public static void main(String[] args)
    {
        String str = "hello, java";
        System.out.println(str.replaceFirst("\\w*", "lancibe"));
        System.out.println(str.replaceFirst("\\w*?", "lancibe"));
    }
}
