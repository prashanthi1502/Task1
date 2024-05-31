import java.util.*;
public class NumericalPatterns{

    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        int k,i,j;
        System.out.println("Enter number of rows");
        k=scanner.nextInt();

        for(i=k;i>=1;i--)
        {
            for(j=k;j>=1;j--)
            {
                System.out.print(i>j?i:j);
            }
            System.out.println();
        }
    }
}
