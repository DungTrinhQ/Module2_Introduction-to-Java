import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rate: ");
        int rate = sc.nextInt();
        System.out.println("Enter the money: ");
        int USD = sc.nextInt();
        int VND;
        VND = USD * rate;
        System.out.println(VND+" VND");
    }
}
