import features.AutoConstants;
import features.PropHandlerz;
import org.openqa.selenium.WebDriver;


public class DriverClass {

    public static WebDriver driver;

public void openBrowser(String browser){
    if(browser.equals("chrome"))
    {
        System.setProperty("webdriver.gecko.driver","C://Users//breddy//Downloads//geckodriver-v0.16.1-win64//geckodriver.exe");
       // DesiredCapabilities capabilities= DesiredCapabilities.chrome();
       // capabilities.setCapability("chintu",true);
       // driver=new ChromeDriver(capabilities);
        driver.get(PropHandlerz.fetchProp(AutoConstants.URL.URL));
    }

else{

        System.out.println("browser mismatch");
    }


}

public void closeBrowser(){

    driver.quit();
}



}
