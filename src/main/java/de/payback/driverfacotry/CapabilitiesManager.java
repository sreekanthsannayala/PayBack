package de.payback.driverfacotry;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.util.Properties;

public class CapabilitiesManager {
   // TestUtils utils = new TestUtils();

    public DesiredCapabilities getCaps() throws IOException {

        Properties props = new PropertyManager().getProps();

        try{
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, props.getProperty("platformName"));
            caps.setCapability(MobileCapabilityType.UDID, props.getProperty("deviceID"));
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, props.getProperty("deviceName"));
            //caps.setCapability("fullReset", props.getProperty("fullReset"));
            caps.setCapability(MobileCapabilityType.NO_RESET,props.getProperty("noReset") );
            caps.setCapability("–session-override",true);

            switch(props.getProperty("platformName")) {
                case "Android":
                    caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, props.getProperty("os_version"));
                     caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("androidAutomationName"));
                     caps.setCapability("appPackage", props.getProperty("androidAppPackage"));
                     caps.setCapability("appActivity", props.getProperty("androidAppActivity"));
                    String app_path = System.getProperty("user.dir");
                    String androidAppUrl = app_path + "//App_Path//de.payback.client.android_2022-05-20.apk";

                    caps.setCapability("app", androidAppUrl);
                    break;

            }
            return caps;
        } catch(Exception e){
            e.printStackTrace();

            throw e;
        }
    }
}
