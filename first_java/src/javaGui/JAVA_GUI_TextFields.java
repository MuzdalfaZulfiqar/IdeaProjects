package javaGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JAVA_GUI_TextFields {
    public static void main(String[] args) {
        theFrame tf = new theFrame();
    }
}
class theFrame extends JFrame implements ActionListener{
    JButton b;
    JTextField jtf;
    theFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,50);
        this.setLayout(new FlowLayout());

        b = new JButton("Submit");
        b.addActionListener(this);

        jtf = new JTextField();
        jtf.setPreferredSize(new Dimension(350,60));
        jtf.setFont(new Font("Consolas",Font.PLAIN,35));
        jtf.setForeground(new Color(0x6EC71B));
        jtf.setBackground(Color.BLACK);

        this.add(b,BorderLayout.SOUTH);
        this.add(jtf);
        this.pack();
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            String  s = jtf.getText();
            System.out.println(s);
}
    }
}