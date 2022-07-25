package Gun09;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_Proje extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement signIn= driver.findElement(By.id("session_email"));
        signIn.sendKeys("proje1@gmail.com");

        WebElement password= driver.findElement(By.id("session_password"));
        password.sendKeys("123456");

        WebElement signButton=driver.findElement(By.name("commit"));
        signButton.click();

        WebElement adressclick=driver.findElement(By.xpath("//*[contains(@data-test,'addresses')]"));
        adressclick.click();

        WebElement newAdressClick=driver.findElement(By.xpath("//*[contains(@data-test,'create')]"));
        newAdressClick.click();

        WebElement adressName=driver.findElement(By.name("address[first_name]"));
        adressName.sendKeys("Fernando");

        WebElement adressLastName=driver.findElement(By.name("address[last_name]"));
        adressLastName.sendKeys("Torres");

        WebElement adressOne=driver.findElement(By.name("address[address1]"));
        adressOne.sendKeys("Anfield Rd");

        WebElement adressSecond=driver.findElement(By.name("address[address2]"));
        adressSecond.sendKeys("Anfield");

        WebElement adressCity=driver.findElement(By.name("address[city]"));
        adressCity.sendKeys("Liverpool");

        WebElement stateRandom=driver.findElement(By.name("address[state]"));
        stateRandom.click();

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(stateRandom).keyDown(Keys.DOWN).keyDown(Keys.DOWN).click().build();
        aksiyon.perform();

        WebElement zipCode=driver.findElement(By.name("address[zip_code]"));
        zipCode.sendKeys("L4 0TH");

        WebElement CountryClick=driver.findElement(By.name("address[country]"));
        CountryClick.click();

        WebElement dateClick=driver.findElement(By.name("address[birthday]"));
        dateClick.sendKeys("20031984");

        WebElement age=driver.findElement(By.name("address[age]"));
        age.sendKeys("36");

        WebElement webSite=driver.findElement(By.name("address[website]"));
        webSite.sendKeys("https://www.google.com/");

        WebElement phone=driver.findElement(By.name("address[phone]"));
        phone.sendKeys("8625747878");

        WebElement climbing=driver.findElement(By.cssSelector("#address_interest_climb"));
        climbing.click();

        WebElement dancing=driver.findElement(By.cssSelector("#address_interest_dance"));
        dancing.click();

        WebElement note=driver.findElement(By.name("address[note]"));
        note.sendKeys("Never Back Down");

        WebElement createAdressClick=driver.findElement(By.name("commit"));
        createAdressClick.click();

        WebElement verifyName=driver.findElement(By.cssSelector("[data-test='first_name']"));
        Assert.assertTrue(verifyName.getText().contains("Fernando"));

        WebElement verifyLastName=driver.findElement(By.cssSelector("[data-test='last_name']"));
        Assert.assertTrue(verifyLastName.getText().contains("Torres"));

        WebElement ClicktoAdress=driver.findElement(By.cssSelector("[data-test='addresses']"));
        ClicktoAdress.click();

        WebElement clickEdit=driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(6) > a"));
        clickEdit.click();


        Bekle(3);
        WebElement clearName=driver.findElement(By.id("address_first_name"));
        clearName.clear();
        clearName.sendKeys("Peter");
        Bekle(3);

        WebElement clearLastName=driver.findElement(By.name("address[last_name]"));
        clearLastName.clear();
        clearLastName.sendKeys("Crouch");

        WebElement updateAdressButton=driver.findElement(By.name("commit"));
        updateAdressButton.click();

        Bekle(2);
        WebElement verifyNameLast=driver.findElement(By.cssSelector("[data-test='first_name']"));
        Assert.assertTrue(verifyNameLast.getText().contains("Peter"));

        WebElement verifyLastNameLast=driver.findElement(By.cssSelector("[data-test='last_name']"));
        Assert.assertTrue(verifyLastNameLast.getText().contains("Crouch"));

        WebElement ClicktoAdressTwo=driver.findElement(By.cssSelector("[data-test='addresses']"));
        ClicktoAdressTwo.click();

        WebElement clickToDestroy=driver.findElement(By.linkText("Destroy"));
        clickToDestroy.click();

        driver.switchTo().alert().accept();

        WebElement verifyLastAdress=driver.findElement(By.xpath("//div[text()='Address was successfully destroyed.']"));
        Assert.assertTrue(verifyLastAdress.getText().contains("Address was successfully destroyed."));

        driver.quit();

        BekleKapat();
    }
}