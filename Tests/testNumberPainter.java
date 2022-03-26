import main.NumberPainter;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class testNumberPainter {
    private static final String PENGUIN  = "src/imagesOriginal/penguin.jpeg";
    private static final Color RED = Color.RED;
    private NumberPainter painter;

    @Before
    public void startUp() {
        painter = new NumberPainter(PENGUIN);
    }

    @Test
    public void testRender() {
        painter.renderFunction();
    }

    @Test
    public void testGetBorder() {
        painter.getBorders();
        painter.changeRegionColor(0, RED);
        painter.renderFunction();
    }
}
