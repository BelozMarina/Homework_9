package homework9;

public class Cpu {
    private int speed;
    private int cores;

    public Cpu(int speed, int cores) {
        this.speed = speed;
        this.cores = cores;
    }

    public void make() {
        System.out.println("The computer making Mother CPU");
    }

    public int getSpeed() {
        return speed;
    }

    public int getCores() {
        return cores;
    }
}
