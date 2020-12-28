public class Apple<T> {
    //使用T类型定义实例变量
    private T info;
    public Apple(){}
    //下面方法中使用T类型来定义构造器
    public Apple(T info)
    {
        this.info = info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return this.info;
    }

    public static void main(String[] args)
    {
        //由于传给T形参的是String， 所以构造器参数只能是String
        Apple<String> a1 = new Apple<>("苹果");
        System.out.println(a1.getInfo());
        //同理
        Apple<Double> a2 = new Apple<>(5.67);
        System.out.println(a2.getInfo());
    }
}
