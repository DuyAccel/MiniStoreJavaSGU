package GUI;

import javax.swing.JTabbedPane;

import DTO.NV_DTO;
import GUI.Items.PanelChangePasswd;

public class PanelManger extends JTabbedPane{
    
    private PanelChangePasswd passwd;

    public PanelManger(NV_DTO user){
        passwd = new PanelChangePasswd(user);
        addTab("Đổi mật khẩu", passwd);
        
    }
}
