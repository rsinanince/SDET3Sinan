package Gun11;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class _04_Soru extends BaseStaticDriver {
    public static void main(String[] args) {

        /*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
 */

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        WebElement firstNo = driver.findElement(By.id("number1Field"));
        double RandomNo1= Math.random();
        firstNo.sendKeys(""+RandomNo1);

//        WebElement firstNumber = driver.findElement(By.id("number1Field"));
//        int i = (int)(Math.random()100);
//        firstNumber.sendKeys(""+i);

        WebElement secondNo = driver.findElement(By.id("number2Field"));
        double RandomNo2= Math.random();
        secondNo.sendKeys(""+RandomNo2);

//        WebElement secondNumber=driver.findElement(By.id("number2Field"));
//        int b= (int)(Math.random());
//        secondNumber.sendKeys(""+b);

        WebElement ddMenu = driver.findElement(By.id("selectOperationDropdown"));
        Select menu = new Select(ddMenu);
        menu.selectByVisibleText("Add");

        WebElement calculateButton= driver.findElement(By.id("calculateButton"));
        calculateButton.click();

        WebElement answerField= driver.findElement(By.id("numberAnswerField"));
        //double answer=answerField.;

        Assert.assertEquals((RandomNo1+RandomNo2), answerField);






    }
}