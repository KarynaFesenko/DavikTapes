import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedDriverDavikTapes {
    String DavikHomePage = "https://www.daviktapes.com/";
    public static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }
    

    public static void closeDriver() {
        if (webDriver != null) {
            webDriver.close();
        }
    }
}
