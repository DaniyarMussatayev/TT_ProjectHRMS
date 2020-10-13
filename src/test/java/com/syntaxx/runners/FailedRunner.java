package com.syntaxx.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/FailedTest.txt", //need to give a path for our feature files 
                 glue = "com/hrms/stepDefinitions", //we need to glue our step definition - implementation
                 monochrome = true, //when set as true, will format the console outcome
                 plugin = {"pretty",  //will print steps inside the console
                           "html:target/cucumber-default-report",//generates default html report
                           "rerun:target/FailedTest.txt"} 
                       
                           )  

public class FailedRunner {

}
