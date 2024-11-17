import java.util.*;
public class digitsCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no to find its total digits ");

        int no=sc.nextInt();
     
        int count=0;
        int rem=0;
        while(no!=0){
            rem=no%10;
            count=count+1;
            no=no/10;

        }
        System.out.println("Total no of digits in numbers is "+count);
        int nodigits = (int)Math.log10(Math.abs(12345678)) + 1;
        System.out.println(nodigits);


    }
}
