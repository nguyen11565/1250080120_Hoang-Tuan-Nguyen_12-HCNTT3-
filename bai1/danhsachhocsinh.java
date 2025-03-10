/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.util.Scanner;
public class danhsachhocsinh {
    private Hocsinh danhsach[];
    private int soluong;
    public void nhapdanhsach(){
     System.out.println("nhap danh sach hoc sinh");
          for (int i = 0; i < soluong; i++) {
              danhsach[i].nhapHocsinh();
}
    public void indanhsach(){
        System.out.println("in danh sach hoc sinh:");
        for (int i=0;i< soluong;i++ ){
            danhsach[i].xuatHocsinh();
        }
        public void sapxepgiandoan(){
            for (int i=0; i < soluong - 1;i++){
            for  (int j=i+1;j<soluong;j++){
                if (danhsach[i].getdiemTB() < danhsach[j].getdiemTB()){
                Hocsinh hs =danhsach[i];
                danhsach[i]=danhsach[j];
                danhsach[j]=hs;
                }
            } 
            }
        }
}
 
