 public class GCDNumbers {

            public static void main(String[] args) {

                int max = 48;
                int min = 18;

                System.out.println("The gcd is :" + gcd(max, min));
            }

            private static int gcd(int a, int b) {
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                return a;
            }
        }
        