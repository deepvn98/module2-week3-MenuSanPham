import java.util.Comparator;
import java.util.Scanner;

public class SanPham{
    private String id;
    private String name;
    private double price;

    public SanPham() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID sản phẩm: ");
        id = scanner.nextLine();
        System.out.print("Tên sản phẩm: ");
        name = scanner.nextLine();
        System.out.print("Giá: ");
        price = Double.parseDouble(scanner.nextLine());
    }
    public void hienThi(){
        System.out.printf("\n\t\t%-20s %-20s %-10.3f", id, name, price);
    }

//    @Override
//    public int compare(SanPham o1, SanPham o2) {
//        return (int) (o1.getPrice()-o2.getPrice());
//    }
}
