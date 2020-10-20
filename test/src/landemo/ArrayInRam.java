public class ArrayInRam {
    public static void main(String[] args){
        int[] a = {5, 7, 20};
        int[] b = new int[4];
        System.out.println("b的长度为" + b.length);

        for(int temp : a){
            System.out.println(temp);
        }

        for(int temp : b){
            System.out.println(temp);
        }

        b = a;
        System.out.println("b的长度为" + b.length);
    }
}
