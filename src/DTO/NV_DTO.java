
package DTO;

public class NV_DTO {
    
    private String manv, tenv, ngsinh, dchi, sdt, cvu, pass;
    private int isdeleted;

    public NV_DTO(String manv, String tenv, String ngsinh, String dchi, String sdt, String cvu, String pass) {
        this.manv = manv;
        this.tenv = tenv;
        this.ngsinh = ngsinh;
        this.dchi = dchi;
        this.sdt = sdt;
        this.cvu = cvu;
        this.pass=pass;
    }
    public String getManv() {
        return manv;
    }

    public String getTenv() {
        return tenv;
    }

    public String getNgsinh() {
        return ngsinh;
    }

    public String getDchi() {
        return dchi;
    }

    public String getSdt() {
        return sdt;
    }

    public String getCvu() {
        return cvu;
    }

    public int getIsdeleted() {
        return isdeleted;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public void setTenv(String tenv) {
        this.tenv = tenv;
    }

    public void setNgsinh(String ngsinh) {
        this.ngsinh = ngsinh;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setCvu(String cvu) {
        this.cvu = cvu;
    }

    public void setIsdeleted(int isdeleted) {
        this.isdeleted = isdeleted;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }
    
}
