/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.util.Scanner;
 class Toado {
     private float x;
       private float y;   
       public Toado(){
       this.x=0.0f;
       this.y=0.0f;
       }
public Toado(float x,float y){
this.x=x;
this.y=y;
}
public void nhapToado(){
Scanner scanner =new Scanner(System.in);
 System.out.println("nhap toa do x");
  this.x=scanner.nextFloat();
  System.out.println("nhap toa do y");
  this.y=scanner.nextFloat();
}
 public double getX() {
        return x;
    }

    public void setX(double x) {
      
    }
public double getY() {
        return y;
    }

    public void setY(double y) {
    }
  public Toado tong(Toado diemkhac){
       return new Toado(this.x + diemkhac.x, this.y + diemkhac.y);
  }
   public Toado doixungTruchoanh() {
        return new Toado(this.x, -this.y);
    }
     public void inToado() {
        System.out.println("(" + x + ", " + y + ")");
}
}
public class bai3{
 public static void main(String[] args) {

      Toado diem1 = new Toado();
     System.out.println("nhap toa do diem 1");
      diem1.nhapToado();
        
      Toado diem2 = new Toado();
      System.out.println("nhap toa do diem 2");
      diem2.nhapToado();
        
      System.out.println(" toa do diem 1");
      diem1.inToado();
        
System.out.println(" toa do diem 2");
        diem2.inToado();
        Toado diem3=diem1.tong(diem2);
        System.out.println("Tong diem1+diem2");
        diem3.inToado();
        
   Toado diem4=diem1.doixungTruchoanh();
   System.out.println("doi xung diem qua truc hoanh");
   diem4.inToado();
}
}
      
      