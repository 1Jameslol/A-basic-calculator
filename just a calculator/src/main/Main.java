 

import java.awt.Dimension;
import javax.swing.JFrame;

public class Main {
    JFrame frame;
    Panel panel;
    public Main() {
        Action action = new Action();
        Init init = new Init(action);
        frame = new JFrame("just a calculator");
        Panel panel = new Panel(init, action);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(50*6, 8*50+32));
        frame.pack();
        frame.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Main main = new Main();
    }
}
