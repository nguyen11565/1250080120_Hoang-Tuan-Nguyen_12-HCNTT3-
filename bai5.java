/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.util.Scanner;
 class Tamgiac{
    private double a;
    private double b;
    private double c;
    public Tamgiac(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    private boolean kiemtra(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
      public double tinhChuvi() {
        return a + b + c;
    }
       public double tinhheron() {
        double p = tinhChuvi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
 public String loaitamgiac() {
        if (a == b && b == c) {
            return "tam giac deu";
        } else if (a == b || a == c || b == c) {
            return "Tam giac can";
        }
        else if (a * a + b * b == c * c ||a * a + c * c == b * b || b * b + c * c == a * a) {
            return "Tam giac vuong";
        }
        else {
            return "Tam giac thuong";
        }
    }

    public void Hienthi() {
        System.out.println("Chu vi: " + tinhChuvi());
        System.out.println("heron : " + tinhheron());
        System.out.println("Loại: " + loaitamgiac());
    }
}

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Tamgiac tamgiac1 = new Tamgiac(4, 4, 5);
        System.out.println("Tam giac 1: ");
        System.out.println("Chu vi: " + tamgiac1.tinhChuvi());
        System.out.println("heron: " + tamgiac1.tinhheron());
        System.out.println("Loai: " + tamgiac1.loaitamgiac());

        Tamgiac tamgiac2 = new Tamgiac(6, 6, 6);
        System.out.println("Tam giac 2: ");
        System.out.println("Chu vi: " + tamgiac2.tinhChuvi());
        System.out.println("heron: " + tamgiac2.tinhheron());
        System.out.println("Loại: " + tamgiac2.loaitamgiac());
        
          Tamgiac tamgiac3 = new Tamgiac(7, 6, 5);
        System.out.println("Tam giac 3: ");
        System.out.println("Chu vi: " + tamgiac3.tinhChuvi());
        System.out.println("heron: " + tamgiac3.tinhheron());
        System.out.println("Loại: " + tamgiac3.loaitamgiac());
    }
}

