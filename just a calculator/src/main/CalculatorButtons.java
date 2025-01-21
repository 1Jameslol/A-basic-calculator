 

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

public class CalculatorButtons {
    JButton[] numbers;
    JButton[] operators;
    Panel panel;
    public CalculatorButtons(Panel panel) {
        this.panel = panel;
        numbers = new JButton[11];
        operators =  new JButton[6];
        initNumbers();
        initOperators();
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        //g.fillRect(200, 150, 50, 50);
    }

    public void initNumbers() {
        numbers[0] = new JButton("7");
        numbers[1] = new JButton("8");
        numbers[2] = new JButton("9");
        numbers[3] = new JButton("4");
        numbers[4] = new JButton("5");
        numbers[5] = new JButton("6");
        numbers[6] = new JButton("1");
        numbers[7] = new JButton("2");
        numbers[8] = new JButton("3");
        numbers[9] = new JButton("0");
        numbers[10] = new JButton(".");
    }

    public void initOperators() {
        operators[0] = new JButton("/");
        operators[1] = new JButton("*");
        operators[2] = new JButton("-");
        operators[3] = new JButton("+");
        operators[4] = new JButton("=");
        operators[5] = new JButton("CLEAR");

    }
    
}
