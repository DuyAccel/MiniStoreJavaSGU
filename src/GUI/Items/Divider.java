package GUI.Items;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;

import Function.GUI;

public class Divider extends JPanel{
    private JLabel header = new JLabel();
    public Divider(String text, int width, int height){
        header.setText(text);
        GUI gui = new GUI();
        gui.setFont(header, 3, 20);
        setBackground(new ColorUIResource(48, 144, 216));
        setPreferredSize(new DimensionUIResource(width, height));
        add(header);
    }
}
