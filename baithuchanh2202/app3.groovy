import java.util.Scanner;
public class App3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap so nguyen= ");
            int n = sc.nextInt();

            int check = isprime(n);

            if (check == 1)
                System.out.println((int) n + " la so nguyen to");
            else
                System.out.println(n + " khong phai la so nguyen to");
        }
    }

    private static int isprime(int n) {
        // flag = 0 => không phải số nguyên tố
        // flag = 1 => số nguyên tố

        int flag = 1;

        if (n < 2)
            return flag = 0; /* Số nhỏ hơn 2 không phải số nguyên tố => trả về 0 */

        /* Sử dụng vòng lặp while để kiểm tra có tồn tại ước số nào khác không */
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                flag = 0;
                break; /* Chỉ cần tìm thấy 1 ước số là đủ và thoát vòng lặp */
            }
            i++;
        }

        return flag;
    }
}