import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by MdKhan on 12/22/13.
 */
public class FirstTest {

    public WebDriver driver = new FirefoxDriver() ;

    public void clickMe(String url){
        url ="http://cnn.com";
        driver.get(url);


    }
}
