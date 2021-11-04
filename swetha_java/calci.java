//Making simple calculator using switch statement:-

import java.util.Scanner;

class calculator {
public static void main(String[]args){

    char operator;
 Double number1, number2, result;

//Create object for scanner class:-
 Scanner input = new Scanner (System.in);

//Getting operation input from user:-
 System.out.println("Choose the operator: '+','-','*','/'");
 operator = input.next().charAt(0);

//Ask user to enter the numbers:-
 System.out.println("Enter your first number =");
 number1 = input.nextDouble();
 System.out.println("Enter your second number =");
 number2 = input.nextDouble();

switch (operator){

//Performs Addition:-
 case'+':
 result = number1 + number2;
 System.out.println(number1 + " + " + number2 + " = " + result);
 
//Performs Subtraction:-
 case'-':
 result = number1 - number2;
 System.out.println(number1 + " - " + number2 + " = " + result);

//Performs Multiplication:-
 case'*':
 result = number1 * number2;
 System.out.println(number1 + " * " + number2 + " = " + result);

//Performs Division:-
 case'/':
 result = number1 / number2;
 System.out.println(number1 + " / " + number2 + " = " + result); 

//If user enter the operations incorrect:-
 default:
 System.out.println("Invalid operator!");
 break;

}
 input.close();

} }
