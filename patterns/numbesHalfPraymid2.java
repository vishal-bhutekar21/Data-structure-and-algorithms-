public class numbesHalfPraymid2 {
    public static void printPattern(int n){
        for (int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        printPattern(10);
    }
}
// output:
// 1
// 22
// 333
// 4444
// 55555
// 666666
// 7777777
// 88888888
// 999999999
