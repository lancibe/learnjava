public class RandomStr {
    public static void main(String[] args){
        //定义一个空字符串
        String result = "";
        //进行六次循环
        for (int i = 0 ; i < 6 ; i ++)
        {
            //生成一个97~122之间的int类型整数
            int intVal = (int)(Math.random() * 26 + 97);
            //将intValue强制转换为char类型后连接到result后面
            result = result + (char)intVal;
        }
        System.out.println(result);
    }
}
