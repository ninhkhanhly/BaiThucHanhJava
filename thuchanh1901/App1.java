/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh1901;
import java.util.Scanner;
/**
 *
 * @author FPTSHOP
 */
public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,x1,x2,delta;
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        System.out.println("Nhap c: ");
        c = sc.nextDouble();
        System.out.printf("Phuong trinh ban vua nhap co dang: %.1fa^2 + %.1fb + c = 0 \n", a, b, c);
        delta = Math.pow(b,2) - (4 * a * c);
        if(delta < 0 ) {
            System.out.println("phuong trinh vo nghiem!");
        } else if(delta==0){
            x1=-b/(2*a);
            System.out.println("phuong trinh co mot nghiem la x1 = x2 = "+x1);
        }else {
            x1=(-b+Math.sqrt(delta))/(2*a);
            x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("phuong trinh co hai nghiem x1= "+x1+" va x2 = " +x2);
        }
    }
}
