package Task1;

public class Main {
    public static void main(String[] args) {

        Two objTwo = new Two(22, 15, 3);
        Three objThree = new Three(10, 5, 8);

        // Виклик методів для екземплярів дочірніх класів
        objTwo.abc();
        objTwo.bca();

        objThree.abc();
        objThree.bca();
    }
    }

