import javax.swing.*;
import java.awt.*;

public class MyTabPane extends JPanel {
    public MyTabPane() {
        super(new GridLayout(1, 1));

        JTabbedPane pane = new JTabbedPane();
        pane.add("Chess", makeTextPanel("Chess baby"));
        pane.add("9 men morris", makeTextPanel("9 men morris"));
        pane.add("Ludo", makeTextPanel("Ludo"));
        pane.add("Snake and Ladder", makeTextPanel("Snake and Ladder"));
        pane.add("Checkers", makeTextPanel("Checkers"));
        pane.add("Tic Tac Toe", makeTextPanel("Tic Tac Toe"));

        add(pane);

        pane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        pane.setTabPlacement(JTabbedPane.LEFT);
    }

    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
}