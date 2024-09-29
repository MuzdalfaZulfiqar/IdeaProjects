package javaGui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Hashtable;

public class JAVA_GUI_Sliders {
    public static void main(String[] args) {
        //sliderDemo sd = new sliderDemo();
        new mySlider();
    }}
class sliderDemo implements ChangeListener {

    JFrame frame ;
    JPanel panel ;
    JLabel label;
    JSlider slider;
    sliderDemo(){
        frame = new JFrame();
        frame.setSize(420,420);
        frame.setTitle("Slider Demo");

        label = new JLabel();

        //---------------Panel
        panel = new JPanel();


        //----------------Slider
        // For slider first of all we set the max and min  and the starting point of slider
        slider = new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);// These will add the marks on the slider
        slider.setMinorTickSpacing(10); // This value means the gap between minor range

        slider.setPaintTicks(true); // Add ticks for major one
        slider.setMajorTickSpacing(20); // This value means the gap between major range

        slider.setPaintLabels(true);  // It will add the values b/w max and min and will set them according
        // to major gap

        slider.setFont(new Font("MV Boli",Font.PLAIN,15));

        slider.setOrientation(SwingConstants.VERTICAL); // This will display the slider according to the parameter
        // By default, it was horizontal but with this it is vertical
        slider.addChangeListener(this);

        //------------------Frame
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // It will not change the value on the label so to change the value as we move the slider we will to
        // this interface method that we have implemented
        label.setText("°C = "+slider.getValue()); // This method will give us the value of slider that we have chosen
        label.setFont(new Font("MV Boli",Font.PLAIN,25));


        // Adding components
        panel.add(label,BorderLayout.SOUTH);
        panel.add(slider);
        frame.add(panel);
        frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e) {

        label.setText("°C = "+slider.getValue());
        // To make this work we need to add it into slider just like we add in the case of ActionListener
    }
}
class mySlider extends JFrame implements ChangeListener{

    JFrame frame;JPanel panel;JLabel label;JSlider slider;
    String [] s = {"Slow","Average","Fast"};
    mySlider(){
        frame = new JFrame();
        slider = new JSlider(0,s.length-1,1);
        panel = new JPanel();
        label = new JLabel();

        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("-------Personality Test----------");
        frame.setFont(new Font("MV Boli",Font.PLAIN,15));
        frame.setForeground(new Color(0xE5255557, true));



        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(1);
        slider.setPaintLabels(true);


        slider.setFont(new Font("MV Boli",Font.PLAIN,20));

        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setForeground(Color.BLACK);
        //label.setText(""+ s[slider.getValue()]);

        panel.add(label);
        panel.add(slider);
        frame.add(panel);
        frame.setVisible(true);


        // We are making this hashTable to display the text along with slider
        // and then using put function we are putting them at particular indexes
        // and setting their values then adding this table to slider
        Hashtable table = new Hashtable();
        table.put(0,new JLabel("Slow"));
        table.put(s.length/2,new JLabel("Average"));
        table.put(s.length-1,new JLabel("Fast"));

        slider.setLabelTable(table);
        slider.setPaintLabels(true);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
      label.setText("Your speed is "+ s[slider.getValue()]);

    }
}
