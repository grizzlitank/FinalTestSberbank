package ru.arkhipov.basetest.steps;

import io.qameta.allure.Step;
import ru.arkhipov.basetest.pages.HousePage;
import ru.arkhipov.basetest.pages.MainPage;

public class HouseStep {

    @Step("выбран пункт Рассчитать")
    public void calculate(){
        new HousePage().calculate();
    }
}
