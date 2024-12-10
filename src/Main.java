import java.util.Scanner;

public class Main {
    public static int add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        return num1 + num2;
    }
    public static int sub() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers for subtraction");
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        return num1 - num2;
    }

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose your option:");
            System.out.println("1.Addition (+)");
            System.out.println("2.Subtraction (-)");
            System.out.println("3.Multiplication (*)");
            System.out.println("4.Division (/)");
            System.out.println("5.Power");
            System.out.println("6.Square root");
            System.out.println("7.Factorial");
            System.out.println("8.quit");


            int choice = scanner.nextInt();
            int result = 0;


            switch (choice) {
                case 1:
                    result = add();
                    System.out.println("The sum is :" + result);
                    break;
                case 2:
                    result = sub();
                    System.out.println("The subtraction is :" + result);
                    break;
                case 3:
                    System.out.println("good bye");
                default:
                    System.out.println("Choose a number between 1-8");
            }


        }
    }