/*
 * @Author Mahesh Ambati
 */
package com.sample.stepdefinitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.sample.steps.NavigationSteps;
import com.sample.steps.SampleSteps;

import net.thucydides.core.annotations.Steps;

/**
 * The Class SampleScenarioSteps.
 */
public class SampleScenarioSteps {

	/** The navigation steps. */
	@Steps
	NavigationSteps navigationSteps;

	/** The sample steps. */
	@Steps
	SampleSteps sampleSteps;

	/**
	 * Given goto
	 */
	@Given("Goto")
	public void givenGoto() {
		navigationSteps.navigateToApplication();
	}

	/**
	 * When click the.
	 */
	@When("Click")
	public void whenClickThe() {
		sampleSteps.clickRecentWinner();
	}

	/**
	 * Then verify the
	 */
	@Then("Verify")
	public void thenVerify() {
		sampleSteps.verifyingRecentWinnerNames();
	}

}
