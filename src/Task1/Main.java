package Task1;

    public class Main {
        public static void main(String[] args) {

            int a = 5;
            int b = 22;
            double ab = a / b; // ділення
            int ac = a % b; // залишок від ділення
            System.out.println(ab);
            System.out.println(ac);
        }

    }

    //Task2
    class Task2 {
        static int getSum(int n) {
            int sum = 0;
            while (n != 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
            return sum;
        }

        public static void main(String[] args) {
            int n = 56;

            System.out.println(getSum(n));
        }
    }

    //Task3
    class Task3 {
        public static void main(String[] args) {
            double number = 3.14;
            double y = number % 1;
            double v = number + y;

            System.out.println((int) v);
        }
    }