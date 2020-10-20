import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args){
        int[] a = new int[]{3, 4, 5, 6};
        int[] a2 = new int[] {3, 4, 5, 6};

        System.out.println("a和a2是否相等："+ Arrays.equals(a, a2));

        int[] b = Arrays.copyOf(a, 6);
        System.out.println("b的数组元素为："+Arrays.toString(b));

        Arrays.fill(b, 2, 4, 1);
        System.out.println("b的数组元素为："+Arrays.toString(b));

        Arrays.sort(b);
        System.out.println("b的数组元素为："+ Arrays.toString(b));

    }
}
