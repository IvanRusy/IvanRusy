package org.example.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest{

    @Test
    public void frameTest(){
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(getFromProperties("frameUrl"));
//        String uiVision  = driver.getWindowHandle();
//        driver.switchTo().window("UI Test Automation Playground");
//        String playgroundHandle = driver.getWindowHandle();
//
//        Set<String> windowHandles = driver.getWindowHandles();
//        driver.switchTo().window(uiVision);
//        driver.switchTo().frame(0);
//        driver.switchTo().defaultContent();
            driver.switchTo().frame(0).findElement(framesPage.frame1Input).sendKeys("This is frame 1");
            driver.switchTo().defaultContent();
            driver.switchTo().frame(1).findElement(framesPage.frame1Input2).sendKeys("This is frame 2");
            driver.switchTo().defaultContent();
            driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
            driver.findElement(framesPage.frame1Input3).sendKeys("This is frame 3");

   //     driver.switchTo().window();
    }
}
