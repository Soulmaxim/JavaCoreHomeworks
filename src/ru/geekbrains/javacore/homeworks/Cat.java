package ru.geekbrains.javacore.homeworks;

public class Cat implements Participants {
    private String name;
    private double maxRun;
    private double maxJump;
    public Cat(String name, double maxRun, double maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    @Override
    public void run() {
        System.out.print(name + " (cat) is running");
    }

    @Override
    public void jump() {
        System.out.print(name + "(cat) is jumping");
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
        return name + " (cat)";
    }
}

