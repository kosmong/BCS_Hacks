import main.NumberPainter;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class testNumberPainter {
    private static final String PENGUIN  = "src/imagesOriginal/penguin.jpeg";
    private static final String PENGUINFAMILY = "src/imagesOriginal/penguinfamily.jpeg";
    private static final String THICKSQUARE = "src/imagesOriginal/thick_square.jpg";
    private static final String THINSQUARE = "src/imagesOriginal/thin_square.jpeg";
    private static final String CIRCLES = "src/imagesOriginal/circles.jpeg";
    private static final String BOBA = "src/imagesOriginal/boba.jpg";
    private static final String LINEART = "src/imagesOriginal/lineart.jpeg";
    private static final String TIGER = "src/imagesOriginal/tiger.jpeg";
    private static final String PENGUINBALLOON = "src/imagesOriginal/penguinballoon.jpeg";
    private static final String PAINTBYNUMCANDLE = "src/imagesOriginal/paintbynumbercandle.jpeg";

    private static final String WRITEPENGUIN = "penguin.jpeg";
    private static final String WRITEPENGUINFAMILY = "penguinfamily.jpeg";
    private static final String WRITETHICKSQUARE = "thick_square.jpeg";
    private static final String WRITETHINSQUARE = "thin_square.jpeg";
    private static final String WRITECIRCLES = "circles.jpeg";
    private static final String WRITEBOBA = "boba.jpeg";
    private static final String WRITELINEART = "lineart.jpeg";
    private static final String WRITETIGER = "tiger.jpeg";
    private static final String WRITEPENGUINBALLOON = "penguinballoon.jpeg";
    private static final String WRITEPAINTNUMCANDLE = "candle.jpeg";

    private static final Color RED = Color.RED;
    private static final Color WHITE = Color.WHITE;
    private static final Color LIGHTGRAY = Color.LIGHT_GRAY;
    private static final Color CYAN = Color.CYAN;
    private static final Color YELLOW = Color.YELLOW;
    private static final Color ORANGE = Color.ORANGE;
    private NumberPainter paintPenguin;
    private NumberPainter paintPenguinFamily;
    private NumberPainter paintThickSquare;
    private NumberPainter paintThinSquare;
    private NumberPainter paintCircles;
    private NumberPainter paintBoba;
    private NumberPainter paintLineart;
    private NumberPainter paintTiger;
    private NumberPainter paintPenguinBalloon;
    private NumberPainter paintCandle;

    @Before
    public void startUp() {
        paintPenguin = new NumberPainter(PENGUIN);
        paintPenguinFamily = new NumberPainter(PENGUINFAMILY);
        paintThickSquare = new NumberPainter(THICKSQUARE);
        paintThinSquare = new NumberPainter(THINSQUARE);
        paintCircles = new NumberPainter(CIRCLES);
        paintBoba = new NumberPainter(BOBA);
        paintLineart = new NumberPainter(LINEART);
        paintTiger = new NumberPainter(TIGER);
        paintPenguinBalloon = new NumberPainter(PENGUINBALLOON);
        paintCandle = new NumberPainter(PAINTBYNUMCANDLE);
    }

//    @Test
//    public void testRender() {
//        paintPenguin.renderFunction(WRITEPENGUIN);
//        paintSquare.renderFunction(WRITESQUARE);
//    }

    @Test
    public void testBorderSimpleShapes() {
        paintThickSquare.imageCleanUp();
        paintThickSquare.getStencil();
        paintThickSquare.changeRegionColor(0, CYAN);
        paintThickSquare.renderImage(WRITETHICKSQUARE);

        paintThinSquare.imageCleanUp();
        paintThinSquare.getStencil();
        paintThinSquare.changeRegionColor(0, RED);
        paintThinSquare.renderImage(WRITETHINSQUARE);

        paintCircles.imageCleanUp();
        paintCircles.getStencil();
        paintCircles.changeRegionColor(0, RED);
        paintCircles.renderImage(WRITECIRCLES);
    }

    @Test
    public void testBorderStencils() {
        paintPenguin.imageCleanUp();
        paintPenguin.getStencil();
        paintPenguin.changeRegionColor(0, CYAN);
        paintPenguin.renderImage(WRITEPENGUIN);

        paintTiger.imageCleanUp();
        paintTiger.getStencil();
        paintTiger.changeRegionColor(0, ORANGE);
        paintTiger.renderImage(WRITETIGER);

        paintPenguinBalloon.imageCleanUp();
        paintPenguinBalloon.getStencil();
        paintPenguinBalloon.changeRegionColor(0, CYAN);
        paintPenguinBalloon.renderImage(WRITEPENGUINBALLOON);

        paintBoba.imageCleanUp();
        paintBoba.getStencil();
        paintBoba.changeRegionColor(0, Color.DARK_GRAY);
        paintBoba.renderImage(WRITEBOBA);

        paintPenguinFamily.imageCleanUp();
        paintPenguinFamily.getStencil();
        paintPenguinFamily.changeRegionColor(0, RED);
        paintPenguinFamily.renderImage(WRITEPENGUINFAMILY);

        paintLineart.imageCleanUp();
        paintLineart.getStencil();
        paintLineart.changeRegionColor(0, CYAN);
        paintLineart.renderImage(WRITELINEART);

        paintCandle.imageCleanUp();
        paintCandle.getStencil();
        paintCandle.changeRegionColor(0, Color.BLUE);
        paintCandle.renderImage(WRITEPAINTNUMCANDLE);
    }
}
