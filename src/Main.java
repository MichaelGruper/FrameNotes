import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[10];
       //Step one: create a frame
        JFrame frame = new JFrame("My first frame");
        frame.setSize(500,500);
       //Step two: create a panel
        //default layout is flowLayout
        JPanel panel = new JPanel();
        panel.setBackground(new Color(200,255,190));

       //Step three: create components
       JLabel label = new JLabel("Hello World");
       JButton button = new JButton("Push me!");
       JTextField textField = new JTextField(10);
       //adding textField text to the JComboBox


       //adding an image
        ImageIcon icon = new ImageIcon("Images/MyCards/2C.png");
        //scaling the image before putting it on the label
        icon.setImage(icon.getImage().getScaledInstance(50,70,Image.SCALE_DEFAULT));
        //creating a label with an icon on it
        JLabel picLabel = new JLabel(icon);

        //adding my own JComponent
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(words));
        comboBox.addItem("Hello");
        comboBox.addItem("This is a JComboBox");
        boolean cBTF = comboBox.isEditable();
        comboBox.addItem("Goodbye");

       //Step four: add components to the panel
       panel.add(label);
       panel.add(button);
       panel.add(textField);
       panel.add(picLabel);
       panel.add(comboBox);

       //Step five: add panel to frame
       frame.add(panel);


       //Step six: set frame visible
       frame.setVisible(true);



    }
}