package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Commons.GamesID;
import Commons.SidePiecesSpace;

public class TicTacToe extends JPanel implements ActionListener {
    private JPanel gameBar;
    private JPanel gameBoard;
    private int turn;

    public TicTacToe() {
        super(new GridBagLayout());

        makeItems();

        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        add(gameBoard, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.gridheight = 400;
        gridBagConstraints.gridwidth = 140;
        add(new SidePiecesSpace(GamesID.TICTACTOE, gameBar), gridBagConstraints);
    }

    private void makeItems() {
        gameBoard = new JPanel(new GridLayout(3, 3));
        gameBar = new JPanel(new GridLayout(1, 2));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                TicTacToeTile button = new TicTacToeTile(i, j);
                button.addActionListener(this);
                button.setSize(new Dimension(100, 100));
                gameBoard.add(button);
            }
        }

        JLabel status = new JLabel("Player " + (turn % 2 + 1) + ", please play!");

        gameBar.add(status);

        JButton reset = new JButton("Reset");
        reset.addActionListener(actionEvent -> {
            turn = 0;

            ((JLabel) gameBar.getComponent(0)).setText("Player " + (turn % 2 + 1) + ", please play!");
            gameBar.getComponent(1).setEnabled(false);
            ((SidePiecesSpace)getComponent(1)).resetPieces();

            for (Component component : gameBoard.getComponents()) {
                component.setEnabled(true);
                ((TicTacToeTile) component).addIcon(-1);
            }
        });

        reset.setEnabled(false);

        gameBar.add(reset);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TicTacToeTile source = (TicTacToeTile) actionEvent.getSource();

        if (source.player != -1) return;

        ((SidePiecesSpace) this.getComponent(1)).removePiece(turn % 2);

        source.addIcon(turn % 2 == 0 ? 0 : 3);
        turn++;
        ((JLabel) gameBar.getComponent(0)).setText("Player " + (turn % 2 + 1) + ", please play!");

        checkVictory(source.boardLocation());
    }

    private void checkVictory(int[] addition) {
        boolean victoryVertical = true, victoryHorizontal = true, victoryDiagonal = false;

        // Check Vertical
        for (int i = 0; i < 3; i++) {
            if (getPlayer(i * 3 + addition[1]) != getPlayer(addition[0] * 3 + addition[1]))
                victoryVertical = false;
        }

        // Check Horizontal
        for (int i = 0; i < 3; i++) {
            if (getPlayer(addition[0] * 3 + i) != getPlayer(addition[0] * 3 + addition[1]))
                victoryHorizontal = false;
        }

        // Check Diagonal
        if (addition[0] == addition[1] || addition[0] + addition[1] == 2) {
            boolean backSlash = true, frontSlash = true;
            for (int i = 0; i < 3; i++) {
                if (getPlayer(i * 3 + i) != getPlayer(addition[0] * 3 + addition[1]))
                    backSlash = false;
            }
            for (int i = 0; i < 3; i++) {
                if (getPlayer((i + 1) * 2) != getPlayer(addition[0] * 3 + addition[1]))
                    frontSlash = false;
            }
            victoryDiagonal = backSlash || frontSlash;
        }

        if (victoryDiagonal || victoryHorizontal || victoryVertical) {

            displayWin(getPlayer(addition[0] * 3 + addition[1]));

            return;
        }

        if (turn == 9) {
            displayWin(-1);
        }
    }

    private void displayWin(int player) {
        if (player == -1)
            ((JLabel) gameBar.getComponent(0)).setText("Its a draw!!!");
        else ((JLabel) gameBar.getComponent(0)).setText("Player " + ((turn + 1) % 2 + 1) + " wins");

        for (Component component : gameBoard.getComponents()) {
            component.setEnabled(false);
        }

        gameBar.getComponent(1).setEnabled(true);
    }

    private int getPlayer(int ind) {
        return ((TicTacToeTile) gameBoard.getComponent(ind)).player;
    }
}
