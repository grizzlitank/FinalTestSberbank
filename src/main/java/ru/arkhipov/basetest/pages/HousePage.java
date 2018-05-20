package ru.arkhipov.basetest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ru.arkhipov.basetest.steps.BaseSteps;

public class HousePage extends BasePageObject {

    @FindBy(xpath = "//*[text()='Рассчитать']")
    public WebElement calculator;


    @FindBy(xpath = "//a[text()='Закрыть предупреждение']")
    public WebElement img;



    public void calculate(){
        img.click();
        waiting(calculator);
        Actions actions = new Actions(BaseSteps.getDriver());
        actions.moveToElement(calculator).build().perform();

        calculator.click();

    }
}
