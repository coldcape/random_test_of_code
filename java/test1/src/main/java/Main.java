import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        leapYearLogic lyl = new leapYearLogic();

        Scanner yearIn = new Scanner(System.in);
        System.out.println("Skriv et årstall");

        int year = yearIn.nextInt();

        if (lyl.isLeapYear(year)) {
            System.out.println("Året: " + year + " er et skuddår");
        }
        else {
            System.out.println("Året: " + year + " er ikke et skuddår");
        }
    }
}