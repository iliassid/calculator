import java.util.Scanner;
public class Main {
    public static double add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }
    public static double sub() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers for subtraction");
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }
    public static double mult(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers for multiplication");
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }
    public static double div(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers for the division:");
        System.out.println("Enter the Dividend number :");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the Divisor number:");
        double num2 = scanner.nextDouble();
        if (num2==0){
            System.out.println("Error: Division by zero is not allowed");
        }
        return num1/num2;
    }
    public static double power(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's calculate number 1 to the power of number 2");
        System.out.println("Enter number 1:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        return Math.pow(num1, num2);
    }
    public static double[] SqRoot(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate Square root for it:");
        double num1 = scanner.nextDouble();
        double result = Math.sqrt(num1);
        return new double[]{num1,result};
    }
    public static int Factorial(int num1){
        if(num1 <= 1){
            return 1;
        }
            return num1 * Factorial(num1 - 1);
    }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            while (true) {
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
                switch (choice) {
                    case 1:
                        double SumResult = add();
                        System.out.println("The sum is :" + SumResult);
                        break;
                    case 2:
                        double SubtResult = sub();
                        System.out.println("The subtraction is :" + SubtResult);
                        break;
                    case 3:
                        double MultResult = mult();
                        System.out.println("The multiplication result is:" + MultResult);
                        break;
                    case 4:
                        double DivResult = div();
                        System.out.println("The division result is :" + DivResult);
                        break;
                    case 5:
                        double PowResult = power();
                        System.out.println("The power of number 1 to the number is:" + PowResult);
                        break;
                    case 6:
                        double SRResult[] = SqRoot();
                        System.out.println("The Square root of the number " + SRResult[0] + " is: " + SRResult[1]);
                        break;
                    case 7:
                        System.out.println("Let's calculate a factorial number");
                        System.out.print("Enter a number:");
                        int num = scanner.nextInt();
                        System.out.print("the factorial is :" + Factorial(num));
                        break;
                    case 8:
                        System.out.println("Good bye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Choose a number between 1-8");
                        break;
                }

            }

        }
}

