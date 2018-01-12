package Commons;

import javax.swing.*;
import java.awt.*;

public class SidePiecesSpace extends JPanel {
    private CoinSpace player1, player2;
    private JPanel splPlayer;

    public SidePiecesSpace() {
        super(new GridLayout(3, 1));

        setBorder(BorderFactory.createLineBorder(Color.black));

        init();

        add(player1);
        //add(splPlayer);
        add(player2);
    }

    private void init() {
        player1 = new CoinSpace(0, 9, false);
        player2 = new CoinSpace(3, 9, false);
        splPlayer = new JPanel(new GridLayout(1, 4));
    }
}
