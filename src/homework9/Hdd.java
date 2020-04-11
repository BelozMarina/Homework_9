package homework9;

public class Hdd {
    private int speed;
    private int memory;

    public Hdd(int speed, int memory) {
        this.speed = speed;
        this.memory = memory;
    }

    public void make() {
        System.out.println("The computer making HDD");
    }

    public int getSpeed() {
        return speed;
    }

    public int getMemory() {
        return memory;
    }
}
