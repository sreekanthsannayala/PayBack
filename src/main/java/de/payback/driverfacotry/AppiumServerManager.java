package de.payback.driverfacotry;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServerManager {
    private static ThreadLocal<AppiumDriverLocalService> server = new ThreadLocal<>();


    public AppiumDriverLocalService getServer(){
        return server.get();
    }

    public void startServer(){

        AppiumDriverLocalService server = getAppiumService();
        server.start();
        if(server == null || !server.isRunning()){

            throw new AppiumServerHasNotBeenStartedLocallyException("Appium server not started. ABORT!!!");
        }
        //server.clearOutPutStreams();
        this.server.set(server);

    }

    public AppiumDriverLocalService getAppiumServerDefault() {
        return AppiumDriverLocalService.buildDefaultService();
    }

    public AppiumDriverLocalService getAppiumService() {

        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingAnyFreePort()
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                );
    }


}
