
import java.util.ArrayList;
import java.util.Scanner;

public class HITSHOP {
    static ArrayList<String> names = new ArrayList<>(); // taoj 1 arrL giống như tạo cgii mảng ế
    static ArrayList<Double> prices = new ArrayList<>();
    static ArrayList<Integer> quantities = new ArrayList<>();
    static Scanner sc = new Scanner(System.in); //Scanner

    static double total1(double price, int quantity) {
        return price * quantity;
    }

    static boolean addItem(String name, double price, int quantity) {
        if (name == null || name.trim().isEmpty()) return false; // iE là nếu rỗng = T
        if (price <= 0 || quantity <= 0) return false;
        names.add(name.trim());
        prices.add(price);
        quantities.add(quantity);
        return true;
    }
    static void handAdd(){

        System.out.print("Nhập tên hàng : "); // Sout
        String name = sc.nextLine().trim();
        while (name.isEmpty()) {
            System.out.print("Nhập tên hàng (không được bỏ trống) : "); // Sout
            name = sc.nextLine().trim();
        }
        System.out.print("Nhập đơn giá : ");
        double price = sc.nextDouble();
        while (price <= 0) {
            System.out.print("Nhập lại đơn giá ( > 0 ) : ");
            price = sc.nextDouble();
        }
        System.out.print("Nhập số lượng : ");
        int quantity = sc.nextInt();
        while (quantity <= 0) {
            System.out.print("Nhập lại số lượng ( > 0 ) : ");
            quantity = sc.nextInt();
        }
        addItem(name,price,quantity);
    }
    static double calculateTotal() {
        double total = 0;
        for (int i = 0; i < names.size(); i++) {
            total += total1(prices.get(i), quantities.get(i));
        }
        return total;
    }
    static String formatMoney(double value) {
        if (value == Math.rint(value)) return String.valueOf((long) value); // ddoanj nì AI, chưa hỉu
        return String.valueOf(value);
    }
    static void printItems() {
        if (names.isEmpty()) {
            System.out.println("Giỏ hàng trống.");
            return;
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". " + names.get(i) + " / "
                    + formatMoney(prices.get(i)) + " / " + quantities.get(i));
        }
    }

    static boolean removeItem(int index) {
        if (index < 0 || index > names.size()) return false;
        names.remove(index);
        prices.remove(index);
        quantities.remove(index);
        System.out.print("Số thứ tự cần xóa: ");

        return true;
    }
    static void handRemove(){
        int number = Integer.parseInt(sc.nextLine().trim());
        if (removeItem(number - 1)) {
            System.out.println("Đã xóa mặt hàng.");
        } else {
            System.out.println("Không tìm thấy mặt hàng.");
        }
    }

    public static void main(String[] args) {
        System.out.println("---------Chao Mung Den Voi HITTTTTTS HOPPP---------");
        while (true) {
            System.out.println("");
            System.out.println("1. Thêm mặt hàng");
            System.out.println("2. Xóa mặt hàng");
            System.out.println("3. Xem giỏ");
            System.out.println("4. Xem tổng tiền");
            System.out.println("0. Kết thúc");
            System.out.print("Chọn: ");
            if (!sc.hasNextLine()) break;
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1" -> handAdd();
                case "2" -> handRemove();
                case "3" -> printItems();
                case "4" -> System.out.println("Tổng tiền: " + formatMoney(calculateTotal()));
                case "0" -> {
                    System.out.println("Tam Biet Nhe Ng e.");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}