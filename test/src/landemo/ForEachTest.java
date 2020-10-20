public class ForEachTest {
    public static void main(String[] args){
        String[] names = {"lancibe", "123", "linux"};

        //其中的name将会自动迭代每个元素
        for (String name:names) {
            System.out.println(name);
        }
    }
}
