import java.util.*;
public class pallindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number to check  its pallindrome ");
        int orgnum=sc.nextInt();
        int no =orgnum;
        int rem;
        int rev=0;
        
        while(no!=0){

            rem=no%10;
            rev=rev*10+rem;
            no=no/10;


        }
        if(rev==orgnum)
        {
            System.out.println("the number id pallindrome  "+ rev);

        }
        else
        {
            System.out.println("THE number id not pallindrome");
        }
        
    }
}
