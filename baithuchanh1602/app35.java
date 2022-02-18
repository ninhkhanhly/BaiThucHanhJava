import java, util, scanner;
package cau_truc_ifelse;
import java.util.Scanner;
public class TimSoNhoNhat {
    public static void main (String[] args) {
        int firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        firstNumber = scanner.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        secondNumber = scanner.nextInt();
        int minNumber = firstNumber;
        if (firstNumber > secondNumber)
           minNumber = secondNumber;
        System.out.println("So nho nhat trong hai so" + firstNumber + " va " + secondNumber + " la " + minNumber);
    }
}