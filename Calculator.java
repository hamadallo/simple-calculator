package calculator;
//@author HamadAllo

import java.util.Scanner;

public class Calculator {
    
    public static void Prompt() {
        System.out.println("Choose the Operation number form the list:\n"
                + "********************\n"
                + "1- Addition +\n"
                + "2- Subtraction -\n"
                + "3- Multiplication *\n"
                + "4- Division /\n"
                + "5- Power ^\n"
                + "6- Sine angle\n"
                + "7- Cosine angle\n"
                + "8- Tan angle\n"
                + "9- Sec angle\n"
                + "10- Cosec angle\n"
                + "11- Cotan angle\n"
                + "12- Log number\n"
                + "13- Exponential\n"
                + "14- Square root\n"
                + "15- Cubic root\n"
                + "16- Absolute value\n"
                //+ "17- Another operation on the last result?\n"
                // Not working yet, need more coding! ;(
                + "0- Close the program\n"
                + "********************");
        
    }

    public static double Add(double x, double y) {

        return  x + y;
        
    }

    public static double Sub(double x, double y) {

        return x - y;
        
    }

    public static double Mult(double x, double y) {

        return x * y;
        
    }

    public static double Div(double x, double y) {
        
        if (y == 0)
            return 0;
        return x / y;
        
    }
    
    public static double Pow(double x, double y) {

        return Math.pow(x, y);
        
    }

    public static void main(String[] args) {

        double N1, N2, ans;
        Scanner Scan = new Scanner(System.in);

        Prompt();
        int s = Scan.nextInt();
        switch (s) {
            case 1:
                System.out.println("Enter the 1st number:");
                N1 = Scan.nextDouble();
                System.out.println("Enter the 2nd number");
                N2 = Scan.nextDouble();
                ans = Add(N1,N2);
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
                
            case 2:
                System.out.println("Enter the 1st number:");
                N1 = Scan.nextDouble();
                System.out.println("Enter the 2nd number");
                N2 = Scan.nextDouble();
                
                ans = Sub(N1,N2);
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
                
            case 3:
                System.out.println("Enter the 1st number:");
                N1 = Scan.nextDouble();
                System.out.println("Enter the 2nd number");
                N2 = Scan.nextDouble();
                ans = Mult(N1,N2);
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
            
            case 4:
                System.out.println("Enter the 1st number:");
                N1 = Scan.nextDouble();
                System.out.println("Enter the 2nd number");
                N2 = Scan.nextDouble();
                ans = Div(N1,N2);
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
            
            case 5:
                System.out.println("Enter the 1st number:");
                N1 = Scan.nextDouble();
                System.out.println("Enter the \"power\" number");
                N2 = Scan.nextDouble();
                ans = Math.pow(N1, N2);
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
            
            case 6:
                System.out.println("Enter the angle degree to get sine:");
                N1 = Scan.nextDouble();
                ans = Math.sin(N1);
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
            
            case 7:
                System.out.println("Enter the angle degree to get cosine:");
                N1 = Scan.nextDouble();
                ans = Math.cos(N1);
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
            
            case 8:
                System.out.println("Enter the angle degree to get tangent:");
                N1 = Scan.nextDouble();
                ans = Math.tan(N1);
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
            
            case 9:
                System.out.println("Enter the angle degree to get sec:");
                N1 = Scan.nextDouble();
                ans = (1 / Math.sin(N1));
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
            
            case 10:
                System.out.println("Enter the angle degree to get cosec:");
                N1 = Scan.nextDouble();
                ans = (1 / Math.cos(N1));
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
            
            case 11:
                System.out.println("Enter the angle degree to et cotan:");
                N1 = Scan.nextDouble();
                ans = (1 / Math.tan(N1));
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
            
            case 12:
                System.out.println("Enter a number to get the Logarithm:");
                N1 = Scan.nextDouble();
                ans = Math.log(N1);
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
            
            case 13:
                System.out.println("Enter the value of \"power\" to get the Exponential:");
                N1 = Scan.nextDouble();
                ans = Math.exp(N1);
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
            
            case 14:
                System.out.println("Enter a number to get the Square root:");
                N1 = Scan.nextDouble();
                ans = Math.sqrt(N1);
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
            
            case 15:
                System.out.println("Enter a number to get the Cubic root:");
                N1 = Scan.nextDouble();
                ans = Math.cbrt(N1);
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
            
            case 16:
                System.out.println("Enter a number to get the Absolute value:");
                N1 = Scan.nextDouble();
                ans = Math.abs(N1);
                System.out.println("Result: "+ ans);
                
                Prompt();
                s = Scan.nextInt();
                
                break;
            
            case 0:
                System.out.println("Thank you, see you later");
                System.exit(0);
                break;
            
        }

    }

}
