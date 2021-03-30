package chapter5;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

@WebFilter(filterName = "CompressionFilter", urlPatterns = {"/*"})
public class CompressionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse resp = (HttpServletResponse)servletResponse;
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        String encodings = req.getHeader("accept-encoding");
        if((encodings != null) && (encodings.indexOf("gzip") > -1))
        {
            //检查是否接受gzip压缩
            CompressionWrapper responseWrapper = new CompressionWrapper(resp);
            responseWrapper.setHeader("content-encoding", "gzip");
            filterChain.doFilter(servletRequest, responseWrapper);
            GZIPOutputStream gzipOutputStream = responseWrapper.getGZipOutputStream();
            if(gzipOutputStream != null)
            {
                gzipOutputStream.finish();
            }
        }
        else
        {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {
    }
}
