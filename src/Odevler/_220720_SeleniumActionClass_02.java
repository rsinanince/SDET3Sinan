package Odevler;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

//Ödev 2 : http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
//         buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.

public class _220720_SeleniumActionClass_02 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        WebElement teamA= driver.findElement(By.id("box1"));
        WebElement teamB= driver.findElement(By.id("box2"));
        WebElement teamC= driver.findElement(By.id("box3"));
        WebElement teamD= driver.findElement(By.id("box4"));
        WebElement teamE= driver.findElement(By.id("box5"));

        WebElement studentA= driver.findElement(By.id("node1"));
        WebElement studentB= driver.findElement(By.id("node2"));
        WebElement studentC= driver.findElement(By.id("node3"));
        WebElement studentD= driver.findElement(By.id("node4"));
        WebElement studentE= driver.findElement(By.id("node5"));
        WebElement studentF= driver.findElement(By.id("node6"));
        WebElement studentG= driver.findElement(By.id("node7"));
        WebElement studentH= driver.findElement(By.id("node8"));
        WebElement studentI= driver.findElement(By.id("node9"));
        WebElement studentJ= driver.findElement(By.id("node10"));
        WebElement studentK= driver.findElement(By.id("node11"));
        WebElement studentL= driver.findElement(By.id("node12"));
        WebElement studentM= driver.findElement(By.id("node13"));
        WebElement studentN= driver.findElement(By.id("node14"));
        WebElement studentO= driver.findElement(By.id("node15"));
        WebElement studentP= driver.findElement(By.id("node16"));
        WebElement studentQ= driver.findElement(By.id("node17"));
        WebElement studentR= driver.findElement(By.id("node18"));
        WebElement studentS= driver.findElement(By.id("node19"));
        WebElement studentT= driver.findElement(By.id("node20"));
        WebElement studentU= driver.findElement(By.id("node21"));

        Actions aksiyonlar=new Actions(driver);

        Action
        aksiyon = aksiyonlar.clickAndHold(studentA).moveToElement(teamA).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentB).moveToElement(teamA).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentC).moveToElement(teamA).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentD).moveToElement(teamA).release().build();

        aksiyon = aksiyonlar.clickAndHold(studentE).moveToElement(teamB).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentF).moveToElement(teamB).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentG).moveToElement(teamB).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentH).moveToElement(teamB).release().build();

        aksiyon = aksiyonlar.clickAndHold(studentI).moveToElement(teamC).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentJ).moveToElement(teamC).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentK).moveToElement(teamC).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentL).moveToElement(teamC).release().build();

        aksiyon = aksiyonlar.clickAndHold(studentM).moveToElement(teamD).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentN).moveToElement(teamD).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentO).moveToElement(teamD).release().build();

        aksiyon = aksiyonlar.clickAndHold(studentP).moveToElement(teamE).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentQ).moveToElement(teamE).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentR).moveToElement(teamE).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentS).moveToElement(teamE).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentT).moveToElement(teamE).release().build();
        aksiyon = aksiyonlar.clickAndHold(studentU).moveToElement(teamE).release().build();

        aksiyon.perform();

        Bekle(3);
        BekleKapat();

    }
}