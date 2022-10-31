public class Main {
    public static void main(String[] args) {
        //Задача  1.1
        System.out.println("Задача 1.1");

        int age = 18;

        if (age >= 18) {
            System.out.println("Поздравление с совершеннолетием!");
        }

        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать!");
        }

        //Задача 2.1
        System.out.println();
        System.out.println("Задача 2.1");

        age = 18;

        if (age >= 24) {
            System.out.println("Вы окончили университет и пора искать первую работу!");
        }

        if (age >= 18) {
            System.out.println("Вы закончили школу и может отправляться в университет!");
        }

        if (age >= 7) {
            System.out.println("Ребенок ходит в школу !");
        }


        //Задача 3.1
        System.out.println();
        System.out.println("Задача 3.1");

        int passangers = 70;

        if (passangers == 102) {
            System.out.println("Вагон польностью заполнен!");
        }

        if (passangers >= 60) {
            System.out.println("В вагоне остались только стоячие места!");
        }

        if (passangers < 60) {
            System.out.println("В вагоне есть сидячие места!");
        }

        //Задача  1.2
        System.out.println();
        System.out.println("Задача 1.2");

        age = 18;

        if (age >= 18) {
            System.out.println("Поздравление с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать!");
        }

        //Задача 2.2
        System.out.println();
        System.out.println("Задача 2.2");

        age = 18;

        if (age >= 24) {
            System.out.println("Вы окончили университет и пора искать первую работу!");
        } else if (age >= 18) {
            System.out.println("Вы закончили школу и может отправляться в университет!");
        } else if (age >= 7) {
            System.out.println("Ребенок ходит в школу !");
        } else {
            System.out.println("Дошколёнок");
        }

        //Задача 3.2
        System.out.println();
        System.out.println("Задача 3.2");

        passangers = 70;

        if (passangers == 102) {
            System.out.println("Вагон польностью заполнен!");
        } else if (passangers >= 60) {
            System.out.println("В вагоне остались только стоячие места!");
        } else {
            System.out.println("В вагоне есть сидячие места!");
        }

        //Задача  1.3
        System.out.println();
        System.out.println("Задача 1.3");

        age = 19;

        if (age >= 2 && age <= 6) {
            System.out.println("Нужно ходить в детский сад!");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Нужно ходить в школу!");
        } else if (age > 18 && age < 24) {
            System.out.println("Нужно ходить в университет!");
        } else {
            System.out.println("Пора ходить на работу");
        }

        //Задача  2.3
        System.out.println();
        System.out.println("Задача 2.3");

        age = 19;

        if (age < 5) {
            System.out.println("Нельзя кататься на аттракционе!");
        } else if (age >= 5 && age < 14) {
            System.out.println("Можно кататься на аттракционе только в сопровождении взрослого!");
        } else {
            System.out.println("Можно кататься на аттракционе без сопровождении взрослого!");
        }

        //Задача  3.3
        System.out.println();
        System.out.println("Задача 3.3");

        int one = 4;
        int two = 5;
        int three = 3;

        if (one >= two && one >= three) {
            System.out.println("Число " + one + " смое большое");
        } else if (two >= one && two >= three) {
            System.out.println("Число " + two + " смое большое");
        } else if (three >= one && three >= two) {
            System.out.println("Число " + three + " смое большое");
        }
    }
}