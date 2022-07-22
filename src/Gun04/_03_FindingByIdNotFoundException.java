package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techno.study/");

        try {
            WebElement eleman = driver.findElement(By.id("label_"));
            System.out.println(eleman.getText());
        }
        catch (Exception ex){
            System.out.println("Eleman bulunamadı " + ex.getMessage());
        }

        Thread.sleep(3000);
        driver.quit();


    }
}
