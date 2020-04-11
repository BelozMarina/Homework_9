package homework9;

public class MotherBoard {
    private int socket;
    private int connecting;

    public MotherBoard(int socket) {
        this.socket = socket;
    }

    public void make() {
        System.out.println("The computer making Mother Board");
    }

    public void isConnecting(int socket) {
        System.out.println("Mother Board has " + socket + " sockets to connected");
    }

    public int getConnecting() {
        return connecting;
    }

    public void setIsConnecting(int connecting) {
        this.connecting = connecting;
    }

    public int getSocket() {
        return socket;
    }

    public void setSocket(int socket) {
        this.socket = socket;
    }


}
