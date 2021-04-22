import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static ArrayList<SanPham> sanPhams = new ArrayList<>();
    public static void main(String[] args) {
        menu();

    }
    public static void menu(){
        int n = 0; //Số lượng sản phẩm
        int choice;
        int [] arr;
        System.out.println("1: Nhập vào sản phẩm.");
        System.out.println("2: Hiển thị sản phẩm theo giá tăng dần.");
        System.out.println("3: Tìm và xoá sản phẩm theo tên.");
        System.out.println("4: Tìm và hiển thị sản phẩm theo tên.");
        System.out.println("5: sửa thông tin sản phẩm.");
        System.out.println("6: Hiển thị giá trị trung bình của sản phẩm.");
        System.out.println("7: Thoát chương trình.");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                {
                    System.out.print("Nhập vào số lượng sản phẩm: ");
                    n = Integer.parseInt(scanner.nextLine());
                    arr = new int[n];
                    for (int i = 0; i < arr.length; i++){
                        System.out.println("Sản phẩm: "+(i+1));
                        SanPham sanPham = new SanPham();
                        sanPham.nhapThongTin();
                        sanPhams.add(sanPham);
                    }
                    break;
                }
                case 2:
                {
                   Collections.sort(sanPhams, new Comparator<SanPham>() {
                       @Override
                       public int compare(SanPham o1, SanPham o2) {
                           if (o1.getPrice()>o2.getPrice()){
                               return 1;
                           }else
                               if (o1.getPrice()==o2.getPrice()){
                                   return 0;
                               }else{
                                   return -1;
                               }
                       }
                   });
                    System.out.println("\t\t-----DANH SACH SAN PHAM ------");
                    System.out.printf("\n\t\t%-20s %-20s %-20s","ID", "Name","Price");
                   for (int i = 0; i< sanPhams.size(); i++){
                       sanPhams.get(i).hienThi();

                   }
                    System.out.println();
                    break;
                }
                case 3:
                {
                    break;
                }
                case 4:
                {
                    break;
                }
                case 5:
                {
                    break;
                }
                case 6:
                {
                    break;
                }
                case 7:
                {
                    break;
                }
            }
        }while (choice!=7);
    }

}
