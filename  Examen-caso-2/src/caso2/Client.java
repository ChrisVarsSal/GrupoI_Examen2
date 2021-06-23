package caso2;


public class Client {
    private String name;
    int devices,prevDevice;

    public Client(String name, int devices) {
        this.name = name;
        this.devices = devices;
        this.prevDevice = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDevices() {
        return devices;
    }

    public void setDevices(int devices) {
        this.prevDevice = this.devices;
        this.devices = devices;
    }

    public int getPrevDevice() {
        return prevDevice;
    }


    
    
    
}
