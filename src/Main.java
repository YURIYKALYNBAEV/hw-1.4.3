public class Main {
    public static void main(String[] args) {

        // Задача №1
        System.out.println("Задача №1");

        int agePerson = 20;
        if (agePerson > 2 && agePerson <= 6) {
            System.out.println("ему нужно ходить в детский сад");
        } else if (agePerson >= 7 && agePerson < 18) {
            System.out.println("ему нужно ходить в школу");
        } else if (agePerson >= 18 && agePerson < 24) {
            System.out.println("его место в университете");
        } else if (agePerson >= 24) {
            System.out.println("ему пора ходить на работу");
        }

        // Задача №2
        System.out.println("Задача №2");

        int ageChild = 15;
        if (ageChild < 5) {
            System.out.println("он не может кататься на аттракционе");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("он может кататься только в сопровождении взрослого." +
                    " Если взрослого нет, то кататься нельзя");
        } else if (ageChild >= 14) {
            System.out.println("он может кататься без сопровождения взрослого");
        }

        // Задача №3
        System.out.println("Задача №3");

        int one;
        int two;
        int three;
        int max;

        one = 5;
        two = 20;
        three = 15;

        if (one > two && one > three) {
            max = one;
            System.out.println("Наибольшее число: " + max);
        } else if (two > one && two > three) {
            max = two;
            System.out.println("Наибольшее число: " + max);
        } else
         {
            max = three;
            System.out.println("Наибольшее число: " + max);
        }
    }
}