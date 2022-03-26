import main.NumberPainter;
import org.junit.Before;
import org.junit.Test;

public class testNumberPainter {
    private static final String PENGUIN  = "src/imagesOriginal/penguin.jpeg";
    private NumberPainter painter;

    @Before
    public void startUp() {
        painter = new NumberPainter(PENGUIN);
    }

    @Test
    public void testRender() {
        painter.renderFunction();
    }
}
