package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    String linkPattern = "//h3/a[text()=%s']";

    private final By textInput = By.xpath("//h3/a[text()='Text Input']");
    private final By hiddenLayer = By.xpath("//h3/a[text()='Hidden Layers']");



    public void getTestDirectory(Links targetLinks){
        driver.findElement(By.xpath(String.format(linkPattern, targetLinks.linkValue))).click();
    }

    public HomePage(WebDriver driver){
        super(driver);
    }

   public enum Links{
        TEXT_INPUT("Text Input");

       final String linkValue;

       Links(String s) {
           linkValue = s;
       }
   }
}
