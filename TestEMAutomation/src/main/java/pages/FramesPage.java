package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FramesPage extends BasePage{

    public By frame1Input = By.xpath("//input[@name  = 'mytext1']");
    public By frame1Input2 = By.xpath("//input[@name  = 'mytext2']");
    public By frame1Input3 = By.xpath("//input[@name  = 'mytext3']");
    public By frame1Input4 = By.xpath("//input[@name  = 'mytext4']");
    public By frame1Input5 = By.xpath("//input[@name  = 'mytext5']");

    public void getFrameNyIndex(int frameIndex){
        driver.switchTo().frame(frameIndex);
    }

    public FramesPage(WebDriver driver){
        super(driver);
    }
}
