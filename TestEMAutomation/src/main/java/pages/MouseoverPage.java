package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseoverPage extends BasePage {
    private final Actions actions = new Actions(driver);
    private final By clickCount = By.xpath("//div//p//span[@id='clickCount']");
    private final By linkClick = By.xpath("//div//a[text()='Click me']");
    public MouseoverPage(WebDriver driver){super(driver);}

    public String getCountOfClick(){
        return driver.findElement(clickCount).getText();
    }
    public void doubleClicker(int countOfDoubleClicks){
        for (int i = 0; i<countOfDoubleClicks; i++) {
            actions.moveToElement(driver.findElement(linkClick)).doubleClick().build().perform();
        }
    }


}
