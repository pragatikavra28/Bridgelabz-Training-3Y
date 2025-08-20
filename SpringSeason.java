import java.util.Scanner;


public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        boolean spring = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);

        if (spring) System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
    }
}
