package ru.geekbrains.javacore.homeworks;

public class Wall extends Obstacle {
    private double height;
    public Wall(double height) {
        this.height = height;
    }
    @Override
    public boolean pass(Participants participant) {
        boolean check = false;
        participant.jump();
        if (participant.getMaxJump() >= height) {
            System.out.print(" - passed");
            check = true;
        }
        else System.out.print(" - failed");
        System.out.println(" jump " + height + " meters");
        return check;
    }
}
