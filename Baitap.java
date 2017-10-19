
package Bai.tap.lop;

import java.util.Scanner;

public class Baitap{
    public static void main(String [] args){
        VietNam Vn = new VietNam();
        Phap P = new Phap();
        Anh A = new Anh();
        Vn.xuatV();
        P.xuatP();
        A.xuatA();
    }
}
class Goc{
    private String ten;
    private int tuoi;
    public Goc(){
       ten= "Null";
       tuoi=0;
    }
    public Goc(String TEN, int TUOI){
        ten = TEN;
        tuoi = TUOI;
}
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public int GetTuoi(){
        return tuoi;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
}
class VietNam extends Goc{
    public void xuatV(){
        VietNam vn = new VietNam();
        vn.setTen("Lam");
        vn.setTuoi(20);
        System.out.println("xin chao"+vn.getTen()+",Ban "+vn.GetTuoi()+"tuoi");        
    }
}
class Phap extends Goc{
    public void xuatP(){
        Phap p = new Phap();
        p.setTen("David");
        p.setTuoi(15);
        System.out.println("xin chao"+p.getTen()+",Ban "+p.GetTuoi()+"tuoi");        
    }
}
class Anh extends Goc{
    public void xuatA(){
        Anh a = new Anh();
        a.setTen("Lam");
        a.setTuoi(20);
        System.out.println("xin chao"+a.getTen()+",Ban "+a.GetTuoi()+"tuoi");        
    }
}
