package chapter5;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener {
    private String name;
    private String data;
    public User(String name)
    {
        this.name = name;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        this.data = name + "来自数据库的数据...";
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {

    }
    public String getData() {
        return data;
    }

    public String getName() {
        return name;
    }
}
