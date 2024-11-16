public class downsidePattrern{
    public static void printPattern(int n){
        for (int i=1;i<n;i++){
            for(int j=n;j>=i+1;j--){
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        printPattern(10);
    }
}
// output:
// * * * * * * * * * 
// * * * * * * * * 
// * * * * * * * 
// * * * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 