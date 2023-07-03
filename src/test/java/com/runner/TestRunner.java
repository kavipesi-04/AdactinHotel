package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src\\test\\resources\\Features",glue={"com.step","com.Hooks"},dryRun=false,
tags="@valid")
public class TestRunner extends AbstractTestNGCucumberTests{

	
	
}
