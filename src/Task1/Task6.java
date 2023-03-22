package Task1;

//Task3
public class Task6 {
    public static void main(String[] args) {

        int y = 2;// поверх, на якому ми знаходимось
        int v = 7;// поверх, який нам потрібен

        if (v == y) {
            System.out.println("Ви вже знаходитесь на цьому поверсі");
        }

        if (v > y) {
            if (v == 2) {
                System.out.println("Ліфт підіймається на 3 поверх");
            } else {
                System.out.println("Ліфт підіймається на " + v + " поверх");
            }
        } else if (v < y) {
            if (v == 2) {
                System.out.println("Ліфт спускається на 1 поверх");
            } else {
                System.out.println("Ліфт спускається на " + v + " поверх");
            }


        }
    }

}
