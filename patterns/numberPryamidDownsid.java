public class numberPryamidDownsid{
    public static void printPattern(int n){
        for (int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
            System.out.print(j);
           }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(10);
    }
}
//output:
// 123456789
// 12345678
// 1234567
// 123456
// 12345
// 1234
// 123
// 12
// 1