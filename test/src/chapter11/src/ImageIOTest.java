import javax.imageio.ImageIO;

public class ImageIOTest {
    public static void main(String[] args) {
        String[] readFormat = ImageIO.getReaderFormatNames();
        for (String tmp:readFormat) {
            System.out.println(tmp);
        }
        System.out.println("--------");
        String[] writeFormat = ImageIO.getWriterFormatNames();
        for (String tmp:writeFormat) {
            System.out.println(tmp);
        }
    }
}
