package folderr;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class class123 {

    @Test
    public void testSearch()
    {
        WebDriver D= new ChromeDriver();
        D.get("https://www.google.com");
        D.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("testing google website");
        D.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys(Keys.ENTER);
        Assert.assertEquals(D.getTitle(),"testing google website - Google Search");
}
    @Test
    public void testSearchfaliling()
    {
        WebDriver D= new ChromeDriver();
        D.get("https://www.google.com");
        D.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("testing google website");
        D.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys(Keys.ENTER);
       Assert.assertEquals(D.getTitle(),"testing google website - Google Search");
    }
}
