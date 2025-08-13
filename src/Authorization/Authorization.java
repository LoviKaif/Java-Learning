package Authorization;

import java.util.Scanner;

public class Authorization {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input you name: ");
        String userName = scan.nextLine();

        System.out.println("Hallo " + userName + ",what number do you want to find the percentage of?");

        int userNum = scan.nextInt();

        System.out.println("What percentage do you want to find of this number?");
        int userProcent = scan.nextInt();

        int procent = (userNum / 100) * userProcent;

        System.out.println("Percentage of your number:" + procent);
    }
}
