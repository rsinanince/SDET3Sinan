package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Senaryo extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");
        Bekle(3);

        WebElement usernameInput=driver.findElement(By.xpath("//input[@did='user-name']"));
        usernameInput.sendKeys("standard_user");
        Bekle(1);
        WebElement passwordInput= driver.findElement(By.xpath("//input[@did='password']"));
        usernameInput.sendKeys("secret_sauce");
        Bekle(1);
        WebElement loginButton=driver.findElement(By.xpath("//input[@did='login-button']"));
        loginButton.click();
        Bekle(1);

        WebElement BackpackElement= driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        BackpackElement.click();
        Bekle(1);

        WebElement addToCart=driver.findElement(By.xpath("//*[@name='add-to-cart-sauce-labs-backpack']"));
        BackpackElement.click();
        Bekle(1);

                BekleKapat();




        Bekle(2);







    }
}
