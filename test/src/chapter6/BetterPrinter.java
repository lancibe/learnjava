public class BetterPrinter implements Output {
    private String[] printData = new String[Output.MAX_CHCHE_LINE*2];
    //用以记录当前需打印的作业数
    private int dataNum = 0;
    public void out()
    {
        //只要还有作业，就继续打印
        while(dataNum > 0)
        {
            System.out.println("高速打印机正在打印："+printData[0]);
            //把作业队列整体前移一位，并将剩下的作业数减一
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }
    public void getData(String msg)
    {
        if(dataNum >= Output.MAX_CHCHE_LINE * 2)
        {
            System.out.println("输出队列已满，添加失败");
        }
        else
        {
            //把打印数据添加到队列里，已保存数据的数量加一
            printData[dataNum++] = msg;
        }
    }
}
