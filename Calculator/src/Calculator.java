import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Calculator   extends JFrame {
    double num1,num2, result;
    int deccount = 0;
    String s = "";
    char operator;
    Calculator(){

        // Panel 1
        JPanel upperPanel = new JPanel();
        upperPanel.setBounds(0,0,400,60);
        upperPanel.setBackground(Color.white);

        JTextField input = new JTextField();
        input.setPreferredSize(new Dimension(380,40));
        input.setBounds(0, 150, 380, 40);
        input.setFont(new Font("TimesRoman",Font.PLAIN,20));
        input.setForeground(Color.BLACK);
        input.setEditable(false);

        upperPanel.add(input);

        // Panel 2
        JPanel lowerPanel = new JPanel();
        System.out.println("Panel was added");
        lowerPanel.setBounds(0,60,400,330);
        lowerPanel.setBackground(Color.white);
        lowerPanel.setLayout(null);
        JButton seven= new JButton();
        seven.setPreferredSize(new Dimension(80,40));
        seven.setText("7");
        seven.setFont(new Font("TimesRoman",Font.BOLD,11));
        seven.setBounds(10,0,80,50);
        seven.setFocusable(false);
        seven.setBackground(new Color(160, 199, 172));
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = s+String.valueOf(7);
                input.setText(s);
            }
        });
        lowerPanel.add(seven);
        JButton eight= new JButton();
        eight.setPreferredSize(new Dimension(80,50));
        eight.setText("8");
        eight.setFont(new Font("TimesRoman",Font.BOLD,11));
        eight.setBounds(100,0,80,50);
        eight.setFocusable(false);
        eight.setBackground(new Color(160, 199, 172));

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = s+String.valueOf(8);
                input.setText(s);
            }
        });
        lowerPanel.add(eight);
        JButton nine= new JButton();
        nine.setPreferredSize(new Dimension(80,50));
        nine.setText("9");
        nine.setFont(new Font("TimesRoman",Font.BOLD,11));
        nine.setBounds(200,0,80,50);
        nine.setFocusable(false);
        nine.setBackground(new Color(160, 199, 172));
        lowerPanel.add(nine);
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = s+String.valueOf(9);
                input.setText(s);
            }
        });

        JButton add = new JButton();
        add.setPreferredSize(new Dimension(80,50));
        add.setText("+");
        add.setFont(new Font("TimesRoman",Font.BOLD,11));
        add.setBounds(300,0,80,50);
        add.setFocusable(false);
        add.setBackground(new Color(160, 199, 172));
        lowerPanel.add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = '+';
                s = s + String.valueOf(operator);
                input.setText("");
            }
        });

        JButton four= new JButton();
        four.setPreferredSize(new Dimension(80,50));
        four.setText("4");
        four.setFont(new Font("TimesRoman",Font.BOLD,11));
        four.setBounds(10,60,80,50);
        four.setFocusable(false);
        four.setBackground(new Color(160, 199, 172));
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = s+String.valueOf(4);
                input.setText(s);
            }
        });
        lowerPanel.add(four);

        JButton five= new JButton();
        five.setPreferredSize(new Dimension(80,50));
        five.setText("5");
        five.setFont(new Font("TimesRoman",Font.BOLD,11));
        five.setBounds(100,60,80,50);
        five.setFocusable(false);
        five.setBackground(new Color(160, 199, 172));
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = s+String.valueOf(5);
                input.setText(s);
            }
        });

        lowerPanel.add(five);

        JButton six= new JButton();
        six.setPreferredSize(new Dimension(80,50));
        six.setText("6 ");
        six.setFont(new Font("TimesRoman",Font.BOLD,11));
        six.setBounds(200,60,80,50);
        six.setFocusable(false);
        six.setBackground(new Color(160, 199, 172));
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = s+String.valueOf(6);
                input.setText(s);
            }
        });
        lowerPanel.add(six);

        JButton subtract = new JButton();
        subtract.setPreferredSize(new Dimension(80,50));
        subtract.setText("-");
        subtract.setFont(new Font("TimesRoman",Font.BOLD,11));
        subtract.setBounds(300,60,80,50);
        subtract.setFocusable(false);
        subtract.setBackground(new Color(160, 199, 172));
        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = '-';
                s = s + String.valueOf(operator);
                input.setText("");
            }
        });

        lowerPanel.add(subtract);


        JButton one = new JButton();
        JButton two= new JButton();
        JButton three = new JButton();
        JButton multiply = new JButton();
        one.setPreferredSize(new Dimension(80,50));
        one.setText("1");
        one.setFont(new Font("TimesRoman",Font.BOLD,11));
        one.setBounds(10,120,80,50);
        one.setFocusable(false);
        one.setBackground(new Color(160, 199, 172));
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = s+String.valueOf(1);
                input.setText(s);
            }
        });
        lowerPanel.add(one);


        two.setPreferredSize(new Dimension(80,50));
        two.setText("2");
        two.setFont(new Font("TimesRoman",Font.BOLD,11));
        two.setBounds(100,120,80,50);
        two.setFocusable(false);
        two.setBackground(new Color(160, 199, 172));
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = s+String.valueOf(2);
                input.setText(s);
            }
        });
        lowerPanel.add(two);


        three.setPreferredSize(new Dimension(80,50));
        three.setText("3");
        three.setFont(new Font("TimesRoman",Font.BOLD,11));
        three.setBounds(200,120,80,50);
        three.setFocusable(false);
        three.setBackground(new Color(160, 199, 172));
        three .addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = s+String.valueOf(3);
                input.setText(s);
            }
        });
        lowerPanel.add(three);


        multiply.setPreferredSize(new Dimension(80,50));
        multiply.setText("*");
        multiply.setFont(new Font("TimesRoman",Font.BOLD,11));
        multiply.setBounds(300,120,80,50);
        multiply.setFocusable(false);
        multiply.setBackground(new Color(160, 199, 172));
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = '*';
                s = s+String.valueOf(operator);
                input.setText("");
            }
        });
        lowerPanel.add(multiply);



        JButton zero = new JButton();
        JButton decimal = new JButton();
        JButton division = new JButton();
        JButton equals = new JButton();

        zero.setPreferredSize(new Dimension(80,50));
        zero.setText("0");
        zero.setFont(new Font("TimesRoman",Font.BOLD,11));
        zero.setBounds(10,190,80,50);
        zero.setFocusable(false);
        zero.setBackground(new Color(160, 199, 172));
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = s+String.valueOf(0);
                input.setText(s);
            }
        });
        lowerPanel.add(zero);



        decimal.setPreferredSize(new Dimension(80,50));
        decimal.setText(".");
        decimal.setFont(new Font("TimesRoman",Font.BOLD,11));
        decimal.setBounds(100,190,80,50);
        decimal.setFocusable(false);
        decimal.setBackground(new Color(160, 199, 172));

        decimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(s.length() == 0){
                    if(deccount == 0){
                        s = s+String.valueOf("0.");
                        deccount++;
                    }
                    else{
                    }
                    input.setText(s);
                }
                else{
                    if(deccount == 0){
                        s = s+String.valueOf(".");
                        deccount++;
                    }
                    else{
                    }
                    input.setText(s);
                }
            }
        });
        lowerPanel.add(decimal);


        division.setPreferredSize(new Dimension(80,50));
        division.setText("/");
        division.setFont(new Font("TimesRoman",Font.BOLD,11));
        division.setBounds(200,190,80,50);
        division.setFocusable(false);
        division.setBackground(new Color(160, 199, 172));
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = '/';
                s = s + String.valueOf(operator);
                input.setText("");
            }
        });
        lowerPanel.add(division);


        equals.setPreferredSize(new Dimension(80,50));
        equals.setText("=");
        equals.setFont(new Font("TimesRoman",Font.BOLD,11));
        equals.setBounds(300,190,80,50);
        equals.setFocusable(false);
        equals.setBackground(new Color(160, 199, 172));
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int opIndex = 0;
                for(int i = 0;i<s.length();i++){
                    if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' ||
                            s.charAt(i) == '/'){
                        opIndex = i;
                        break;
                    }
                }

                double num1 =  Integer.parseInt(s.substring(0,opIndex));
                double num2 = Integer.parseInt(s.substring(opIndex+1));
                if(operator== '+'){
                    result = num1 + num2;
                }
                else if(operator == '-'){
                    result = num1-num2;
                }
                else if(operator == '/'){
                    result = num1/num2;
                }
                else{
                    result = num1*num2;
                }

                input.setText(String.valueOf(result));
            }
        });
        lowerPanel.add(equals);

        // Frame
        this.setTitle("Calculator");
        this.setSize(410, 400);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // To change the background of gui window
        this.getContentPane().setBackground(new Color(218, 246, 237));
        this.add(upperPanel);
        this.add(lowerPanel);
        // To display the frame in center
        this.setLocationRelativeTo(null);
    }
}

class c{
    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}