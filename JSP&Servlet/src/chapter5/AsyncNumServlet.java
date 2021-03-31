package chapter5;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AsyncNumServlet", urlPatterns = {"/asyncNum.do"}, asyncSupported = true)
public class AsyncNumServlet extends HttpServlet {
    private List<AsyncContext> asyncs;

    @Override
    public void init() throws ServletException {
        asyncs = (List<AsyncContext>) getServletContext().getAttribute("asyncs");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AsyncContext ctx = req.startAsync();//开始异步处理
        synchronized (asyncs)
        {
            asyncs.add(ctx);//加入维护AsyncContext的List中
        }
    }
}
