public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println();
        System.out.println("Задание №1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен "+age+", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен "+age+", он недостиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println("Задание №2");
        int temperature = 45;
        if (temperature >= 5) {
            System.out.println("На улице "+temperature+" градусов, можно идти без шапки");
        } else {
            System.out.println("На улице "+temperature+" градусов, нужно надеть шапку");
        }
    }

    ;

    public static void task3() {
        System.out.println();
        System.out.println("Задание №3");
        int speed = 59;
        if (speed >= 60) {
            System.out.println("Если скорость "+speed+", то придется заплатить штраф");
        } else {
            System.out.println("Eсли скорость "+speed+", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println();
        System.out.println("Задание №4");
        double age = 18.5;
        if (age <= 2) {
            System.out.println("Если возраст человека равен "+age+", то ему нужно спать.");
        } else if (age > 2 && age < 6) {
            System.out.println("Eсли возраст человека равен "+age+", то ему нужно ходить в детский сад.");
        } else if (age >= 6 && age < 18) {
            System.out.println("Eсли возраст человека равен "+age+", то ему нужно ходить в школу.");
        } else if (age >= 18 && age < 24) {
            System.out.println("Eсли возраст человека равен "+age+", то его место в университете.");
        } else if (age >= 24 && age < 60) {
            System.out.println("Eсли возраст человека равен "+age+", то ему пора ходить на работу.");
        } else {
            System.out.println("Eсли возраст человека равен "+age+", то он может отдохнуть.");
        }
    }

    public static void task5() {
        System.out.println();
        System.out.println("Задание №5");
        double age = 13.9;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен "+age+", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст "+age+", то кататься можно без сопровождения");
        }
    }

    public static void task6() {
        System.out.println();
        System.out.println("Задание №6");
        int capacity = 102;
        int seating = 26;
        if (seating < 60) {
            System.out.println("Есть сидячее место");
        } else if (seating > capacity) {
            System.out.println("Мест нет. выберите другой поезд");
        } else System.out.println("Есть только стоячее место");
    }

    public static void task7() {
        System.out.println();
        System.out.println("Задание №7");
        int one = 98;
        int two = 126;
        int theree = 198;
        if (one > two && one > theree) {
            System.out.println("Наибольшее число: "+one);
        } else if (two > one && two > theree) {
            System.out.println("Наибольшее число: "+two);
        } else {
            System.out.println("Наибольшее число: "+theree);
        }
    }


}






