package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\cucufolder\\firstcucu.feature",
glue="com.stepdefinition",name ="facebook")
public class TestRunnerClass {
	
	
}
