package homework9;

public class SystemBlock {
    private Cpu cpu;            // процессор
    private MotherBoard motherBoard;
    private Ram ram;          // оперативня память
    private Hdd hdd;         // жесткий диск
    private Vga vga;        // видеокарта
    private boolean isRunning;

    public SystemBlock(Cpu cpu, MotherBoard motherBoard, Ram ram, Hdd hdd, Vga vga) {
        this.cpu = cpu;
        this.motherBoard = motherBoard;
        this.ram = ram;
        this.hdd = hdd;
        this.vga = vga;
    }


    public void start() {
        isRunning = true;
        System.out.println("The computer is turned on");
    }

    public void stop() {
        isRunning = false;
        System.out.println("The computer is terned off");
    }

    public Cpu getCpu() {
        return this.cpu;
    }

    public MotherBoard getMotherBoard() {
        return this.motherBoard;
    }

    public Ram getRam() {
        return this.ram;
    }

    public Hdd getHdd() {
        return this.hdd;
    }

    public Vga getVga() {
        return this.vga;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
