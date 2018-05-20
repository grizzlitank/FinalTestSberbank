package ru.arkhipov.basetest.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.qameta.allure.Step;
import ru.arkhipov.basetest.pages.HouseClickPage;

import java.util.List;


public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();

    HouseStep houseStep = new HouseStep();

    HouseClickStep houseClickStep = new HouseClickStep();




    @When("^выбрана вкладка$")
    public void selectStep(){
        mainPageSteps.select();
    }

    @When("^выбран пункт Рассчитать$")
    public void calculateStep(){
        houseStep.calculate();
    }

    @Then("^заголовок соответствует$")
    public void checkTitle(){
        houseClickStep.checkTitle();
    }

    @When("^заполняются поля:$")
    public void fillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> houseClickStep.fillField(field, value));

    }

    @Then("^поля имеют значения:$")
    public void checkForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> houseClickStep.checkField(field, value));

    }











}
