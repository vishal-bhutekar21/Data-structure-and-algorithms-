class Polymorphism {
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(String b) {
        System.out.println("String: " + b);
    }

    void display(int a ,int b){
        System.out.println("The sum of the two numbers are  "+(a+b));
    }

    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        obj.display(5);
        obj.display("Hello");
        obj.display(23,23);
    }
}