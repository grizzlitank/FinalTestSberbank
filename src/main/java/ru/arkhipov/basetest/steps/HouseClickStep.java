package ru.arkhipov.basetest.steps;

import io.qameta.allure.Step;
import ru.arkhipov.basetest.pages.HouseClickPage;
import ru.arkhipov.basetest.pages.HousePage;

public class HouseClickStep {

    @Step("заголовок соответствует")
    public void checkTitle(){
        new HouseClickPage().check();
    }

    @Step("поле {field} заполняется значением {value}")
    public void fillField(String field, String value) {
        new HouseClickPage().fillField(field, value);
    }

    @Step("поле {field} имеет значение {value}")
    public void checkField(String field, String value) {
        new HouseClickPage().checkField(field, value);
    }
}
