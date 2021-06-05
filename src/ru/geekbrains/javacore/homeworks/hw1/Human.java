package ru.geekbrains.javacore.homeworks.hw1;

public class Human implements Participants {
    private String name;
    private double maxRun;
    private double maxJump;
    public Human(String name, double maxRun, double maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    @Override
    public void run() {
        System.out.print(name + " (human) is running");
    }

    @Override
    public void jump() {
        System.out.print(name + " (human) is jumping");
    }

    @Override
    public double getMaxRun() {
        return maxRun;
    }

    @Override
    public double getMaxJump() {
        return maxJump;
    }

    @Override
    public String getName() {
        return name + " (human)";
    }
}

