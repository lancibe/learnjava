package chapter5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/SessionListenerDemoLogin.do")
public class SessionListenerDemoLogin extends HttpServlet {
    private Map<String, String> users;

    public SessionListenerDemoLogin(){
        users = new HashMap<String, String>();
        users.put("lancibe", "123456");
        users.put("lancibe22", "123456");
        users.put("root", "1234567890");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String passwd = req.getParameter("passwd");
        String page = "form.html";
        if(users.containsKey(name) && users.get(name).equals(passwd))
        {
            req.getSession().setAttribute("user", name);
            page = "SessionListenerDemoWelcome.view";
        }
        resp.sendRedirect(page);
    }
}
