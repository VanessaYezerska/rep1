package Task1;

    public class Main {
        public static void main(String[] args) {

            int a = 5;
            int b = 22;
            double ab = (double)a / b; // ділення
            int ac = a % b; // залишок від ділення
            System.out.println(ab);
            System.out.println(ac);
        }

    }

    //Task2
    class Task2 {
        public static void main(String[] args) {
            int y = 28;
            int v = y / 10; // поділимо 22 на 10 = 2 (2.2)
            int o = y % 10; // отримаємо залишок від ділення = 2 (2.2)
            int yvo = v + o; // обчислюємо суму (2+2) та виводимо результат
            System.out.println("сума числа-" + y + "=" + yvo);
        }
    }
            //Task3
            class Task3 {
                public static void main(String[] args) {
                    double number = 3.14;
                    double y = number % 1; // отримаємо залишок від ділення (14)
                    double v = number + y; // обчислюємо суму та виводимо результат

                    System.out.println((int) v);
                }
            }
            // Task4
            class Task4 {
                public static void main(String[] args) {
                    int y = 250;
                    int v = y / 100; // поділимо 250 на 100 і отримаємо - 2 (2.5)
                    int o = (y % 100) / 10; // отримаємо залишок від ділення - 5(2.5) та поділимо на 10 і отримаємо - 5 (0.5)
                    int h = y % 10; // отримаємо залишок від ділення 0 (25)
                    int g = v + o + h ;
                    System.out.println(g);
                }
            }