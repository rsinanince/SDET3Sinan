package Gun14;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _Senaryo_01 extends BaseStaticDriver {
    public static void main(String[] args) {

//        SCENARIO 1:
//        -Navigate to "https://shopdemo.e-junkie.com/”
//                -Click on 'Add to Cart' for 'Demo eBook'
//                -Validate cart item no is '1'
//                -Click on 'Remove' button to remove item from your cart
//                -Click on 'Continue Shopping'
//                -Validate cart item no is '0'

        driver.get("https://shopdemo.e-junkie.com");

        WebElement demoEbook=driver.findElement(By.xpath("//div[@class='thumbnail'and @style='background-image: url(https://s3.amazonaws.com/static.e-junkie.com/products/thumbnails/1597355.png); border-radius: 4px 4px 0px 0px;']"));
        demoEbook.click();

        WebElement sepeteEkle=driver.findElement(By.cssSelector("[class='g_btn']"));
        sepeteEkle.click();

       // driver.switchTo().frame(3);
//
//        WebElement promosyonEkle=driver.findElement(By.xpath("//button[@class='Apply-Button Show-Promo-Code-Button']"));
//        promosyonEkle.click();

        BekleKapat();






    }
}
