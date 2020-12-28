public class Apple2<T extends Number> {
    T col;
    public static void main(String[] args)
    {
        Apple2<Integer> ai = new Apple2<>();
        Apple2<Double> ad = new Apple2<>();
        //下面代码编译异常，试图把String类型传给T形参
        Apple2<String> as = new Apple2<>();
    }
}
