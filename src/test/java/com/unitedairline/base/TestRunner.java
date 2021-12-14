package com.unitedairline.base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"},
        features = {"src/test/resources/features"},
        glue = {"com/unitedairline"},
        tags = "@test",
        dryRun = false

)
public class TestRunner extends AbstractTestNGCucumberTests{


}
