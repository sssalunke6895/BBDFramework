package com.bbd.BBDFramework.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty",
				"html:target/cucmber-reports/cucumber.html",
				"html:target/cucmber-reports/cucumber.json"		
		},
		features = "../BBDFramework/resources/features/"
		,glue={"com.bbd.BBDFramework.stepDefination"}
		)
public class TestRunner {

}
