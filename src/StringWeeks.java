import java.util.Scanner;

public class StringWeeks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, enter: 1... to 7");
        int scan = scanner.nextInt();
        System.out.println(weekMethod(scan));

    }

    static String weekMethod(int day) {

        /*switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "STOP!!!";
        }*/  //TODO switch case. 

        if (day == 1) {
            return "Monday";
        } else if (day == 2) {
            return "Tuesday";
        } else if (day == 3) {
            return "Wednesday";
        } else if (day == 4) {
            return "Thursday";
        } else if (day == 5) {
            return "Friday";
        } else if (day == 6) {
            return "Saturday";
        } else if (day == 7) {
            return "Sunday";
        } else {
            return "STOP!!!";
        }
    }


}
