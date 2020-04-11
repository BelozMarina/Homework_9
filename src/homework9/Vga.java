package homework9;

public class Vga {
    private double gpu;
    private int vram;

    public Vga(double gpu, int vram) {
        this.gpu = gpu;
        this.vram = vram;
    }

    public void make() {
        System.out.println("VGA -> Making");
    }

    public double getGpu() {
        return gpu;
    }

    public int getVram() {
        return vram;
    }
}
