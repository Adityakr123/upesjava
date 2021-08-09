import java.util.Scanner;

public class Exp1 {
    //1.	Write program to print the kth digit from last. e.g. input 23617 and k=4 output 3.
    // x=23617/10=2361/10=236/10=23
    //x%10=23%10=3
    public static void main(String[] args) {
        int x,k;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x=in.nextInt();
        System.out.print("Enter k: ");
        k=in.nextInt();
        for(int i=0;i<k-1;i++){
            x=x/10;

        }
        System.out.print("Last Digit: ");
        System.out.println( x%10 );
    }
}
