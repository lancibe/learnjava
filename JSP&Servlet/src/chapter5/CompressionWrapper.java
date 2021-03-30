package chapter5;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

public class CompressionWrapper extends HttpServletResponseWrapper {
    private GZipServletOutputStream gZipServletOutputStream;
    private PrintWriter printWriter;
    public CompressionWrapper(HttpServletResponse resp)
    {
        super(resp);
    }

    @Override
    public ServletOutputStream getOutputStream() throws IOException {
        if(printWriter != null)
        {
            throw new IllegalStateException();
        }
        if(gZipServletOutputStream == null)
        {
            gZipServletOutputStream = new GZipServletOutputStream(getResponse().getOutputStream());
        }
        return gZipServletOutputStream;
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        if(gZipServletOutputStream != null)
        {
            throw new IllegalStateException();
        }
        if(printWriter == null)
        {
            gZipServletOutputStream = new GZipServletOutputStream(getResponse().getOutputStream());
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                    gZipServletOutputStream,
                    getResponse().getCharacterEncoding()
            );
            printWriter = new PrintWriter(outputStreamWriter);
        }
        return printWriter;
    }

    @Override
    public void setContentLength(int len) {
    }

    public GZIPOutputStream getGZipOutputStream() {
        if(this.gZipServletOutputStream == null)
            return null;
        return this.gZipServletOutputStream.getGzipOutputStream();
    }
}
