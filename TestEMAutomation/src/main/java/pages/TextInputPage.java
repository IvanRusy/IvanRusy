package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import static com.codeborne.selenide.Selenide.$x;

public class TextInputPage extends BasePage{

    private final SelenideElement inputText = $x("//input[@id='newButtonName']");
    private final SelenideElement button = $x("//button[@id='updatingButton']");

    public TextInputPage(WebDriver driver) {
        super(driver);
    }

    public String setText(String textToType){
        inputText.sendKeys(textToType);
        button.click();
        return textToType;
    }

    public String getTextFromButton(){
        return button.getText();

    }
}
