 

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel {
    JButton button = new JButton();
    JButton button1 = new JButton();
    JButton wButton;
    JButton aButton;
    JButton sButton;
    JButton dButton;
    JLabel inputOutput;
    CalculatorButtons calcB;
    Color outlineColor;
    boolean switchll;
    int increment;
    boolean started;
    int x;
    int y;
    int shifterX =150;
    int shifterY =50;
    String output = "";
    Init init;
    Action action;
    public Panel(Init init, Action action) {
        this.action = action;
        this.init=init;
        outlineColor = new Color(192, 192, 192);
        inputOutput = new JLabel("");
        add(inputOutput);
        inputOutput.setVisible(true);
        inputOutput.setEnabled(false);
        inputOutput.setBounds(260-shifterX, 100-shifterY, 500, 50);
        calcB = new CalculatorButtons(this);
        x=0;
        y=0;

        init.initCalcB(calcB);
        init.initPanel(this);
        
        action.initCalcB(calcB);
        action.initPanel(this);

        initButtons();

        //System.out.println(aButton.getClass().getName());

        /*
        switchll=false;
        started=false;
        increment=-1;
        */


        setBackground(Color.black);
        setLayout(null);
        setFocusable(true);
        /* 
        
        for(int j = 0; j<7; j++) {
            for(int i = 0; i<7; i++) {
                JButton button2 = new JButton();
                button2.setOpaque(true);
                button2.setContentAreaFilled(false);
                button2.setBorderPainted(false);
                button2.setFocusPainted(true);
                button2.setBackground(Color.blue);
                button2.setForeground(Color.green);
                button2.setText(i + ", " + j);
                add(button2);
                button2.setVisible(true);
                button2.setBounds(i*100, j*100, 100, 100);
                button2.addActionListener(this);
        }
    }

    */
    
    
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        
        calcB.paint(g);
        g.setColor(outlineColor);


        //draw outline

        //draw ceiling

        for(int i = 0; i<5; i++) {
            g.fillRect(200+50*i-shifterX, 50-shifterY, 50, 50);
        }

        //draw floor

        for(int i = 0; i<5; i++) {
            g.fillRect(200+50*i-shifterX, 450-shifterY-50, 50, 50);
        }

        //draw left wall

        for(int i = 0; i<8; i++) {
            g.fillRect(150-shifterX, 50*i+50-shifterY, 50, 50);
        }

        //draw right wall

        for(int i = 0; i<8; i++) {
            g.fillRect(450-shifterX-50, 50*i+50-shifterY, 50, 50);
        }


        //draw output box

        for(int i =0; i<4; i++) {
            g.setColor(Color.white);
            g.fillRect(200+50*i-shifterX, 100-shifterY, 50, 50);
        }


        //g.setColor(Color.blue);
       //g.fillRect(x, y, 100-50, 100-50);

        /*
        g.setColor(Color.white);
        if(switchll) {
            g.setColor(new Color((int)((255 - 0+1)*Math.random() + 0), (int)((255 - 0+1)*Math.random() + 0), (int)((255 - 0+1)*Math.random() + 0)));
            g.fillRect(increment*100, 0, 100, 100);
            for(int y = 0; y<8; y++) {
                for(int x = 0; x<8; x++) {
                    g.setColor(new Color((int)((255 - 0+1)*Math.random() + 0), (int)((255 - 0+1)*Math.random() + 0), (int)((255 - 0+1)*Math.random() + 0)));
                    g.fillRect(x*100, y*100, 3*10, 3*10);
                }
            }
        }
        */

        g.setColor(Color.red);
        g.drawString("literally just a calculator", 250-shifterX-25, 80-shifterY);

    }

    public void initButtons() {
        init.initButtons();
        init.initNumberButtons();
        init.initOperatorButtons();
    }

    
    
    public String splitOperator(String input) {
        String output = "";
        double firstHalf = -1;
        double secondHalf = -1;
        int index = -1;
        double doubleOutput = -1;
        for(int i = 0; i<input.length()-1; i++) {
            try {
                if(input.substring(i, i+1).equals("/")) {
                    index=i;
                    firstHalf=Double.parseDouble(input.substring(0, i));
                    secondHalf=Double.parseDouble(input.substring(i+1));
                    doubleOutput=firstHalf/secondHalf;
                    output=Double.toString(doubleOutput);
                    inputOutput.setText(output);
                    action.newOutput =output;
                } else if(input.substring(i, i+1).equals("*")) {
                    index=i;
                    firstHalf=Double.parseDouble(input.substring(0, i));
                    secondHalf=Double.parseDouble(input.substring(i+1));
                    doubleOutput=firstHalf*secondHalf;
                    output=Double.toString(doubleOutput);
                    inputOutput.setText(output);
                    action.newOutput =output;
                } else if(input.substring(i, i+1).equals("-")) {
                    index=i;
                    firstHalf=Double.parseDouble(input.substring(0, i));
                    secondHalf=Double.parseDouble(input.substring(i+1));
                    doubleOutput=firstHalf-secondHalf;
                    output=Double.toString(doubleOutput);
                    inputOutput.setText(output);
                    action.newOutput =output;
                } else if(input.substring(i, i+1).equals("+")) {
                    index=i;
                    firstHalf=Double.parseDouble(input.substring(0, i));
                    secondHalf=Double.parseDouble(input.substring(i+1));
                    doubleOutput=firstHalf+secondHalf;
                    output=Double.toString(doubleOutput);
                    inputOutput.setText(output);
                    action.newOutput =output;
                }
            } catch (Exception e) {
                output="N/A";
            }
            
        }
        return output;
    }


}
