package Gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _04_WaitSoru extends BaseStaticDriver {
    public static void main(String[] args) {
        /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

        driver.get("https://www.demoblaze.com/index.html");

        WebElement s6= driver.findElement(By.linkText("Samsung galaxy s6"));
        s6.click();

        WebElement addToCart= driver.findElement(By.linkText("Add to cart"));
        addToCart.click();

        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        WebElement homePage= driver.findElement(By.id("nava"));
        homePage.click();

        BekleKapat();

    }
}
