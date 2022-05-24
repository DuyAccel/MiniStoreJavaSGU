package GUI;

import javax.swing.JTabbedPane;

import DTO.NV_DTO;
import GUI.Items.PanelChangePasswd;
import Phuc.Nhanvien;

public class PanelManger extends JTabbedPane{
    
    private PanelChangePasswd passwd;
    private Nhanvien UserManger = new Nhanvien();

    public PanelManger(NV_DTO user){
        passwd = new PanelChangePasswd(user);

        addTab("Đổi mật khẩu", passwd);
        addTab("QL Nhân Viên", UserManger);

        //getTabComponentAt(1).setEnabled(false);
    }
}
