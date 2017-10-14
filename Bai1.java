
package lam.bai.tap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String [] args){
        Tinh PT = new Tinh();
        PT.nhap();
        PT.tinh();
    }
}
class Tinh{
    float a,b;
    float Tong,Tich,Thuong,Hieu;
    String pt;
    public Tinh(){
        a=0;
        b=0;
        pt="Null";
    }
    public Tinh(float A, float B, String PT){
        a=A;
        b=B;
        pt=PT;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n nhap a: ");
        a=sc.nextFloat();
        System.out.println("\n nhap b: ");
        b=sc.nextFloat();
        sc.nextLine();
        System.out.println("chon phep tinh: ");
        pt=sc.nextLine();
    }
    public float tinh(){
        switch(pt){
            case "Tong":
                System.out.println("tong bang: "+(a+b));
                break;
            case "Tich":
                System.out.println("tich bang: "+(a*b));
                break;
            case "Hieu":
                System.out.println("Hieu bang: "+(a-b));
                break;
            case "Thuong":
                System.out.println("Thuong bang: "+(a/b));
                break;
        }
        return 0;
    
    }
}

