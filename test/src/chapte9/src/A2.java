public class A2 extends Apple {
    @Override
    public String getInfo() {
        //super.getIndo()是Object类型
        //所以加toString才是String类型
        return super.getInfo().toString();
    }
}
