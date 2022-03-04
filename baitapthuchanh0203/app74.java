import java.util.Scanner;
public class App74 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
          do {
           System.out.println("Nhap so phan tu cua mang: ");
           n = sc.nextInt();
          } while (n < 0);
        int A[] = new int[n];      
        System.out.println("Nhap cac phan tu: ");
        for (int i = 0; i < n; i++) {
        System.out.print("Nhap phan tu thu "+i + ": ");
        A[i] = sc.nextInt();
    }
    double Tong =0;
    for (int i = 0; i < n; i++) {
        if (A[i] % 2 == 0) {
            Tong+=A[i];
        }
    }
    System.out.println("Tong: " + Tong);
    sc.close();
    }
}