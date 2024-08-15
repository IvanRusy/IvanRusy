package org.example.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.Set;

public class FrameTest extends BaseTest{

    @Test
    public void frameTest(){
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(getFromProperties("frameUrl"));
        Set<String> windowHandles = driver.getWindowHandles();
        driver.switchTo().window(windowHandles.toArray()[0].toString());
        driver.switchTo().window(windowHandles.toArray()[1].toString());


            driver.switchTo().frame(0).findElement(framesPage.frame1Input).sendKeys("This is frame 1");
            driver.switchTo().defaultContent();
            driver.switchTo().frame(1).findElement(framesPage.frame1Input2).sendKeys("This is frame 2");
            driver.switchTo().defaultContent();
            driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
            driver.findElement(framesPage.frame1Input3).sendKeys("This is frame 3");
        driver.switchTo().frame(3).findElement(framesPage.frame1Input4).sendKeys("Это фрейм 4");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(4).findElement(framesPage.frame1Input5).sendKeys("Это фрейм 5");

    }
}
