import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

public class DavikTapesTest {
    static String DavikHomePage = "https://www.daviktapes.com/";
    private static WebDriver driver;

    @BeforeAll
    public static void setupClass() {
        driver = SharedDriverDavikTapes.getWebDriver();
        driver.get(DavikHomePage);
    }

    @AfterEach
    public void backToHomePage() {
        driver.get(DavikHomePage);
    }

    @AfterAll
    public static void classTearDown() {
        SharedDriverDavikTapes.closeDriver();
    }
@Test
public void waitTest(){
        driver.get(DavikHomePage);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text() = 'Home']")));
}
    @Test
    public void companyElementTest() {
        driver.get(DavikHomePage);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text() = 'Home']")));

        WebElement companyElement = driver.findElement(By.xpath("//*[text() = 'Company']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(companyElement).build().perform();
        assertNotNull(companyElement);
    }
    @Test
    public void productsElementTest() {
        driver.get(DavikHomePage);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text() = 'Home']")));

        WebElement productsElement = driver.findElement(By.xpath("//*[text() = 'Company']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(productsElement).build().perform();
        assertNotNull(productsElement);
    }
    @Test
    public void knowledgeCentreTest() {
        driver.get(DavikHomePage);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text() = 'Home']")));

        WebElement knowledgeCentreElement = driver.findElement(By.xpath("//*[text() = 'Company']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(knowledgeCentreElement).build().perform();
        assertNotNull(knowledgeCentreElement);
    }

    @Test
    public void industriesElementTest() {
        driver.get(DavikHomePage);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text() = 'Home']")));

        WebElement industriesElement = driver.findElement(By.xpath("//*[text() = 'Company']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(industriesElement).build().perform();
        assertNotNull(industriesElement);
    }

    @Test
    public void contactTest() {
        driver.get(DavikHomePage);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text() = 'Home']")));

        WebElement contactElement = driver.findElement(By.xpath("//*[text() = 'Company']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(contactElement).build().perform();
        assertNotNull(contactElement);
    }

}
