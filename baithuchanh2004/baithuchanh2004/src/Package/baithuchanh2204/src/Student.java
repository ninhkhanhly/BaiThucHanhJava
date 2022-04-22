import java.util.Scanner;
public class Student extends Person{
    private float toan , ly , hoa , tb;
    public void nhap(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("nhap diem mon toan: ");
            toan=sc.nextFloat();
            System.out.print("nhap diem mon ly: ");
            ly=sc.nextFloat();
            System.out.print("nhap diem mon hoa: ");
            hoa=sc.nextFloat();
        }
        tb=(toan+ly+hoa)/3;
    }
    public void in(){
        System.out.print("diem mon toan: "+toan);
        System.out.print("diem mon ly: "+ly);
        System.out.print("diem mon hoa: "+hoa);
        System.out.print("diem trung binh: "+tb);
    }
}
