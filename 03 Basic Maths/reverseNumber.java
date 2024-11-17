import java.util.*;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number to find its reverse ");
        int orgnum=sc.nextInt();
        int no =orgnum;
        int rem;
        int rev=0;
        
        while(no!=0){

            rem=no%10;
            rev=rev*10+rem;
            no=no/10;


        }
        System.out.println("reverse  of the numbers is"+ rev);
    }
}
