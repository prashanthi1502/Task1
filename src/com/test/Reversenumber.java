import java.util.Scanner;

public class Reversenumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: "); //876 is  678
        int n=scanner.nextInt();
        int rev=0,rem=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
