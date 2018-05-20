package ru.arkhipov.basetest.util;


import gherkin.formatter.model.Result;
import io.qameta.allure.cucumberjvm.AllureCucumberJvm;
import ru.arkhipov.basetest.steps.BaseSteps;


public class AllureReporter extends AllureCucumberJvm {

    @Override
    public void result(final Result result) {
        if (result.getStatus().equals("failed")){
            BaseSteps.takeScreenshot();
        }
        super.result(result);
    }


}



