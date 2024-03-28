package lesson_16.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {

    private String name;

    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipant(T participant) {
        participants.add(participant);
    }

    public String getName() {
        return name;
    }

    public List<T> getParticipants() {
        return participants;
    }

    public void printWinner(Team<T> team) {
        Random random = new Random();
        int randomInt = random.nextInt(2);
        if (randomInt == 0) {
            System.out.println("Победители " + getName());
        } else {
            System.out.println("Победители " + team.getName());

        }
    }

}
