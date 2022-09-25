package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@RerunFailedScenario\\failed.text",glue = "org.stepdefinition",plugin = {"rerun:C:\\Users\\ELCOT\\eclipse-workspace\\StarThreeSixty\\ReRun\\failed.txt"})

public class TestReRunner {

}
