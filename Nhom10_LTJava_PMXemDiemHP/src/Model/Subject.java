/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 84362
 */
public class Subject {
    private String ID;
    private String Ten;
    private int STC;
    private float DTX1;
    private float DTX2;
    private float DiemThi;
    private int STN;
    private String ID_User;

    public Subject(String ID, String Ten, int STC, float DTX1, float DTX2, float DiemThi,int STN, String ID_User) {
        this.ID = ID;
        this.Ten = Ten;
        this.STC = STC;
        this.DTX1 = DTX1;
        this.DTX2 = DTX2;
        this.DiemThi = DiemThi;
        this.STN = STN;
        this.ID_User = ID_User;
    }

    public Subject() {
    }

    public String getID() {
        if(ID.isEmpty()){
            int id = 1000 + (int)(Math.random()*9999);
            return "IT"+Integer.toString(id);
        }
        return ID;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getSTC() {
        return STC;
    }

    public void setSTC(int STC) {
        this.STC = STC;
    }

    public float getDTX1() {
        return DTX1;
    }

    public void setDTX1(float DTX1) throws Exception {
        if(DTX1<0)
            throw new Exception("Điểm phải lớn hơn 0");
        this.DTX1 = DTX1;
    }

    public float getDTX2() {
        return DTX2;
    }

    public void setDTX2(float DTX2) throws Exception {
        if(DTX2<0)
            throw new Exception("Điểm phải lớn hơn 0");
        this.DTX2 = DTX2;
    }

    public float getDiemThi() {
        if(STN <= 45*0.3f)
            return DiemThi;
        return 0;
    }

    public void setDiemThi(float DiemThi) throws Exception {
        if(DiemThi<0)
            throw new Exception("Điểm phải lớn hơn 0");
        this.DiemThi = DiemThi;
    }

    public int getSTN() {
        return STN;
    }

    public void setSTN(int STN) {
        this.STN = STN;
    }
    
    public String getID_User() {
        return ID_User;
    }

    public void setID_User(String ID_User) {
        this.ID_User = ID_User;
    }
    
    public float getDiem4() {
        switch (getDiemChu()) {
            case "F":
                return 0;
            case "D":
                return 1;
            case "D+":
                return 1.5f;
            case "C":
                return 2;
            case "C+":
                return 2.5f;
            case "B":
                return 3;
            case "B+":
                return 3.5f;
            case "A":
                return 4;
            default:
                return 0;
        }
        
    }
    
    public float getTBTX(){
        return (DTX1 + DTX2)/2;
    }

    public float getDiem10() {
        if(STN <= 45*0.3f)
            return (getTBTX() + getDiemThi())/2;
        return 0;
    }

    public String getDiemChu() {
        if(STN > 45*0.3f)
            return "F";
        if(getDiem10()<4)
            return "F";
        else if(getDiem10()<4.7f)
            return "D";
        else if(getDiem10()<5.5f)
            return "D+";
        else if(getDiem10()<6.2f)
            return "C";
        else if(getDiem10()<7)
            return "C+";
        else if(getDiem10()<7.7f)
            return "B";
        else if(getDiem10()<8.5f)
            return "B+";
        else if(getDiem10()<=10)
            return "A";
        else
            return "";
    }

    public String getXepLoai(){
        switch (getDiemChu()) {
            case "F":
                return "Kém";
            case "D":
                return "Trung bình yếu";
            case "D+":
                return "Trung bình yếu";
            case "C":
                return "Trung bình";
            case "C+":
                return "Trung bình";
            case "B":
                return "Khá";
            case "B+":
                return "Khá";
            case "A":
                return "Giỏi";
            default:
                return "";
        }
    }
    
    public String getDKDT(){
        if(STN <= 45*0.3f){
            return "Đủ điều kiện";
        }else{
            return "Học lại";
        }
    }

    @Override
    public String toString() {
        return "Subject{" + "ID=" + getID() + ", Ten=" + Ten + ", STC=" + STC + ", DTX1=" + DTX1 + ", DTX2=" + DTX2 + ", DiemThi=" + DiemThi + ", STN=" + STN + ", ID_User=" + ID_User + '}';
    }
    
    
}
