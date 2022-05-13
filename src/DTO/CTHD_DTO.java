
package DTO;

public class CTHD_DTO {
    private String mahd, date, manv, makm="";
    private int total;

    public CTHD_DTO(String mahd, String date, String manv, int total) {
        this.mahd = mahd;
        this.date = date;
        this.total=total;
        this.manv=manv;
    }

    public String getMakm() {
        return makm;
    }
    public void setMakm(String makm) {
        this.makm = makm;
    }

    public String getMahd() {
        return mahd;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getManv() {
        return manv;
    }
    
    public String getDate() {
        return date;
    }

    public int getTotal() {
        return total;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void setTotal(int sl) {
        this.total = sl;
    }
    
}
