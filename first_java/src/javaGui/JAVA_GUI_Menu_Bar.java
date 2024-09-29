package javaGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class JAVA_GUI_Menu_Bar {
    public static void main(String[] args) {
        //new yourFrame();
        new bars();
    }
}
class yourFrame extends JFrame implements ActionListener{
    JMenuBar menu;
    JMenu file;
    JMenu edit;
    JMenu help;
    JMenuItem load;
    JMenuItem save;
    JMenuItem exit;

    yourFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(420,420);

        // Creating the menu
         menu = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        // Creating menu list for each menu
        load = new JMenuItem("Load");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        // Adding these items to file menu
        file.add(load);
        file.add(save);
        file.add(exit);

        load.addActionListener(this);
        load.setSize(20,20);
        save.addActionListener(this);
        save.setSize(20,20);
        exit.addActionListener(this);
        exit.setSize(20,20);

        // This will set the UnderLined
        load.setMnemonic(KeyEvent.VK_L); // L
        save.setMnemonic(KeyEvent.VK_S); // S
        exit.setMnemonic(KeyEvent.VK_E); // E
        file.setMnemonic(KeyEvent.VK_F); // Alt  +  f
        edit.setMnemonic(KeyEvent.VK_E); // Alt  +  e
        help.setMnemonic(KeyEvent.VK_H); // Alt  +  h

        // Adding all menus to menu bar
        menu.add(file);
        menu.add(edit);
        menu.add(help);

        // Adding menu-bar to frame
        this.setJMenuBar(menu);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==load){
    System.out.println("Loading.....");
        }
        if(e.getSource()==save){
            System.out.println("Saving....");
        }
        if(e.getSource()
        == exit){
            System.exit(0);
        }
    }
}

class bars extends JFrame implements ActionListener{

    JMenuBar bar;
    JMenu file;
    JMenu edit;
    JMenu view;
    JMenuItem setting;
    JMenuItem save;
    bars(){
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        bar = new JMenuBar();
        bar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        bar.setBackground(new Color(0xA5B41E));

        file = new JMenu("File");
        file.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        edit = new JMenu("Edit");
        edit.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        view = new JMenu("View");
        view.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        setting = new JMenuItem("Settings");
        setting.addActionListener(this);
        setting.setBackground(new Color(0x85C746));
        setting.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        save = new JMenuItem("Save");
        save.addActionListener(this);
        save.setBackground(new Color(0x85C746));
        save.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        file.add(setting);
        file.add(save);


        bar.add(file);
        bar.add(edit);
        bar.add(view);

        this.setJMenuBar(bar);
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==save){
            System.out.println("Saving");
        }
        else{
            System.out.println("Setting");
        }

    }
}