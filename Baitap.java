
package Bai.tap.lop;

import java.util.Scanner;

public class Baitap {
    public static void main(String [] args){
        VietNam Vn = new VietNam();
        Vn.nhap();
        Vn.xuat();
        Vn.nhapqtV();
        Anh anh = new Anh();
        anh.nhap();
        anh.xuat();
        anh.nhapqtA();
        Phap phap = new Phap();
        phap.nhap();
        phap.xuat();
        phap.nhapqtP();
    }
}
class Goc{
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
        System.out.println("\n Nhap ho ten: ");
        ten = sc.nextLine();
        System.out.println("\n Nhap tuoi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("\n Nhap quoc gia: ");
        quocgia = sc.nextLine();
    }
    public void xuat(){
        System.out.println("ban ten la: "+ten);
        System.out.println("ban sinhh nam : "+tuoi);
        System.out.println("ban co quoc gia: "+quocgia);
    }
}
class VietNam extends Goc{
    public void nhapqtV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Xin chao! ");
    }
}
class Anh extends Goc{
    public void nhapqtA(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Hello! ");
    }
}
class Phap extends Goc{
    public void nhapqtP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Bonjour! ");
    }
}
