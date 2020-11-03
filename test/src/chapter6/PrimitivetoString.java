public class PrimitivetoString {
    public static void main(String[] args)
    {
        String intStr = "123";

        int it1 = Integer.parseInt(intStr);
        int it2 = Integer.valueOf(intStr);

        System.out.println(it2);
        String floatStr = "4.56";

        float ft1 = Float.parseFloat(floatStr);
        float ft2 = Float.valueOf(floatStr);
        System.out.println(ft2);

        String dbStr = String.valueOf(3.344);
        System.out.println(dbStr);

        String boolstr = String.valueOf(true);
        System.out.println(boolstr.toUpperCase());
    }
}
