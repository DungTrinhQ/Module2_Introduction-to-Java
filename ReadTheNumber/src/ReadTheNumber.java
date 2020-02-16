import java.util.Scanner;

public class ReadTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number, digit1, digit2, digit3, tmp;
        String str1[] = {"","","twenty","thirty","Forty","fifty","sixty","seventy","eighty","ninety"};
        String str2[] = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven",
                "twelve","thirteen","fourteen","fifteen","sixteen","nineteen"};
        number = input.nextInt();

        if((number <= 1) || (number >= 1000)){
            System.out.println("Wrong input!");
        }else if((number >= 1) && (number <= 19)){
            System.out.println(str2[number]);
        }
        else if((number >= 1) && (number <= 99)){
            digit1 = number/10;
            digit2 = number%10;
            System.out.println(str1[digit1]+ " " + str2[digit2]);
        }else if((number >= 1) && (number <= 999)){
            digit1 = number/100;
            tmp = number%100;
            digit2 = tmp/10;
            digit3 = tmp%10;
            System.out.println(str2[digit1] + " hundred "+ str1[digit2] + " "+ str2[digit3]);
        }
    }
}
