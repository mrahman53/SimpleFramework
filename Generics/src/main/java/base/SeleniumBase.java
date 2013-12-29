package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by MdKhan on 12/29/13.
 */
public class SeleniumBase {
    public WebDriver driver = new FirefoxDriver();

 public void OpenWebpage(){
     driver.get("http://cnn.com");
 }
}
