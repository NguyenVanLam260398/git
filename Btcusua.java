
package Bai.tap.lop;

import java.util.Scanner;

public class Baitap {
    public static void main(String [] args){
        Goc goc = new Goc();
        VietNam VN = new VietNam();
        Anh anh = new Anh();
        Phap phap = new Phap();
        goc.nhap();
        goc.xuat();
        if(goc.getQuocgia()=="VietNam"){
            VN.nhapqtV();
        }
        if(goc.getQuocgia()=="Anh"){
            anh.nhapqtA();
        }
        if(goc.getQuocgia()=="Phap"){
            phap.nhapqtP();
        }
        else{
            System.out.println("Nhap lai");
        }
    }
}   class Goc{
    private String ten;
    private int tuoi;
    private String quocgia;
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public int getTuoi(){
        return tuoi;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public String getQuocgia(){
        return quocgia;
    }
    public void setQuocgia(String quocgia){
        this.quocgia= quocgia;
    }
    public Goc(){
    ten = "null";
    tuoi = 0;
    quocgia = "Null";
    }
    public Goc(String TEN, int TUOI, String QUOCGIA){
        ten = TEN;
        tuoi = TUOI;
        quocgia = QUOCGIA;
    }
    public void nhap(){
        Scanner sc = new Scanner (System.in);
        System.out.println("\nTen ban la? ");
        ten = sc.nextLine();
        System.out.println("\nBan bao nhieu tuoi ? ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("\nQuoc tich cua ban la? ");
        quocgia = sc.nextLine();
        }
    public void xuat(){
        System.out.println("\n Ban ten la: "+ten);
        System.out.println("\n Ban sinhh nam : "+tuoi);
        System.out.println("\n Ban co quoc gia: "+quocgia);
    }
}
class VietNam extends Goc{
    VietNam vn = new VietNam();
    public void nhapqtV(){
       vn.setQuocgia("Xin chao!");
       System.out.println(vn.getQuocgia());
    }
}
class Anh extends Goc{
    Anh a = new Anh();
    public void nhapqtA(){
        a.setQuocgia("Hello");
        System.out.println(a.getQuocgia());
    }
}
class Phap extends Goc{
    Phap p = new Phap();
    public void nhapqtP(){
        p.setQuocgia("Bojour");
        System.out.println(p.getQuocgia());
    }
}
