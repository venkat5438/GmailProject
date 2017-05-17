package capturescreenshot;

import features.AutoConstants;
import features.AutoUtils;
import features.PropHandlerz;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

/**
 * Created by breddy on 12-05-2017.
 */
public class ScreenShot  {
WebDriver driver;
    @Test
    public void captureScreenShot() throws IOException {

        driver=new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get(PropHandlerz.fetchProp(AutoConstants.URL.FURL));
        AutoUtils.captureScreenShot(driver,"facebook");


        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("venkatram");
        AutoUtils.captureScreenShot(driver,"unamescreenshot");






        driver.quit();




    }
}
