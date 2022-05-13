package GUI;


import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelContact extends JPanel {
    private ImageIcon icon = new ImageIcon(getClass().getResource("/Icon/Contact.png"));
    private JLabel iconLabel = new JLabel(icon);
    public PanelContact(){
        add(iconLabel);
        setBackground(Color.white);
    }
}
