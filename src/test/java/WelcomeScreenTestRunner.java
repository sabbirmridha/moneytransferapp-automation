import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class WelcomeScreenTestRunner extends Setup {

    @Test
    public void goForRegister(){
        WelcomeScreen welcomeSc=new WelcomeScreen(driver);


        welcomeSc.goForRegister();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.widget.TextView[@text='Welcome to Wafacash!']")
        ));

        // Get the text
        String actualText = element.getText();

        System.out.println("Fetched Text: " + actualText);

        String expectedText = "Welcome to Wafacash!";
        Assert.assertEquals(actualText, expectedText, "Text did not match!");










    }
}
