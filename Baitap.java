
package Bai.tap.lop;

import java.util.Scanner;

public class Baitap{
    public static void main(String [] args){
        VietNam Vn = new VietNam();
        Phap P = new Phap();
        Anh A = new Anh();
        Vn.chao();
        P.chao();
        A.chao();
    }
}
interface Goc{
}
class VietNam implements Goc{
    private String ten;
    private int tuoi;
    public VietNam(){
        ten = "Lam";
        tuoi = 20;
    }
    public void chao(){
      System.out.println("\n Xin chao "+ten+", ban "+tuoi);
    }
}
class Phap implements Goc{
    private String teN;
    private int tuoI;
    public Phap(){
        teN = "Alex";
        tuoI = 25;
    }
    public void chao(){
        System.out.println("\n bonjour "+teN+", tu a "+tuoI+" ans ");
    }
}
class Anh implements Goc{
    private String Ten;
    private int Tuoi;
    public Anh(){
        Ten = "David";
        Tuoi = 15;
    }
    public void chao(){
        System.out.println("\n Hello "+Ten+", you are "+Tuoi+" year olds ");
    }
}

