package general;

import com.testinium.deviceinformation.DeviceInfo;
import com.testinium.deviceinformation.DeviceInfoImpl;
import com.testinium.deviceinformation.device.DeviceType;
import com.testinium.deviceinformation.exception.DeviceNotFoundException;
import com.testinium.deviceinformation.model.Device;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;


public class DesiredCapabilitiesGenerator {


    public static Device defineDeviceVariable() throws DeviceNotFoundException, IOException  //Define the type of device and its version
    {
        DeviceInfo deviceInfo = new DeviceInfoImpl(DeviceType.ANDROID);   // if IOs device then select io
        Device device = null;
        if (deviceInfo.anyDeviceConnected()) {
            device = deviceInfo.getFirstDevice();  // because we are doing single device execution
        }

        return device;
    }


    public static DesiredCapabilities capabilities() throws DeviceNotFoundException, IOException {

        DesiredCapabilities capabilities = new DesiredCapabilities();


        Device device=defineDeviceVariable();


        System.out.println("Device Name - " + device.getDeviceProductName());
        System.out.println("Device id   - " + device.getUniqueDeviceID());
        System.out.println("Version --"+device.getProductVersion());

        capabilities.setCapability("platformName", device.getDeviceProductName());
        capabilities.setCapability(CapabilityType.VERSION, device.getProductVersion());
        capabilities.setCapability("deviceName", device.getModelNumber());
//        capabilities.setCapability("app",System.getProperty("user.dir") +"APK");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("fullReset", false);
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("appWaitActivity","*");

        return capabilities;
    }

}
