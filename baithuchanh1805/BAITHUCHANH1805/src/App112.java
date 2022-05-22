import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class App112 {
    public static void main(String[] args) {
        String name;
        int n;
        HashSet<String> manh = new HashSet<>();
        try (Scanner m = new Scanner(System.in)) {
            //nhap ten trai cay
            System.out.print("Nhap vao so trai cay max trong manh : ");
            n = Integer.parseInt(m.nextLine());
            
            System.out.println("Nhap vao cac loai trai cay  ");
            for(int i = 1 ; i < n ; i++)
            {
                System.out.println("Nhap ten loai trai cay thu " + i + " la : ");
                name = m.nextLine();
                manh.add(name);
            }

            //hien thi so loai trai cay
            System.out.println("So loai trai cay trong manh la : ");
            System.out.println(manh.size());

            //Kiem tra ton tai 1 loai trai cay
            System.out.println("Nhap loai trai cay muon kiem tra : ");
            String nameSearch = m.nextLine();
            if(manh.contains(nameSearch))
            {
                System.out.println("Co trai cay " +nameSearch+ " trong manh !!!");
            }
            else
            {
                System.out.println("Khong tim thay " +nameSearch+ "trong manh !");
            }

            //Xoa 1 loai trai cay
            System.out.println("Nhap loai trai cay muon xoa : ");
            String nameDelete = m.nextLine();
            if(manh.contains(nameDelete))
            {
                manh.remove(nameDelete);
                System.out.println("Xoa thanh cong !!!");
                System.out.println("Cac loai trai cay con lai : " +manh);
            }
            else
            {
                System.out.println("Xoa khong thanh cong !");
            }
            
            //Tao 1 list moi cung kieu du lieu voi hashSet
            List<String> manhtran = new ArrayList<>();
            manhtran.add("Chuoi");
            manhtran.add("Cam");
            manhtran.add("Buoi");
            manhtran.add("Dao");
            manhtran.add("Sau Rieng");

            //them vao ds dau
            manh.addAll(manhtran);
            System.out.println("Cac loai trai cay sau khi them vao la : ");
            Iterator<String> manh66 = manh.iterator();
            while(manh66.hasNext())
            {
                System.out.println(manh66.next() + "\t");
            }

            //xoa cac phan tu cua list va hien thi lai hashSet
            manh.removeAll(manhtran);
            System.out.println("Cac loai trai cay trong manh sau khi xoa la : " +manh);
    }   
    }
}