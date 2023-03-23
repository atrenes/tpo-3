// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ChooseSubcategoriesTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void chooseSubcategories() {
    driver.get("https://www.answers.com/");
    driver.manage().window().setSize(new Dimension(1680, 951));
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/main/div[2]/a/div/span")).click();
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div[2]/div/a/div")).click();
    vars.put("url", js.executeScript("return window.location.href"));
    assertEquals(vars.get("url").toString(), "https://www.answers.com/other-math");
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div/div/a[2]")).click();
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div[2]/div[2]/a/div")).click();
    vars.put("url", js.executeScript("return window.location.href"));
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div/div/a[2]")).click();
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div[2]/div[3]/a/div")).click();
    vars.put("url", js.executeScript("return window.location.href"));
    assertEquals(vars.get("url").toString(), "https://www.answers.com/basic-math");
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div/div/div[2]/a/img")).click();
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/main/div[2]/a[2]")).click();
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div[2]/div/a/div")).click();
    vars.put("url", js.executeScript("return window.location.href"));
    assertEquals(vars.get("url").toString(), "https://www.answers.com/general-science");
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div/div/a[2]")).click();
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div[2]/div[2]/a")).click();
    vars.put("url", js.executeScript("return window.location.href"));
    assertEquals(vars.get("url").toString(), "https://www.answers.com/zoology");
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div/div/a[2]")).click();
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div[2]/div[3]/a/div")).click();
    vars.put("url", js.executeScript("return window.location.href"));
    assertEquals(vars.get("url").toString(), "https://www.answers.com/astronomy");
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div/div/div[2]/a/img")).click();
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/main/div[2]/a[3]/div")).click();
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div[2]/div/a/div")).click();
    vars.put("url", js.executeScript("return window.location.href"));
    assertEquals(vars.get("url").toString(), "https://www.answers.com/military-history");
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div/div/a[2]")).click();
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div[2]/div[2]/a/div")).click();
    vars.put("url", js.executeScript("return window.location.href"));
    assertEquals(vars.get("url").toString(), "https://www.answers.com/world-history");
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div/div/a[2]")).click();
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div[2]/div[3]/a/div")).click();
    vars.put("url", js.executeScript("return window.location.href"));
    assertEquals(vars.get("url").toString(), "https://www.answers.com/us-history");
  }
}
