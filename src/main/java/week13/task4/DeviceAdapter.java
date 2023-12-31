package week13.task4;

public class DeviceAdapter implements NewDevice{
    public OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice){
        this.oldDevice = oldDevice;
    }
    @Override
    public void operateNewFunction() {
        // Adapter translates the new function to the old function
        oldDevice.operateOldFunction(); //???
    }
}
