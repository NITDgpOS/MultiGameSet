package TicTacToe;

import javax.swing.*;
import java.awt.*;

public class TicTacToeTile extends JButton {
    private int x, y;
    public int player;

    public TicTacToeTile(int xx, int yy) {
        super("");

        this.x = xx;
        this.y = yy;

        this.player = -1;

        setMinimumSize(new Dimension(100,100));
    }

    public void addIcon(int color) {
        ImageIcon ii = new ImageIcon(Commons.CreateImage.getCoin(color));

        this.setIcon(ii);
        this.player = color;
    }

    public int[] boardLocation() {
        return new int[]{x, y};
    }
}
