public class dorminanat_Nondorminant {

    //we know that the Big O(N^2+n)
    //we can simply remove the Non dorminat term and simply denote using Big O(N^2)
    
    public static void numbersPrint(int n) {
        for(int i = 0; i<n; i++) {
            for(int j = 0; j < n; j++) {
           System.out.println(i+" "+j);
        }
    }
    /// this is the nono dorminat type so we remove it 
    for(int j = 0; j < n; j++) {
        System.out.println(j);
     }
    
}
    public static void main(String[] args) {
        numbersPrint(32);
       
}
}