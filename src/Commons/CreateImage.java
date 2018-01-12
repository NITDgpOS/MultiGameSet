package Commons;

import java.awt.*;
import java.awt.image.BufferedImage;

public class CreateImage {

    public static Color blue = new Color(40, 80, 160);
    public static Color gray = new Color(160, 160, 160);

    public static BufferedImage getCoin(int color) {
        BufferedImage buf = new BufferedImage(20, 20, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = (Graphics2D) buf.getGraphics();

        Color coinColor = color == 1 ? blue : gray;

        graphics.setColor(Color.WHITE);
        graphics.fill3DRect(0, 0, 20, 20, true);

        drawCircle(graphics, coinColor, 0, 0, 10);
        drawCircle(graphics, Color.WHITE, 4, 4, 6);
        drawCircle(graphics, coinColor, 5, 5, 5);
        drawCircle(graphics, Color.BLACK, 8, 8, 2);

        return buf;
    }

    public static void drawCircle(Graphics2D g, Color color, int x, int y, int radii) {
        g.setColor(color);
        g.fillOval(x, y, radii << 1, radii << 1);
    }
}
