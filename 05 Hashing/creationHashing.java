import java.util.HashMap;

//hashmap is present in the util package is the collection of the
//key and the value pair and the key can be the integer or of type string
//but we need always to use the wrapper class to use its functionality


public class creationHashing {
    public static void main(String[] args) {
        
        HashMap <Integer,Integer>map =new HashMap<>();
        //the key must be an unique value 

        //hashmaps provide a constant time complexity of O(1) for insertion,updation and deletion 
        //
        map.put(1, 2);
        map.put(2, 123);
      //  map.put(3, 12);

        System.out.println(map.get(1));// returns the value for the specified key in the 
        // get function 

        //to remove the key - and the value from the Hashmap we use the remove mehtod


        //to check that if the key is present in the map we use the method 
        //containskey(kay_value)

        boolean existElement5=map.containsKey(3);
        System.out.println("checking if the element in key 5 is  present or not: "+existElement5);

        int size=map.size();
        System.out.println("The size of the hashmap is "+size);

        // try {
        //     map.get(53);

        // } catch (Exception e) {
        //     System.out.println("we get the error which is :"+e.getMessage());
           
        // }


    }
    
}
