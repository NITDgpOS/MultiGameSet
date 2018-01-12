package Commons;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class CoinSpace extends JPanel {
    private int numberOfPieces;
    private JPanel[][] coinSpaces;

    public CoinSpace(int color, int numberOfPieces, boolean chess) {
        super(new GridLayout(8, 4));

        this.numberOfPieces = numberOfPieces;

        setBackground(new Color(180, 80, 20));
        setBorder(new LineBorder(new Color(220, 130, 35), 10, true));

        coinSpaces = new JPanel[8][4];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                if (i * 4 + j < numberOfPieces)
                    coinSpaces[i][j] = Commons.CreateImage.getCoinInPanel(color);
                else coinSpaces[i][j] = Commons.CreateImage.getCoinInPanel(-1);

                add(coinSpaces[i][j]);
            }
        }
    }

    public boolean removeCoin() {
        if (numberOfPieces == 0) return false;

        numberOfPieces--;
        coinSpaces[numberOfPieces / 4][numberOfPieces % 4] = Commons.CreateImage.getCoinInPanel(-1);

        return true;
    }
}
