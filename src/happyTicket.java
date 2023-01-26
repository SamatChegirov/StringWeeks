import java.util.Scanner;

public class happyTicket {

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pleas, enter ticket number:");
            int san = scanner.nextInt();
            int a = san / 100000;
            int b = san % 100000 / 10000;
            int c = san % 10000 / 1000;
            int d = san % 1000 / 100;
            int e = san % 100 / 10;
            int f = san % 10;
            System.out.println(a + "." + b + "." + c + "  " + d + "." + e + "." + f);

            int g = a + b + c;
            System.out.println(g);
            int h = d + e + f;
            System.out.println(h);

            if (g % 2 == 0 && h % 2 == 0) {
                System.out.println("Jup sandar chykty!");
            } else if (g % 2 == 1 && h % 2 == 1) {
                System.out.println("Tak sandar chykty!");
            } else {
                System.out.println("Biri tak san chygyp kaldy!");
            }
            if (g % 2 == 0 && h % 2 == 0) {
                System.out.println("///Baktyluu bilet!///");
            }
            if (h % 2 == 1) {
                System.out.println("///Dagy bir jolu oinop korynyz!///");
            }else if (g % 2 == 1) {
                System.out.println("///Dagy bir jolu oinop korynyz!///");
            }

        }
    }
}
