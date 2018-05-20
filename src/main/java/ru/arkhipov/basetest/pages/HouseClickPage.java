package ru.arkhipov.basetest.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ru.arkhipov.basetest.steps.BaseSteps;

import java.util.ArrayList;

public class HouseClickPage extends BasePageObject{

    @FindBy(xpath = "//span[@class='hideOnMobile___1nUR']")
    public WebElement title1;

    @FindBy(xpath = "//span[@class='titleTextMobile___25bv']")
    public WebElement title2;

    @FindBy(xpath = "//div[text()='Цель кредита']/ancestor::div[@class='dcCalc_input-row-desktop']//input[@class='dcCalc_textfield__input']")
    public WebElement typeFlat;

    @FindBy(xpath = "//span[text()='Первоначальный']/ancestor::div[@class='dcCalc_input-row-desktop']//input")
    public WebElement startPrice;


    @FindBy(xpath = "//span[text()='Стоимость']/ancestor::div[@class='dcCalc_input-row-desktop']//input")
    public WebElement inputPrice;

    @FindBy(xpath = "//span[text()='Срок']/ancestor::div[@class='dcCalc_input-row-desktop']//input")
    public WebElement period;


    @FindBy(xpath = "//div[text()='Страхование жизни']/ancestor::div[@class='dcCalc_switch-desktop']//span[@class='dcCalc_switch__icon-on']")
    public WebElement insurance;

    @FindBy(xpath = "//div[text()='Скидка от застройщика']/ancestor::div[@class='dcCalc_switch-desktop']//span[@class='dcCalc_switch__icon-on']")
    public WebElement sale;


    @FindBy(xpath = "//div[text()='Сумма кредита']/parent::div//span[@data-test-id='amountOfCredit']")
    public WebElement amountOfCredit;

    @FindBy(xpath = "//div[text()='Ежемесячный платеж']/parent::div[@class='dcCalc_result-calculation']//span[@data-test-id='monthlyPayment']")
    public WebElement monthlyPayment;

    @FindBy(xpath = "//div[text()='Необходимый доход']/parent::div[@class='dcCalc_result-calculation']//span[@data-test-id='requiredIncome']")
    public WebElement requiredIncome;

    @FindBy(xpath = "//div[text()='Процентная ставка']/parent::div[@class='dcCalc_result-calculation']//span[@data-test-id='rate']")
    public WebElement rate;

    public void check(){
        ArrayList tabs2 = new ArrayList(BaseSteps.getDriver().getWindowHandles());
        BaseSteps.getDriver().switchTo().window(String.valueOf(tabs2.get(1)));

        Assert.assertEquals("Заголовок соответствует", "Онлайн консультация и", title1.getText());
        Assert.assertEquals("Заголовок соответствует", "одобрение ипотеки без визита в офис банка", title2.getText());
    }

    public void fillField(String fieldName, String value){
        switch (fieldName){
            case  "Цель кредита":
                waiting(typeFlat);
                typeFlat.click();
                waiting(BaseSteps.getDriver().findElement(By.xpath("//*[text()='" + value + "']")));
                BaseSteps.getDriver().findElement(By.xpath("//*[text()='" + value + "']")).click();
                break;
            case  "Стоимость недвижимости":
                fillField(inputPrice, value);
                break;
            case  "Первоначальный взнос":
                fillField(startPrice, value);
                break;
            case  "Срок кредитования":
                fillField(period, value);
                break;
            case  "Страхование жизни":
                if(value.equals("нет"))insurance.click();
                break;
            case  "Скидка от застройщика":
                if(value.equals("нет"))sale.click();
                break;
            default:  throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
        }
    }

    public void checkField(String fieldName, String value){
        switch (fieldName){
            case  "Сумма кредита":
                waiting("//div[text()='Сумма кредита']/parent::div//span[@data-test-id='amountOfCredit']", value + " \u20BD");
                Assert.assertEquals("Поле верно", value + " \u20BD", amountOfCredit.getText());
                break;
            case  "Ежемесячный платеж":
                waiting("//div[text()='Ежемесячный платеж']/parent::div//span[@data-test-id='monthlyPayment']", value + " \u20BD");
                Assert.assertEquals("Поле верно", value + " \u20BD", monthlyPayment.getText());
                break;
            case  "Необходимый доход":
                waiting("//div[text()='Необходимый доход']/parent::div//span[@data-test-id='requiredIncome']", value + " \u20BD");
                Assert.assertEquals("Поле верно", value + " \u20BD", requiredIncome.getText());
                break;
            case  "Процентная ставка":
                waiting("//div[text()='Процентная ставка']/parent::div//span[@data-test-id='rate']", value + " %");
                Assert.assertEquals("Поле верно", value + " %", rate.getText());
                break;
            default:  throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
        }
    }




}
