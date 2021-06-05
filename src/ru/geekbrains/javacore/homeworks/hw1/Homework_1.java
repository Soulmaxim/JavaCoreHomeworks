package ru.geekbrains.javacore.homeworks.hw1;

import java.util.ArrayList;

public class Homework_1 {
    public static void main(String[] args) {
        final int sizeObst = 4;
        int sizePart = 6;
        Obstacle[] obstacles = new Obstacle[sizeObst];
        obstacles[0]= new Treadmill(100.0);
        obstacles[1]= new Wall(0.3);
        obstacles[2]= new Treadmill(1500.0);
        obstacles[3]= new Wall(1.5);
        ArrayList <Participants> participants = new ArrayList<>();
        participants.add(new Human("Vanya", 2500.0, 1.3));
        participants.add(new Robot("Bender", 10000.0, 0.2));
        participants.add(new Cat("Murka", 300.0, 1.6));
        participants.add(new Human("Kirill", 2000.0, 1.5));
        participants.add(new Robot("Wall-e", 5000.0, 0.4));
        participants.add(new Cat("Tishka", 400.0, 1.4));

        for (int i = 0; i < sizeObst; i++) {
            System.out.println("Challenge " + (i + 1) + ":");
            for (int j = 0; j < sizePart; j++) {
                if (!obstacles[i].pass(participants.get(j))) {
                    participants.remove(j);
                    j--;
                    sizePart--;
                }
            }
            System.out.println();
        }

        if (sizePart == 1) System.out.println("Winner: " + participants.get(0).getName());
        else if (sizePart == 0) System.out.println("No winners");
        else {
            System.out.println("Winners:");
            for (int i = 0; i < sizePart; i++) {
                System.out.println(participants.get(i).getName());
            }
        }
    }
}

