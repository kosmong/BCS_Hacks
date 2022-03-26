package Main;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class NumberPainter {
    private BufferedImage img;
    private PixelOrganizer organizer;

    public NumberPainter(String imgLocation) {
        try {
            img = ImageIO.read(new File(imgLocation));
            organizer = new PixelOrganizer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
