public class orderAgnosticBS {
    public static void main(String ...v){
       
        int arr[]={12,412,2,141,55,74,3474,212};
        int target=412;

        
        int result=search(arr, target);



        
        if (result==-1) {
            System.out.println("The array element not found :");

        }else
        {
            System.out.println("The element foundt  ar index :"+result);
        }

        
        
    }

    
   static int search(int []arr,int target){

        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];


        while (start<=end) {
            int mid=start+(end-start)/2;
            
        if (arr[mid]==target) {
            return mid;
            
        }

        if (isAsc) {
            if (target>arr[mid]) {
                start=mid+1;
                
            }else  {
                end=mid-1;
                
            }
        }else{

            if (target>arr[mid]) {
                start=mid-1;
                
            }else  {
                end=mid+1;
                
            }

        }
            
    }


        return -1;
    }
}
