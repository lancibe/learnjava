public class Address {
    private final String detail;
    private final String postCode;

    public Address()
    {
        this.detail = "";
        this.postCode = "";
    }
    public Address(String detail, String postCode)
    {
        this.detail = detail;
        this.postCode = postCode;
    }

    //仅为两个实例变量提供getter方法
    public String getDetail() {
        return detail;
    }
    public String getPostCode() {
        return postCode;
    }

    //重写equals()方法，判断两个对象是否相等
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(obj != null && obj.getClass() == Address.class)
        {
            Address ad = (Address)obj;
            if(this.getDetail().equals(ad.getDetail()) && this.getPostCode().equals(ad.getPostCode()))
                return true;
        }
        return false;
    }
    public int hashCode()
    {
        return detail.hashCode() + postCode.hashCode() * 31;
    }

}
