import java.util.Scanner;
public class App9 {
    public static void main(String[] args) {
        // sử dụng class Scanner để lấy dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        // khai báo biến num1 là số cần đảo ngược, reversed là số sau khi đảo ngược
        int num1, num2, reversed = 0;
        System.out.println("\n\nNhập vào số cần đảo ngược: ");
        num1 = sc.nextInt();
        // gán num1 cho num2 để hiển thị ra màn hình
        num2 = num1;
        // sử dụng vòng lặp while để đảo ngược num1
        while (num1 != 0) {
            int digit = num1 % 10;
            reversed = reversed * 10 + digit;
            num1 /= 10;
        }
        // hiển thị số sau khi đảo ngược ra màn hình
        System.out.printf("Số %d sau khi đảo ngược là: %d", num2, reversed);

        System.out.println("\n------------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}