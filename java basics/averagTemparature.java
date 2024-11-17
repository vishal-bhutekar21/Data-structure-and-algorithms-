import java.util.*;
public class averagTemparature {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many days to calculate the avarage temparature ");
        int days=sc.nextInt();
        int sum=0;
        for(int i=1;i<=days;i++)
        {
            System.out.println("Temparature of the  day "+i +"  high ");
            int next=sc.nextInt();
            sum+=next;
        }
        
        double avgTemop=sum/days;
        System.out.println();
        System.out.println("avarage temparatura is "+avgTemop);
    }
}

//output is it calculates the overall days avarage temparature and returns it in the double form 


