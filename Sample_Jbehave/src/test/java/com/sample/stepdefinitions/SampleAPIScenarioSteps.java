/*
 * @Author Mahesh Ambati
 */
package com.sample.stepdefinitions;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.sample.steps.SampleApiSteps;

import net.thucydides.core.annotations.Steps;

/**
 * The Class SampleAPIScenarioSteps.
 */
public class SampleAPIScenarioSteps {

	/** The sample api steps. */
	@Steps
	SampleApiSteps sampleApiSteps;

	/**
	 * When get
	 */
	@When("Get")
	public void whenGetThe() {
		sampleApiSteps.callActive();
	}

	/**
	 * Then verify
	 */
	@Then("Verify")
	public void thenVerifyThe() {
		sampleApiSteps.verifyActiveSegments();
	}
}
