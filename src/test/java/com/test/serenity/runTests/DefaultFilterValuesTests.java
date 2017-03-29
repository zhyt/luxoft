package com.test.serenity.runTests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features/defaultValues" },
        glue = { "com.test.serenity.stepDefinitions.defaulFilterValues" })
public class DefaultFilterValuesTests {
}
