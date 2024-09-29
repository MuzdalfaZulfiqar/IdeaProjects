package javaGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JAVA_GUI_New_Window {
    public static void main(String[] args) {
        //launchPage lp = new launchPage();

        launch l = new launch();
    }
}
class launchPage implements ActionListener {

    JFrame f = new JFrame();
    JButton b = new JButton("New Window");
    launchPage(){
        b.setBounds(100,160,200,40);
        b.setFocusable(false);
        b.addActionListener(this);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(420,420);
        f.setLayout(null);
        f.setVisible(true);
        f.add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            f.dispose();// will allow to get rid of launch page and open a new window only once
            newWindow nw = new newWindow();
        }
    }
}
class newWindow{

    newWindow() {
        JLabel l =new JLabel();
        l.setFont(new Font("MV Boli",Font.BOLD,20));
        l.setText("You are in new Window now!");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setVerticalAlignment(JLabel.CENTER);
        l.setForeground(new Color(7, 123, 164));

        JFrame f = new JFrame();
        f.setSize(420,420);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(l);
        f.setVisible(true);
    }
}

class launch extends JFrame implements ActionListener{
    JFrame f = new JFrame();
    JButton b = new JButton();
    launch(){
        b.setText("New Window");
        b.setFont(new Font(Font.SERIF,Font.ITALIC,20));
        b.setForeground(Color.lightGray);
        b.setFocusable(false);
        b.setSize(20,20);
        b.addActionListener(this);

        f.setSize(420,420);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){}
        Window w = new Window();
    }
}
class Window extends JFrame{
    JFrame f = new JFrame();
    JLabel b= new JLabel();
    Window(){
        b.setText("Welcome to the novel world");
        b.setForeground(new Color(94, 215, 93));
        b.setFont(new Font(Font.SERIF,Font.ITALIC,20));
        b.setHorizontalTextPosition(JLabel.CENTER);
        b.setVerticalTextPosition(JLabel.CENTER);

        f.setSize(420,420);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.add(b);


    }
}