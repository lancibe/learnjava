package Stuedt;

public class Stuedet {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public Stuedet() {
    }

    @Override
    public String toString() {
        return "Stuedet{" +
                "name='" + name + '\'' +
                ", qq='" + qq + '\'' +
                ", dz='" + dz + '\'' +
                '}';
    }

    private  String name;
    private  String  qq;

    public Stuedet(String name, String dz, String qq) {
        this.name = name;
        this.qq = qq;
        this.dz = dz;
    }

    private  String  dz;
}
