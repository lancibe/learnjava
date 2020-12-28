import org.jetbrains.annotations.NotNull;
import java.util.List;

public class Canvas {
    //同时在画布上绘制多个形状
    public void drawAll(@NotNull List<? extends Shape> shapes)
    {
        for (Shape s : shapes)
        {
            s.draw(this);
        }
    }
}
