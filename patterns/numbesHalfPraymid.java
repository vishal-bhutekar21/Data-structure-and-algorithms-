public class numbesHalfPraymid {
    public static void printPattern(int n){
        for (int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        printPattern(10);
    }
}
// output
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
// 1 2 3 4 5 6 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 8 
// 1 2 3 4 5 6 7 8 9 
