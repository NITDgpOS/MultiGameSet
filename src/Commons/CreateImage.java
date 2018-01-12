package Commons;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class CreateImage {

    public static Color gray = new Color(160, 160, 160);
    public static Color red = new Color(215, 30, 20);
    public static Color green = new Color(80, 160, 40);
    public static Color blue = new Color(40, 80, 160);

    /**
     * @param color: Color code of the token needed
     * @return Returns the token in JPanel object
     */
    public static JPanel getCoinInPanel(int color) {
        ImageIcon ii = new ImageIcon(getCoin(color));
        JLabel jl = new JLabel(ii, JLabel.CENTER);
        JPanel ret = new JPanel(new GridLayout(1, 1));

        ret.add(jl);

        return ret;
    }

    /**
     * @param color: Possible values of color:
     *               - -1 = Colorless
     *               - 0 = Gray
     *               - 1 = Red
     *               - 2 = Green
     *               - 3 = Blue
     * @return A BufferedImage token of the given color
     */
    public static BufferedImage getCoin(int color) {
        BufferedImage buf = new BufferedImage(20, 20, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = (Graphics2D) buf.getGraphics();

        graphics.setComposite(AlphaComposite.Clear);
        graphics.fillRect(0, 0, 20, 20);

        if (color > 3 || color < 0) return buf;

        Color coinColor = color == 0 ? gray : red;
        if (color == 2) coinColor = green;
        else if (color == 3) coinColor = blue;

        graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC));
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