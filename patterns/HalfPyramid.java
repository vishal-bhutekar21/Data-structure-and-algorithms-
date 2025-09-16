import java.util.Scanner;

class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your limit to print the stars :");
        int l=sc.nextInt();

        for(int i=0;i<l;i++){
            for(int j=1;j<=i;j++){
                System.out.print("@");
            }
            System.out.println();
        }
       
    }
}