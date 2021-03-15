package chapter3;

import org.jetbrains.annotations.NotNull;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/body.view")
public class BodyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String body = readBody(req);
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet BodyView</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(body);
        out.println("</body>");
        out.println("</html>");
    }
    private String readBody(@NotNull HttpServletRequest request) throws IOException
    {
        BufferedReader reader = request.getReader();
        String input = null;
        String requestBody = "";
        while((input = reader.readLine()) != null)
        {
            requestBody = requestBody + input + "<br>";
        }
        return requestBody;
    }
}
