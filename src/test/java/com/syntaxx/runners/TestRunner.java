package com.syntaxx.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", //need to give a path for our feature files 
                 glue = "com/hrms/stepDefinitions", //we need to glue our step definition - implementation
                 dryRun = false, //when set as true, will run over the feature steps and identify the missing implementation
                 monochrome = true, //when set as true, will format the console outcome
                 tags = "@Dependents",
                 strict = false, //when set as true, will fail the execution when undefined step is found
                 plugin = {"pretty",  //will print steps inside the console
                           "html:target/cucumber-default-report", //generates default html report
                           "rerun:target/FailedTest.txt", //generates a txt file only with failed test
                           "json:target/cucumber.json"} //generates a json reports
) 
public class TestRunner {

}
