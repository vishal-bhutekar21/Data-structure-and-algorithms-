public class big_O_2_N {

    public static void numbersPrint(int n) {
        for(int i = 0; i<n; i++) {
           System.out.println(i);
        }
        for(int j = 0; j < n; j++) {
            System.out.println(j);
         }
    }

    public static void main(String[] args) {
        numbersPrint(13);
        
    }
}
