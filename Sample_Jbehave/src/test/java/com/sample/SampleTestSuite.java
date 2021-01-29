/*
 * @Author Mahesh Ambati
 */
package com.sample;

import java.util.Arrays;
import java.util.List;

import net.serenitybdd.jbehave.SerenityStories;

/**
 * The Class SampleTestSuite.
 */
public class SampleTestSuite extends SerenityStories {

	/**
	 * Instantiates a new sample test suite.
	 */
	public SampleTestSuite() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.serenitybdd.jbehave.SerenityStories#storyPaths()
	 */
	@Override
	public List<String> storyPaths() {
		return Arrays.asList("stories/SampleProject/Sample/Sample.story",
				"stories/SampleProject/Sample/SampleAPI.story");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jbehave.core.junit.JUnitStories#run()
	 */
	@Override
	public void run() {
		super.run();
	}
}