package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition", dryRun = false, snippets = SnippetType.CAMELCASE, strict = true, tags = {
		"@page5" }, plugin = { "html:C:\\Users\\ELCOT\\eclipse-workspace\\StarThreeSixty\\AllReports\\htmlreport",
				"json:C:\\Users\\ELCOT\\eclipse-workspace\\StarThreeSixty\\AllReports\\jsonreport\\star.json",
				"junit:C:\\Users\\ELCOT\\eclipse-workspace\\StarThreeSixty\\AllReports\\junitreport\\stars.xml"
				,"rerun:C:\\Users\\ELCOT\\eclipse-workspace\\StarThreeSixty\\ReRun\\failed.txt"})
public class TestRunner {
	@AfterClass
	public static void report() {
		JVMReport.generateJvmReport(System.getProperty("user.dir") + "\\AllReports\\jsonreport\\star.json");
	}
}
