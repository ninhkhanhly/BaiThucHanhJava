import java, util, scanner;
public class App30{
    private static Scanner scanner = new Scanner(System.in);
public static void main (String[] args) {
    int n, soDu, tong = 0;
    Scanner scanner = new Scanner (System.in);
    System.out.println("Nhap vao so nguyen duong n: ");
    n = scanner.nextInt();
    while (n > 0) {
        soDu = n % 10 ;
        n = n / 10 ;
        tong += soDu ;
    }
System.out.println("Tong cac chu so = " + tong);
 }
}  