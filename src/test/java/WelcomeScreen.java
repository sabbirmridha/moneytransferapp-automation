import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeScreen {



    @FindBy(xpath ="//android.widget.ImageView")
    WebElement clkImageView;


    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Login/Register']")
    WebElement btnRegister;






    public WelcomeScreen(AndroidDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public void goForRegister(){
        clkImageView.click();
        btnRegister.click();

    }


}
