import java.util.Scanner;

public class datatpes {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int roll;
                int age;
        String fullname;
       
        float temp;

        long number;

        System.out.print("Enter full name :");
        fullname=sc.nextLine();
        System.out.print("Enter your Roll No :");
        roll=sc.nextInt();
        System.out.print("Enter mobile number :");
        number=sc.nextLong();
        System.out.print("Enter ok or not");
       System.out.println("Enter your body temperature :");
       temp=sc.nextFloat();
       System.out.println("Full name is "+fullname);
       System.out.println("Roll NO is "+roll);
       System.out.println("Mobile number is "+number);
       System.out.println("Temparature is "+temp);
       


    }
}
