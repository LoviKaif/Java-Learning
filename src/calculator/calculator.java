package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        //calculator
        Scanner input = new Scanner(System.in);

        ArrayList<String> expression = new ArrayList<>();
        int i = 2;
        char userOperation = '+';
        int res = 0;
        
        while(userOperation != '='){
            if (i%2 == 0){
                System.out.print("Input number: ");
                int userNumbers = input.nextInt();
                expression.add(String.valueOf(userNumbers));
                switch (userOperation) {
                    case '+':
                        res += userNumbers;
                        break;
                    case '-':
                        res -= userNumbers;
                        break;
                    case '*':
                        res *= userNumbers;
                        break;
                    case '/':
                        res /= userNumbers;
                        if(userNumbers==0){
                            System.out.print("Error");
                        }
                        break;
                    case '=':
                        break;
                    default:
                        System.out.print("This operator un ok(");
                }
            }
            if(i%2 != 0){
                System.out.print("Input operation: ");
                userOperation = input.next().charAt(0);
                expression.add(String.valueOf(userOperation));
            }
            
            i++;
            System.out.println(res);
        }
        expression.add(String.valueOf(res));

        for(String el : expression){
            System.out.print(el);
        }
        
    }

}
