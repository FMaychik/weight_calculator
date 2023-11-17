import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        System.out.println("Hello! Enter your height: ");
        Scanner in = new Scanner(System.in);

        double sm = in.nextDouble();

        double a = sm - 110;
        double ves = a * 1.15;

        System.out.println("Your weight is " + ves);
    }
}