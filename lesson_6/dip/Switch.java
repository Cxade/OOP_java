package dip;

public class Switch {
    private Device device;

    

    public Switch(Device device) {
        this.device = device;
    }

    // public Switch () {
    //     lamp = new Lamp ();
    // }

    public void toggle () {
        if (device.getIsOn())
            device.turnOff ();
        else
            device.turnOn ();
    }
}
