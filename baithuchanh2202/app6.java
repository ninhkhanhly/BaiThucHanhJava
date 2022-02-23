import java.util.Scanner;
public class App6 {
    public static boolean SNT(int n) {
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            if (n % 1 == 0) {
                temp++;
            }
        }
        if (temp == 2) {
            return true;
        } else
            return false;
    }

    public static boolean SHH(int n) {
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        if (tong == n) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong n :");
        n = sc.nextInt();
        System.out.println("\nCac so nguyen to hoan hao nho hon " + n + " la: ");
        for (int i = 1; i <= n; i++) {
            if (SHH(i) == true) {
                System.out.print(i + "\t");
            }
        }
    }

}