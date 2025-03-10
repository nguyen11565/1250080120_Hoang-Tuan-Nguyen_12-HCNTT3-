/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
public class demo1 {
    public static void main (String[] args){
    Hocsinh hocsinh1 = new Hocsinh(002,"Nguyen Ba",4f);
    hocsinh1.nhapHocsinh();
    hocsinh1.xuatHocsinh();
    Hocsinh hocsinh2 =new Hocsinh(001,"Hoang Tuan Nguyen",8f);
    hocsinh2.xuatHocsinh();
    Hocsinh hocsinh3 = new Hocsinh(hocsinh2);
    hocsinh3.xuatHocsinh();
    hocsinh3.sethoten("Nguyen Thanh Truc");
    hocsinh3.xuatHocsinh();
    double max = hocsinh1.getdiemTB();
    String hoten = hocsinh1.gethoten();
    if (max <hocsinh2.getdiemTB()){
        max = hocsinh2.getdiemTB();
        hoten = hocsinh2.gethoten();
    }
    if (max <hocsinh3.getdiemTB()){
        max = hocsinh3.getdiemTB();
        hoten =hocsinh3.gethoten();
    }
    System.out.println("Hoc sinh"+hoten+"co diem trung binh cao nhat:"+max);
    }
}
