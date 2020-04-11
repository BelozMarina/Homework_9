package homework9;

public class Computer {
    private static String nameComp = "My Compik";
    private boolean monitor;
    private boolean mouse;
    private boolean keyboard;

    public static void main(String[] args) {
        Cpu cpu = new Cpu(892, 3);
        MotherBoard motherBoard = new MotherBoard(10);
        Ram ram = new Ram(512);
        Hdd hdd = new Hdd(230, 8);
        Vga vga = new Vga(2.5, 34);


        SystemBlock systemBlock = new SystemBlock(cpu, motherBoard, ram, hdd, vga);
        System.out.println("The name of Computer " + Computer.nameComp);
        Computer.isRunning();
        System.out.println();

        systemBlock.getVga().make();
        systemBlock.getCpu().make();
        systemBlock.getHdd().make();
        systemBlock.getMotherBoard().make();
        System.out.println("Mother Board was connected " + systemBlock.getMotherBoard().getSocket());
        systemBlock.getMotherBoard().isConnecting(12);
        systemBlock.getRam().make();
        systemBlock.stop();
    }

    private static void isRunning() {
        System.out.println("The monitor is turned on");
        System.out.println("The mouse is turned on");
        System.out.println("The keyboard is turned on");

    }


}
