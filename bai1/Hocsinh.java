/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.util.Scanner;
public class Hocsinh {
    private int maso;
    private String hoten;
    private double diemTB;
      public Hocsinh(int maso, String hoten, double diemTB) {
        this.maso = maso;
        this.hoten = hoten;
        this.diemTB = diemTB;
}
        public Hocsinh(Hocsinh hs){
this.maso=hs.maso;
this.hoten=hs.hoten;
this.diemTB=hs.diemTB;
}
    public int getmaso() {
        return maso ;  
    }
    public void setmaso(int maso){
        this.maso=maso;
    }
    public String gethoten(){
        return hoten;
    }
    public void sethoten(String hoten){
        this.hoten=hoten;
    }
    public double getdiemTB(){
        return diemTB;
    }
    public void setdiemTB(double diemTB){
        this.diemTB=diemTB;
    }
public void nhapHocsinh(){
     Scanner scanner = new Scanner(System.in);
    System.out.println("nhap ma so:");
    this.maso=scanner.nextInt();
        System.out.println("nhap ho ten:");
    this.hoten=scanner.nextLine();
        System.out.println("nhap diem TB:");
    this.diemTB=scanner.nextDouble();
}
    public void xuatHocsinh(){
        System.out.println(maso+"maso"+hoten+"hoten"+diemTB+"diemTB");
    }
    public void xephang(){
        if(diemTB>=8){
            System.out.println("xep loai gioi");
        }
        else if(diemTB<8 && diemTB>=7){
                System.out.println("xep loai kha");
        }
        else if(diemTB<7 && diemTB>=5){
             System.out.println("xep loai trung binh ");
        }
        else if(diemTB<5){
              System.out.println("xep loai yeu ");
       }           
    }
}