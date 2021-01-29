/*
 * @Author Mahesh Ambati
 */
package com.sample.steps;

import java.io.File;

import org.jbehave.core.annotations.BeforeStory;

import com.sample.utilities.AppConfigLoader;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * The Class NavigationSteps.
 */
public class NavigationSteps extends ScenarioSteps {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Navigate to application.
	 */
	@Step
	public void navigateToApplication() {
		getDriver().manage().window().maximize();
		getDriver().get(AppConfigLoader.getInstance().sampleURL);
	}

	@BeforeStory
	public void browserStack_config() {

		try {
			String absolute_path = System.getProperty("user.dir");
			ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "StartBrowserStack.bat");
			File dir = new File(absolute_path + "\\src\\test\\resources\\browserdrivers");
			pb.directory(dir);
			pb.start();
			Thread.sleep(10000);
			System.out.println("browserstack");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
