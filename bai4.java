/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.util.Scanner;
class Nhanvien{
    private String maSo;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;
    private double soLuong;
    public Nhanvien() {
        this.maSo = "";
        this.hoTen = "";
        this.luongCoBan = 0.0;
        this.heSoLuong = 0.0;
        this.soLuong = 0.0;
    }
  public Nhanvien(String maSo, String hoTen, double luongCoBan, double heSoLuong) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }
  public Nhanvien(Nhanvien nv) {
        this.maSo = nv.maSo;
        this.hoTen = nv.hoTen;
        this.luongCoBan = nv.luongCoBan;
        this.heSoLuong = nv.heSoLuong;
        this.soLuong = nv.soLuong;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        this.maSo = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhap luong co ban: ");
        this.luongCoBan = scanner.nextDouble();
        System.out.print("Nhập he so luong: ");
        this.heSoLuong = scanner.nextDouble();
    }
       public void xuat() {
        System.out.println("ma so: " + maSo);
        System.out.println("ho ten: " + hoTen);
        System.out.println("luong co ban: " + luongCoBan);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Số lương: " + soLuong);
    }
 public void tinhLuong() {
        this.soLuong = this.luongCoBan * this.heSoLuong;
    }
public class bai1 {
    public static void main(String[] args) {
        Nhanvien nv1 = new Nhanvien();
        nv1.nhap();
 System.out.println("thong tin nv1:");
        nv1.xuat();
        Nhanvien nv2 = new Nhanvien("NV02", "Hoang Tuan Nguyen", 1000000, 4.5);
         System.out.println("thong tin nv2:");
        nv2.xuat();
        Nhanvien nv3 = new Nhanvien(nv2);
        nv3.setHoTen("Tran Le Quan");
        System.out.println("thong tin nv3:");
        nv3.xuat();
        Nhanvien maxNhanvien = nv1;
        if (nv2.getHeSoLuong() > maxNhanvien.getHeSoLuong()) maxNhanvien = nv2;
        if (nv3.getHeSoLuong() > maxNhanvien.getHeSoLuong()) maxNhanvien = nv3;
        
        System.out.println("nhan vien co luong cao nhat:");
        maxNhanvien.xuat();
}
}
}
