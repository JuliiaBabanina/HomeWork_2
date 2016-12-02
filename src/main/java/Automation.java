import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;


public class Automation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/ТЕСТИРОВАНИЕ/Инструменты/Для АВТОМАТИЗАЦИИ/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get ("http://www.bing.com/");

        WebElement queryInput = driver.findElement(By.name("q"));

        queryInput.sendKeys("automation");
        queryInput.submit();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        System.out.println("Page title is: " + driver.getTitle());

        List<WebElement> headings = driver.findElements(By.className("b_title"));

        for (WebElement h: headings) {
            WebElement resultTitle = h.findElement(By.tagName("h2"));
            System.out.println(resultTitle.getText());
        }

        driver.quit();
    }

}
