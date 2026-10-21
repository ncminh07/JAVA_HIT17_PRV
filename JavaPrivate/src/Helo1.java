
import java.util.Scanner;

public class Helo1 {
    public static void main(String[] args) {
        System.out.println("Helo");
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chieu dai vao day cho t : ");
        double chieuDai = sc.nextDouble();


        System.out.println("Nhap chieu rong vao day cho t : ");
        double chieuRong = sc.nextDouble();

        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chieu dai la : " + chieuDai);
        System.out.println("Chieu rong la : " + chieuRong);
        System.out.println("CHu vi la : " + chuVi);
        System.out.println("Ch la : " + dienTich);

        System.out.println();
    }
}
