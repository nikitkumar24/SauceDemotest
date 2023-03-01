import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCartTest {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='shopping_cart_container']//a[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[contains(@class,'btn btn_action')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("first-name")).sendKeys("Test");
        driver.findElement(By.name("lastName")).sendKeys("User");
        driver.findElement(By.id("postal-code")).sendKeys("24242");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[contains(@class,'submit-button btn')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("finish")).click();

        Thread.sleep(10000);
        driver.quit();

    }
}
