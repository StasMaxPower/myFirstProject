package lesson_16.task5;

import java.util.Random;

public class Main {

/*    Задача: айти викторина.
    Условие: участники делятся по командам(разработчики, тестировщики и тд).
    Каждой команде задаются вопросы и они набирают очки. Тестировщики должны соревноваться
    только с тестировщиками.*/

    public static void main(String[] args) {
        Developer developer1 = new Developer(20, "John");
        Developer developer2 = new Developer(30, "Max");

        Tester tester1 = new Tester(25, "Ivan");
        Tester tester2 = new Tester(35, "Petr");

        Team<Developer> developers = new Team<>("Разработчики");
        Team<Tester> testers = new Team<>("Тестировщики");

        developers.addParticipant(developer1);
        developers.addParticipant(developer2);

        testers.addParticipant(tester1);
        testers.addParticipant(tester2);

        testers.printWinner(testers);
        //Team <Integer> integerTeam = new Team<>("Команда");

    }

}
