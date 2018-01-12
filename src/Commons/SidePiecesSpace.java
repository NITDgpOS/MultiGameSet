package Commons;

import javax.swing.*;
import java.awt.*;

public class SidePiecesSpace extends JPanel {
    private JPanel player1, player2, player3;

    public SidePiecesSpace() {
        super(new GridLayout(3, 1));

        init();

        add(player1);
        add(player2);
        add(player3);
    }

    private void init() {
        player1 = new JPanel(new GridLayout(1, 1));
        player2 = new JPanel(new GridLayout(1, 1));
        player3 = new JPanel(new GridLayout(1, 1));
    }
}
