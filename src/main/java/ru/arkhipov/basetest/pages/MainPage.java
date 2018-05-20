package ru.arkhipov.basetest.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ru.arkhipov.basetest.steps.BaseSteps;


public class MainPage extends BasePageObject{


    @FindBy(xpath = "//div[@class='sbrf-div-list-inner --area bp-area header_more_nav']//span[contains(text(), 'кредит')]")
    WebElement takeCredit;

    @FindBy(xpath = ".//*[text()='Приобретение готового жилья']")
    WebElement getHouse;






    public void select(){
        Actions actions = new Actions(BaseSteps.getDriver());
        actions.moveToElement(takeCredit).build().perform();
        waiting(getHouse);
        getHouse.click();
    }








}


