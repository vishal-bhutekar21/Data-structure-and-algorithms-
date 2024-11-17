import java.util.*;
public class nodigitAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number to find its sum of digits :");
        int orgnum=sc.nextInt();
        int no =orgnum;
        int rem;
        int sum=0;
        
        while(no!=0){

            rem=no%10;
            sum=sum+rem;
            no=no/10;



        }
        System.out.println("Sum of the numbers is"+ sum);
    }
}
