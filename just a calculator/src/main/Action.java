import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Action implements ActionListener {
    Panel panel;
    CalculatorButtons calcB;
    String newOutput = "";
    public void initPanel(Panel panel) {
        this.panel = panel;
    }

    public void initCalcB(CalculatorButtons calcB) {
        this.calcB = calcB;
    }

    public void actionPerformed(ActionEvent e) {
         //System.out.println("x: " + x + " y: " + y);
         if(e.getSource().equals(panel.wButton)) {
            panel.y-=50;
            panel.repaint();
            panel.setFocusable(true);
        } else if(e.getSource().equals(panel.aButton)) {
            panel.x-=50;
            panel.repaint();
            panel.setFocusable(true);
        } else if(e.getSource().equals(panel.sButton)) {
            panel.y+=50;
            panel.repaint();
            panel.setFocusable(true);
        } else if(e.getSource().equals(panel.dButton)) {
            panel.x+=50;
            panel.repaint();
            panel.setFocusable(true);
        }

/* 
        switchll=true;
        started=true;
        if(switchll) {
            repaint();
            increment++;
            counter();
            if(increment>7) {
                increment=0;
            }
        }
        //System.out.println(increment);

    */

    if(e.getSource().equals(calcB.numbers[0])) {
        panel.output+=7;
        panel.inputOutput.setText(panel.output);
    } else if(e.getSource().equals(calcB.numbers[1])) {
        panel.output+=8;
        panel.inputOutput.setText(panel.output);
    } else if(e.getSource().equals(calcB.numbers[2])) {
        panel.output+=9;
        panel.inputOutput.setText(panel.output);
    } else if(e.getSource().equals(calcB.numbers[3])) {
        panel.output+=4;
        panel.inputOutput.setText(panel.output);
    } else if(e.getSource().equals(calcB.numbers[4])) {
        panel.output+=5;
        panel.inputOutput.setText(panel.output);
    } else if(e.getSource().equals(calcB.numbers[5])) {
        panel.output+=6;
        panel.inputOutput.setText(panel.output);
    } else if(e.getSource().equals(calcB.numbers[6])) {
        panel.output+=1;
        panel.inputOutput.setText(panel.output);
    } else if(e.getSource().equals(calcB.numbers[7])) {
        panel.output+=2;
        panel.inputOutput.setText(panel.output);
    } else if(e.getSource().equals(calcB.numbers[8])) {
        panel.output+=3;
        panel.inputOutput.setText(panel.output);
    } else if(e.getSource().equals(calcB.numbers[9])) {
        panel.output+=0;
        panel.inputOutput.setText(panel.output);
    } else if(e.getSource().equals(calcB.numbers[10])) {
        panel.inputOutput.setText(panel.output+=".");
    } else if(e.getSource().equals(calcB.operators[0])) {
        panel.inputOutput.setText(panel.output+="/");
    } else if(e.getSource().equals(calcB.operators[1])) {
        panel.inputOutput.setText(panel.output+="*");
    } else if(e.getSource().equals(calcB.operators[2])) {
        panel.inputOutput.setText(panel.output+="-");
    } else if(e.getSource().equals(calcB.operators[3])) {
        panel.inputOutput.setText(panel.output+="+");
        panel.inputOutput.setText(panel.output);
    } else if(e.getSource().equals(calcB.operators[4])) {
        panel.inputOutput.setText(panel.splitOperator(panel.inputOutput.getText()));
        panel.output=panel.splitOperator(panel.inputOutput.getText());
        panel.inputOutput.setText(newOutput);
        panel.output=newOutput;
    } else if(e.getSource().equals(calcB.operators[5])) {
        panel.output="";
        panel.inputOutput.setText(panel.output);
    }
    }
}
