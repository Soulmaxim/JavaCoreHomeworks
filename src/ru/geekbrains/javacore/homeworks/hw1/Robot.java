package ru.geekbrains.javacore.homeworks.hw1;

public class Robot implements Participants {
    private String name;
    private double maxRun;
    private double maxJump;
    public Robot(String name, double maxRun, double maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    @Override
    public void run() {
        System.out.print(name + " (robot) is running");
    }

    @Override
    public void jump() {
        System.out.print(name + " (robot) is jumping");
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
        return name + " (robot)";
    }
}

