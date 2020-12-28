public class A1 extends Apple<String>{
    @Override
    public String getInfo() {
        return "子类"+super.getInfo();
    }
}
