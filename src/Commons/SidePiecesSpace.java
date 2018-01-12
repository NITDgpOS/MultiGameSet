package Commons;

import javax.swing.*;
import java.awt.*;

public class SidePiecesSpace extends JPanel {
    private CoinSpace player1, player2;
    private GamesID gameID;

    public SidePiecesSpace(GamesID gameID, JPanel gameBar) {
        super(new GridLayout(3, 1));

        this.gameID = gameID;

        setBorder(BorderFactory.createLineBorder(Color.black));

        init();

        add(player1);
        add(gameBar);
        add(player2);
    }

    private void init() {
        player1 = new CoinSpace(0, 9, this.gameID == GamesID.CHESS);
        player2 = new CoinSpace(3, 9, this.gameID == GamesID.CHESS);
    }

    public void removePiece(int player) {
        if (player == 0)
            player1.removeCoin();
        else player2.removeCoin();
    }

    public void resetPieces() {
        player1.reset(0,9,this.gameID == GamesID.CHESS);
        player2.reset(3,9,this.gameID== GamesID.CHESS);
    }
}
