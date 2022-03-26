import main.NumberPainter;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class testNumberPainter {
    private static final String PENGUIN  = "src/imagesOriginal/penguin.jpeg";
    private static final String SQUARE  = "src/imagesOriginal/thick_square.jpg";
    private static final String WRITEPENGUIN = "penguin.jpeg";
    private static final String WRITESQUARE = "thick_square.jpeg";
    private static final Color RED = Color.RED;
    private static final Color WHITE = Color.WHITE;
    private static final Color LIGHTGRAY = Color.LIGHT_GRAY;
    private static final Color CYAN = Color.CYAN;
    private NumberPainter paintPenguin;
    private NumberPainter paintSquare;

    @Before
    public void startUp() {
        paintPenguin = new NumberPainter(PENGUIN);
        paintSquare = new NumberPainter(SQUARE);
    }

//    @Test
//    public void testRender() {
//        paintPenguin.renderFunction(WRITEPENGUIN);
//        paintSquare.renderFunction(WRITESQUARE);
//    }

    @Test
    public void testGetBorder() {


        paintSquare.imageCleanUp();
        paintSquare.getBorders();
        paintSquare.changeRegionColor(0, CYAN);
        paintSquare.renderFunction(WRITESQUARE);


    }

    @Test
    public void testPenguin() {
        paintPenguin.imageCleanUp();
        paintPenguin.getBorders();
        paintPenguin.changeRegionColor(0, LIGHTGRAY);
        paintPenguin.renderFunction(WRITEPENGUIN);
    }
}
