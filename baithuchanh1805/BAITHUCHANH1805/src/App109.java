import java.util.ArrayList;

import java.util.Comparator;

import java.util.Scanner;
public class App109 {
    public static void main(String[] args) throws Exception {
        // khai bao 1 arraylist co ten Manh
        ArrayList<Integer> Manh = new ArrayList<>();
        
        //Them cac so nguyen vo mang Manh
        Manh.add(5);
        Manh.add(2);
        Manh.add(8);
        Manh.add(12);
        Manh.add(15);
        Manh.add(10);
        Manh.add(7);
        System.out.println("Cac phan tu trong mang : " +Manh);
        
        //gia tri max trong day
        int max = Manh.get(0) ;
        for(int i = 1 ; i < Manh.size() ; i++)
        {
            if(Manh.get(i).compareTo(max)>0)
            {
                max = Manh.get(i);
            }
        }
        System.out.println("Gia tri lon nhat trong day Manh la : " +max);
        
        //Nhap vao 1 so nguyen , trung xoa 
        int number;
        try (Scanner m = new Scanner(System.in)) {
            System.out.print("Nhap vao 1 so nguyen : ");
            number = m.nextInt();
        }
        Manh.add(number);
       
        
        //sap xep danh sach tang dan va in
        Manh.sort(Comparator.comparingInt(o -> o));
        System.out.println("Cac phan tu co trong Manh da sap xep la : " +Manh);
    }
}