package week13.task4;

public class ClientCode {
    public static void main(String[] args){
        // Using the new device directly
        NewDevice newDevice = new NewDeviceImpl();
        newDevice.operateNewFunction();

        // Using the old device via the adapter
        OldDevice oldDevice = new OldDeviceImpl();
        NewDevice adapter = new DeviceAdapter(oldDevice);
        adapter.operateNewFunction();
    }
}
