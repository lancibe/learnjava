public class BreakTest {
    public static void main (String[] args){
        outer:
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("i的值为："+i);
            for (int j  = 0 ; j < 3 ; j++){
                System.out.println("j的值为："+j);
                if(j == 1)
                    break outer;
            }
        }
    }
}
