package chapter5;

import javax.servlet.AsyncContext;
import java.io.PrintWriter;

public class AsyncRequest implements Runnable{
    private AsyncContext ctx;
    public AsyncRequest(AsyncContext ctx)
    {
        this.ctx = ctx;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            PrintWriter out = ctx.getResponse().getWriter();
            out.println("久等了兄弟^_^");
            ctx.complete();//对客户端完成响应
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
