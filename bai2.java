/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.util.Scanner;
 class Phanso {
     private int tu;
     private int mau;
     public Phanso(){
         this.tu=0;
         this.mau=1;
     }
     public Phanso(int tu,int mau){
         this.tu=tu;
         this.mau=mau;
     }
     public Phanso(int tu,int mau){
         int(mau==0){
         System.out.println("mau so > 0.Dat mac dinh 1");
         this.mau=1;
     }
      public Phanso(Phanso p){
          this.tu=p.tu;
          this.mau=p.mau;
      }
      public void nhapPhanso(){
          Scanner scanner=new Scanner(System.in);  
         System.out.println("nhap tu so");
         tu=scanner.nextInt();
         do{
             System.out.println("nhap vao mau");
             mau=scanner.nextInt();
         }
         public void xuat() {
        System.out.println(tu  + mau);
    }
private int USCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return USCLN(b, a % b);
    }
public void rutgon() {
        int uscln = USCLN(tu, mau);
        tu /= uscln;
        mau /= uscln;
    }

public phanso cong(phanso p) {
        int tusomoi = this.tu * p.mau + p.tu * this.mau;
        int mausomoi = this.mau * p.mau;
        phanso kq = new phanso(tusomoi, mausomoi);
        kq.rutgon();
        return kq;
    }

    public phanso tru(phanso p) {
        int tusomoi = this.tu * p.mau - p.tu * this.mau;
        int mausomoi = this.mau * p.mau;
        phanso kq = new phanso(tusomoi, mausomoi);
        kq.rutgon();
        return kq;
    }

   public phanso nhan(phanso p) {
        int tusomoi = this.tu * p.tu;
        int mausomoi = this.mau * p.mau;
        phanso kq = new phanso(tusomoi, mausomoi);
        kq.rutgon();
        return kq;
    }
    public phanso chia(phanso p) {
        int tusomoi = this.tu * p.mau;
        int mausomoi = this.mau * p.tu;
        phanso kq = new phanso(tusomoi, mausomoi);
        kq.rutgon();
        return kq;
    }
}
public class bai2 {
    public static void main(String[] args) {
        phanso p1 = new phanso();
        System.out.print("phan so p1 mac dinh: ");
        p1.xuat();
        p1.nhap();
        System.out.print("Phan so p1 sau khi nhap: ");
        p1.xuat();
        phanso p2 = new phanso(4, 16);
        System.out.print("phan so p2: ");
        p2.xuat();
        phanso p3 = new phanso();
        p3.nhap();
        System.out.print("phan so p3: ");
        p3.xuat();
        phanso tong = p1.cong(p3);
        System.out.print(" p1 + p3: ");
        tong.xuat();
        phanso p4 = new phanso(tong);
        System.out.print("phan so p4 sao chep tong: ");
        p4.xuat();
        phanso tich = p4.nhan(p2);
        System.out.print(" p4 * p2: ");
        tich.xuat();
    }
}
}

