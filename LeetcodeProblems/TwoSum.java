import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        
        int []arr={12,1,52,6,4,8,5,2,121};
        int target=126;

        int result[]=twoSum(arr, target);
        System.out.println("The number addition of the :"+target+"  we get from the index :"+Arrays.toString(result));


    }

     static int[] twoSum(int[] arr, int target) {

        HashMap<Integer,Integer> map =new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            int complement=target-arr[i];




            if (map.containsKey(complement)) {

                return new int[]{map.get(complement),i};
                
            }
            
            map.put(arr[i], i);

        }
        


        return new int[]{-1,-1};
     }
}
