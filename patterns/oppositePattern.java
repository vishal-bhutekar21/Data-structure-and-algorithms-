public class oppositePattern {

    public static void printPattern(int n){
        for(int i=0;i<n;i++){
            //space print
            for (int j=0;j<i;j++){
                System.out.print(" ");

            }
            for(int k=0;k<2* n- (2*i+1);k++)
            {
                System.out.print("*");

            }
            //space print
            for (int l=0;l<i;l++){
                System.out.print(" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
}

// //output;
// *********
//  ******* 
//   *****  
//    ***   
//     *  