/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 84362
 */
public class User {
    private String ID;
    private String Ten;
    private String MatKhau;
    private String Vaitro;
    private String Email;
    private String DiaChi;

    public User(String ID, String Ten, String MatKhau, String Vaitro, String Email, String DiaChi) {
        this.ID = ID;
        this.Ten = Ten;
        this.MatKhau = MatKhau;
        this.Vaitro = Vaitro;
        this.Email = Email;
        this.DiaChi = DiaChi;
    }

    public User() {
    }

    
    
    public String getID() {
        return ID;
    }
    
    

    public void setID(String ID) throws Exception {
        if(ID.trim().isEmpty())
            throw new Exception("ID không được để trống");
        this.ID = ID;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) throws Exception {
        if(Ten.trim().isEmpty())
            throw new Exception("Họ tên không được để trống");
        this.Ten = Ten;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) throws Exception {
        if(MatKhau.trim().isEmpty())
            throw new Exception("Mật khẩu không được để trống");
        this.MatKhau = MatKhau;
    }

    public String getVaitro() {
        return Vaitro;
    }

    public void setVaitro(String Vaitro) {
        this.Vaitro = Vaitro;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) throws Exception {
        if(Email.trim().isEmpty())
            throw new Exception("Email không được để trống");
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) throws Exception {
        if(DiaChi.trim().isEmpty())
            throw new Exception("Địa chỉ không được để trống");
        this.DiaChi = DiaChi;
    }

    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", Ten=" + Ten + ", MatKhau=" + MatKhau + ", Vaitro=" + Vaitro + ", Email=" + Email + ", DiaChi=" + DiaChi + '}';
    }
    
    
}
