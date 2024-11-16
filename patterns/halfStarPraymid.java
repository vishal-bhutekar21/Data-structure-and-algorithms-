public class halfStarPraymid {
   public static void printStar(int n){
        for(int i= 0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        printStar(7);
        
    }
    
}
// output:
// *
// **
// ***
// ****
// *****
// ******
// *******