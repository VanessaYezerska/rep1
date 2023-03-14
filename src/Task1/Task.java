package Task1;

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



      public class Task {
    public static void main(String[] args) {
        int n = 127;

        if (n > 50 && n < 100) {  // якщо число n більше 50, і менше за 100 друкуємо:
            System.out.println(n + " є в проміжку (50; 100)");
        } else { // інакше:
            System.out.println(+n + " немає в проміжку (50; 100)");
        }

    }
}

//Task2
     class Task5 {
    public static void main(String[] args) {
        int n = 532;
        int max = 0; // змінна для зберігання найбільшої цифри
        int y = n / 100; // знаходимо 1 цифру(5)
        int v = (n / 10) % 10; //знаходимо 2 цифру(3)
        int o = n % 10; // знаходимо 3 цифру(2)

        if (y > max) { // якщо а більша за поточний максимум, тоді ми зберігаємо її як новий максимум (max = 5)
            max = y;
            if (v > max) // max = 3
                max = v;
            if (o > max) // max = 2
                max = o;
        }
        System.out.println("Найбільше число-" +  max);
    }
}


//Task3
     class Task6{
    public static void main(String[] args) {
        int floor = 6;
        int y = 2;
        if (y > floor) {
            if (y == 2) {
                System.out.println("ліфт підіймається на 3 поверх");
            } else {
                System.out.println("ліфт підіймається на" + y + "поверх");
            }
        }     else if(y < floor){
            if(y == 2){
                System.out.println("ліфт спускається на 1 поверх");
            }
            else{
                System.out.println("ліфт спускається на"+y+"поверх");
            }
        }
        else{
            System.out.println("Ви вже знаходитесь на цьому поверсі");

        }

    }
}














class Task7{
    public static void main(String[] args) {
        String y = "Yes";
        System.out.println("Чи погоджуєтесь Ви?");

        switch (y){
            case "Так":
            case "OK":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("Помилка");
                break;



        }
    }
}



