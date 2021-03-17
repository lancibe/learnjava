package chapter3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloView extends HttpServlet {
    private String htmlTemplate =
             "<html>"
            +"<head>"
            +"<meta http-equiv='Content-type'"
            +" content='text/html;charset=UTF-8'>"
            +"<title>%s</title>"
            +"</head>"
            +"<body>"
            +"<h1>%s</h1>"
            +"</body>"
            +"</html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String message = (String) req.getAttribute("message");
        String html = String.format(htmlTemplate, user, message);//产生html结果
        resp.getWriter().print(html);//输出html结果
    }
}
