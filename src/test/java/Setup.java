import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Setup {

    protected AndroidDriver driver; // class level driver
    // AndroidDriver driver;
    @BeforeTest

    public AndroidDriver setup() throws MalformedURLException {

        //

        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("platformName","android");
        caps.setCapability("platformVersion","12");
        caps.setCapability("appPackage","com.paytop.wafacash");
        caps.setCapability("appActivity","com.paytop.wafacash.MainActivity");
        caps.setCapability("app","E:\\automationapk\\Wafa\\Wafa-Test-v1.2.9-b210.apk");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("uiautomator2ServerInstallTimeout","60000");

        URL url= new URL("http://127.0.0.1:4723");
        //AndroidDriver driver=new AndroidDriver(url,caps);
        driver=new AndroidDriver(url,caps);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        return driver;
    }



    // @AfterTest

    public void closeApp(){
        driver.quit();

    }
}
