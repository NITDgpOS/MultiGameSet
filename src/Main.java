import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }

    Main() {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new MyTabPane(), BorderLayout.CENTER);
        this.pack();
        this.setSize(new Dimension(650, 400));
        this.setVisible(true);
    }
}
