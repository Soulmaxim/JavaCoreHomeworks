package ru.geekbrains.javacore.homeworks.hw1;

public class Treadmill extends Obstacle {
    private double length;
    public Treadmill(double length) {
        this.length = length;
    }
    @Override
    public boolean pass(Participants participant) {
        boolean check = false;
        participant.run();
        if (participant.getMaxRun() >= length) {
            System.out.print(" - passed");
            check = true;
        }
        else System.out.print(" - failed");
        System.out.println(" run " + length + " meters");
        return check;
    }
}
