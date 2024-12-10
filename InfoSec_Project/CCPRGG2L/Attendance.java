import java.util.Scanner;
public class Attendance {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        


        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // int z = sc.nextInt();
        // int S = x+y+z;
        // int A = S / 3;
        // int P = x * y * z;

        // System.out.println("The sum is: " + S + "\nThe quotient is " + A + "\nThe product is " + P);

        // double x1 = sc.nextFloat();
        // double x2 = sc.nextFloat();
        // double y1 = sc.nextFloat();
        // double y2 = sc.nextFloat();

        // double dist = ((Math.pow(x2 - x1,2)) + Math.pow(y2 - y1,2) * 2);
        // double dist2 = Math.sqrt(dist);

        // System.out.println(dist2);

        int year = sc.nextInt();
        
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year % 100 == 0)
        System.out.println(year + " is a leap year");
        else
        System.out.println(year + " not a leap year");   
    }
    
}
