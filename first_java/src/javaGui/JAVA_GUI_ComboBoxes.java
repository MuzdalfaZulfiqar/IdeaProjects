package javaGui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JAVA_GUI_ComboBoxes {
    public static void main(String[] args) {
        new comboFrame();
    }
}

class comboFrame extends JFrame implements ActionListener{
    // This helps us to make a drop-down menu and for that we make an array of options we want
    JComboBox combo;

    comboFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(420,420);

        // -----------------Some precautions
        // While passing arrays to combo boxes we must pass the reference type of that class like String
        // but for integer array int will not work so standard reference type would be Integers
        Integer [] zoo = {1,2,3}; // Allowed while passing in comboBox class
        int [] fruit = {1,2,3}; // Not Allowed
        Double [] veg = {.1,1.1}; // Capital double is allowed small one is not

        String [] animals = {"Dog","Cat","Bird"};
        combo= new JComboBox(animals);
        combo.addActionListener(this);

        // -------------------Use of JComboBox class methods--------------------
        // combo.setEditable(true);// We can edit the items in the combo box with this method and type in something
        // that we want
        // System.out.println(combo.getItemCount()); // Gives the number of items that are on our combo box
        // combo.addItem("Horse"); // It allows us to add any new item in the list
        // combo.insertItemAt("Chicken",0); // It will add items at particular index,and it will move other
        // items forward but will not remove them
        // combo.setSelectedIndex(0); // Above method will not place it at 0 index ,so we will use this method
        // ,and it will set that particular item at that particular index where we will pass it
        // combo.removeItem("Dog"); // It allows to remove the particular index
        // combo.removeItemAt(0);// It will remove the items at a particular index
      //  combo.removeAllItems();

        this.add(combo);
        // this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==combo){
            String s = (String) combo.getSelectedItem();
            System.out.println(s);
            System.out.println(combo.getSelectedItem());
            System.out.println(combo.getSelectedIndex());
        }
    }
}
