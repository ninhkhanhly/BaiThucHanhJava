import java, util, scanner;
public class App47 {
    public static void main(String[] args) throws Exception {
        int number, sum = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap so nguyen: ");
            munber = sc.nextInt();
            sum += number;
        } while (sum < 100);
        System.out.println("Tong cac so nguyen vua nhap = " + sum);
    }
}