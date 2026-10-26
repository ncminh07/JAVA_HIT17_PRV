import java.sql.SQLOutput;
import java.util.Scanner;

public class HItSHop {
    public static void main(String[] args) {     // main
        Scanner sc = new Scanner(System.in); //Scanner

        System.out.println("------------Chào mừng bạn đến với HIT SHOP------------");

        System.out.print("Nhập tên hàng : "); // Sout
        String matHang = sc.nextLine().trim();
            while (matHang.isEmpty() ){
                System.out.print("Nhập tên hàng (không được bỏ trống) : "); // Sout
                 matHang = sc.nextLine().trim();
             }
        System.out.print("Nhập đơn giá : ");
        double donGia = sc.nextDouble();
            while(donGia <= 0 ){
                System.out.print("Nhập lại đơn giá ( > 0 ) : ");
                 donGia = sc.nextDouble();
            }
        System.out.print("Nhập số lượng : ");
        int soLuong = sc.nextInt();
             while(soLuong <= 0 ){
                 System.out.print("Nhập lại số lượng ( > 0 ) : ");
                 soLuong = sc.nextInt();
             }
        double thanhTien = (double) soLuong  * donGia;
        System.out.println("\nTên mặt hàng : " + matHang);
        System.out.println("Đơn giá : " + donGia);
        System.out.println("Số Lượng : " + soLuong);
        System.out.println("Thành tiền : " + thanhTien);


    }
}
