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
         if (mau == 0){
         System.out.println("mau so > 0.Dat mac dinh 1");
         this.mau=1;
     }
     }
      public Phanso(Phanso p){
          this.tu=p.tu;
          this.mau=p.mau;
      }
      public void nhapPhanso(){
          Scanner scanner=new Scanner(System.in);  
         System.out.println("nhap tu so");
         this.tu=scanner.nextInt();
         do{
             System.out.println("nhap vao mau");
            this.mau=scanner.nextInt();
         }while  (this.mau==0);
         
         }
         public void xuatPhanso() {
        System.out.println(tu+"/" + mau);
    }
private int uocsochunglonnhat(int a, int b) {
        if (b == 0) {
            return a;
        }
        return uocsochunglonnhat(b, a % b);
    }
public void rutgon() {
        int uocsochunglonnhat = uocsochunglonnhat(tu, mau);
        tu /= uocsochunglonnhat;
        mau /= uocsochunglonnhat;
    }

public Phanso cong(Phanso p) {
        int tusomoi = this.tu * p.mau + p.tu * this.mau;
        int mausomoi = this.mau * p.mau;
        Phanso kq = new Phanso(tusomoi, mausomoi);
        kq.rutgon();
        return kq;
    }

    public Phanso tru(Phanso p) {
        int tusomoi = this.tu * p.mau - p.tu * this.mau;
        int mausomoi = this.mau * p.mau;
        Phanso kq = new Phanso(tusomoi, mausomoi);
        kq.rutgon();
        return kq;
    }

   public Phanso nhan(Phanso p) {
        int tusomoi = this.tu * p.tu;
        int mausomoi = this.mau * p.mau;
        Phanso kq = new Phanso(tusomoi, mausomoi);
        kq.rutgon();
        return kq;
    }
    public Phanso chia(Phanso p) {
        int tusomoi = this.tu * p.mau;
        int mausomoi = this.mau * p.tu;
        Phanso kq = new Phanso(tusomoi, mausomoi);
        kq.rutgon();
        return kq;
    }
}
public class bai2 {
    public static void main(String[] args) {
        Phanso p1 = new Phanso();
        System.out.print("phan so p1 luc dau: ");
        p1.xuatPhanso();
        p1.nhapPhanso();
        System.out.print("Phan so p1 sau khi nhap: ");
        p1.xuatPhanso();
        Phanso p2 = new Phanso(4, 16);
        System.out.print("phan so p2: ");
        p2.xuatPhanso();
        Phanso p3 = new Phanso();
        p3.nhapPhanso();
        System.out.print("phan so p3: ");
        p3.xuatPhanso();
        Phanso tong = p1.cong(p3);
        System.out.print(" p1 + p3: ");
        tong.xuatPhanso();
        Phanso p4 = new Phanso(tong);
        System.out.print("phan so p4 sao chep tong: ");
        p4.xuatPhanso();
        Phanso tich = p4.nhan(p2);
        System.out.print(" p4 * p2: ");
        tich.xuatPhanso();
    }
}


