package chapter3;

import java.util.HashMap;
import java.util.Map;

public class HelloModel {
    private Map<String, String> messages = new HashMap<>();
    public HelloModel()
    {
        messages.put("fei", "Hello");
        messages.put("xun", "Welcome");
        messages.put("Lancibe", "Hi");
    }

    public String doHello(String user)
    {
        String message = messages.get(user);
        return message + "," + user + "!";
    }
}
