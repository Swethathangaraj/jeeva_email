//Making Basic Java Calculator:-
import java.util.Scanner;
class Hello
{
     public static void main(String[]args)
    {
        int num1;
        int num2;
        String operation;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the following instructions:-");
    System.out.println("");
    System.out.println("Please enter the first number = ");
    num1 = input.nextInt();

    System.out.println("Please enter the second number = ");
    num2 = input.nextInt();

    Scanner op = new Scanner(System.in);

    System.out.println("Choose your operations:"); 
    System.out.println("1 = Addition");
    System.out.println("2 = Subtraction");
    System.out.println("3 = Multiplication");
    System.out.println("4 = Division");
    operation = op.next();

if (operation.equals("1"))
{   
    System.out.println("Your answer is = "+ (num1+num2));
}
if (operation.equals("2"))
 { 
    System.out.println("Your answer is = "+(num1-num2));
 
 }
if (operation.equals("3"))
{
    System.out.println("Your answer is = "+(num1*num2));
}
if (operation.equals("4"))
{  
    System.out.println("Your answer is = "+(num1/num2));
}
    
}

    }
