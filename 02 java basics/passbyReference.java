public class passbyReference {
    
    static void doSomethingByRefernce (int num)
    {
        num+=num;
        System.out.println("the value of the num is "+num);
        num+=num;


    }
    // static void doSomethingByValue(int num)
    // {
    //     num+=num;
    //     System.out.println("the value of the num is "+num);
    //     num+=num;

    // java does not support the concept of pass by value

    // }
    public static void main(String[] args) {
        int num =10;
        doSomethingByRefernce(num);
        System.out.println("the value of the origional number is"+num);
       // doSomethingByValue(num);
        System.out.println("the value of the origional number is"+num);
    }
}
