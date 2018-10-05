package com.RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features="Features"	,
	
	glue={"com.testcases"},
	
	plugin={"html:Test.html","json:Test.json"},
	
	monochrome=true,
	
	tags={"@Regressiontest"},
			
	strict=true
	
		

)


public class RunnerClass 
{

}
