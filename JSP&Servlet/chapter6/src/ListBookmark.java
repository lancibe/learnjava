import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ListBookmark extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta content='text/html;charset=UTF-8'; http-equiv='content-type'>");
        out.println("<title>查看在线书签</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table style='text-align:left;width:100%;' border='0'>");
        out.println("<tbody>");
        out.println("<tr>");
        out.println("<td style='background-color:rgb(51.255,255);'>网页</td>");
        out.println("<td style='background-color:rgb(51.255,255);'>分类</td>");
        out.println("</tr>");
/*        BookmarkService bookmarkService = (BookmarkService)getServletContext().getAttribute("bookmarkService");
        for(Bookmark bookmark : bookmarkService.getBookmarks())
        {
            out.println("<tr>");
            out.println("<td><a href='http://"+bookmark.getUrl()+"'>"+bookmark.getTitle() + "</a></td>");
            out.println("<td>"+bookmark.getCategory()+"</td>");
            out.println("</tr>");
        }*/
        out.println("</tbody>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
