package TicTacToe;

import javax.swing.*;
import java.awt.*;
import Commons.SidePiecesSpace;

public class TicTacToe extends JPanel {
    public TicTacToe() {
        super(new GridBagLayout());

        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.gridx = 0; gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        add(new JLabel("LOL"), gridBagConstraints);

        gridBagConstraints.gridx = 1; gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.gridheight = 400; gridBagConstraints.gridwidth = 100;
        add(new SidePiecesSpace(), gridBagConstraints);
    }
}
