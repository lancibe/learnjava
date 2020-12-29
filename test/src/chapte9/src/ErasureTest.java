class Apple3<T extends Number>
{
    T size;
    public Apple3(){}
    public Apple3(T size)
    {
        this.size = size;
    }

    public void setSize(T size) {
        this.size = size;
    }

    public T getSize() {
        return this.size;
    }
}
public class ErasureTest {
    public static void main(String[] args)
    {
        Apple3<Integer> a = new Apple3<>(6);
        //a的getSize()方法返回Integer对象
        Integer as = a.getSize();
        //把a对象赋给Apple3变量，丢失尖括号里的类型信息
        Apple3 b = a;
        //b只知道size的类型是Number
        Number size1 = b.getSize();
        //下面代码编译错误
        //Integer size2 = b.getSize();
    }
}
