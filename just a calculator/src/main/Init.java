import java.awt.Color;
import javax.swing.JButton;
public class Init {
    Panel panel;
    CalculatorButtons calcB;
    Action action;

    public Init(Action action) {
        this.action = action;
    }
    
    public void initPanel(Panel panel) {
        this.panel=panel;
    }
    
    public void initCalcB(CalculatorButtons calcB) {
        this.calcB = calcB;
    }

    public void initAction(Action action) {

    }

    public void initButtons() {
        panel.wButton = new JButton("W");
        panel.wButton.setVisible(true);
        panel.wButton.setBounds(500-panel.shifterX, 500-panel.shifterY, 100, 100);
        panel.wButton.setBackground(Color.white);
        panel.wButton.setForeground(Color.black);
        panel.add(panel.wButton);
        panel.wButton.addActionListener(action);

        panel.aButton = new JButton("A");
        panel.aButton.setVisible(true);
        panel.aButton.setBounds(400-panel.shifterX, 600-panel.shifterY, 100, 100);
        panel.aButton.setBackground(Color.white);
        panel.aButton.setForeground(Color.black);
        panel.add(panel.aButton);
        panel.aButton.addActionListener(action);

        panel.sButton = new JButton("S");
        panel.sButton.setVisible(true);
        panel.sButton.setBounds(500-panel.shifterX, 600-panel.shifterY, 100, 100);
        panel.sButton.setBackground(Color.white);
        panel.sButton.setForeground(Color.black);
        panel.add(panel.sButton);
        panel.sButton.addActionListener(action);

        panel.dButton = new JButton("D");
        panel.dButton.setVisible(true);
        panel.dButton.setBounds(600-panel.shifterX, 600-panel.shifterY, 100, 100);
        panel.dButton.setBackground(Color.white);
        panel.dButton.setForeground(Color.black);
        panel.add(panel.dButton);
        panel.dButton.addActionListener(action);
    }

    public void initNumberButtons() {
        for(int i = 0; i<3; i++) {
            panel.add(calcB.numbers[i]);
            calcB.numbers[i].setVisible(true);
            calcB.numbers[i].setBounds(200+i*50-panel.shifterX, 150-panel.shifterY, 50, 50);
            calcB.numbers[i].setBackground(Color.white);
            calcB.numbers[i].setForeground(Color.black);
            calcB.numbers[i].addActionListener(action);
        }
        
        for(int i = 3; i<6; i++) {
            int k = i-3;
            panel.add(calcB.numbers[i]);
            calcB.numbers[i].setVisible(true);
            calcB.numbers[i].setBounds((200+k*50)-panel.shifterX, 200-panel.shifterY, 50, 50);
            calcB.numbers[i].setBackground(Color.white);
            calcB.numbers[i].setForeground(Color.black);
            calcB.numbers[i].addActionListener(action);
            k++;
        }
        
        for(int i = 6; i<9; i++) {
            int k = i-6;
            panel.add(calcB.numbers[i]);
            calcB.numbers[i].setVisible(true);
            calcB.numbers[i].setBounds(200+k*50-panel.shifterX, 250-panel.shifterY, 50, 50);
            calcB.numbers[i].setBackground(Color.white);
            calcB.numbers[i].setForeground(Color.black);
            calcB.numbers[i].addActionListener(action);
            k++;
        }
        
        panel.add(calcB.numbers[9]);
        calcB.numbers[9].setVisible(true);
        calcB.numbers[9].setBounds(200-panel.shifterX, 300-panel.shifterY, 50, 50);
        calcB.numbers[9].setBackground(Color.white);
        calcB.numbers[9].setForeground(Color.black);
        calcB.numbers[9].addActionListener(action);

        panel.add(calcB.numbers[10]);
        calcB.numbers[10].setVisible(true);
        calcB.numbers[10].setBounds(250-panel.shifterX, 300-panel.shifterY, 50, 50);
        calcB.numbers[10].setBackground(Color.white);
        calcB.numbers[10].setForeground(Color.black);
        calcB.numbers[10].addActionListener(action);
    }

    public void initOperatorButtons() {
        panel.add(calcB.operators[0]);
        calcB.operators[0].setBounds(350-panel.shifterX, 150-panel.shifterY, 50, 50);
        calcB.operators[0].setBackground(Color.white);
        calcB.operators[0].setForeground(Color.black);
        calcB.operators[0].addActionListener(action);

        panel.add(calcB.operators[1]);
        calcB.operators[1].setBounds(350-panel.shifterX, 200-panel.shifterY, 50, 50);
        calcB.operators[1].setBackground(Color.white);
        calcB.operators[1].setForeground(Color.black);
        calcB.operators[1].addActionListener(action);

        panel.add(calcB.operators[2]);
        calcB.operators[2].setBounds(350-panel.shifterX, 250-panel.shifterY, 50, 50);
        calcB.operators[2].setBackground(Color.white);
        calcB.operators[2].setForeground(Color.black);
        calcB.operators[2].addActionListener(action);

        panel.add(calcB.operators[3]);
        calcB.operators[3].setBounds(350-panel.shifterX, 300-panel.shifterY, 50, 50);
        calcB.operators[3].setBackground(Color.white);
        calcB.operators[3].setForeground(Color.black);
        calcB.operators[3].addActionListener(action);
        
        panel.add(calcB.operators[4]);
        calcB.operators[4].setBounds(300-panel.shifterX, 300-panel.shifterY, 50, 50);
        calcB.operators[4].setBackground(Color.white);
        calcB.operators[4].setForeground(Color.black);
        calcB.operators[4].addActionListener(action);

        panel.add(calcB.operators[5]);
        calcB.operators[5].setBounds(200-panel.shifterX, 350-panel.shifterY, 200, 50);
        calcB.operators[5].setBackground(Color.white);
        calcB.operators[5].setForeground(Color.black);
        calcB.operators[5].addActionListener(action);
    }



}