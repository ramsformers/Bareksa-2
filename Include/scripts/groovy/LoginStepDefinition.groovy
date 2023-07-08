import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class LoginStepDefinition {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	
	/* TC1 */
	@Given("I am on the login page")
	def I_am_on_the_login_page() {
		/* println "I am on the login page" */
		Mobile.startApplication('C:\\Users\\dela\\Downloads\\com.bareksa.app_3.4.0-342_minAPI21(arm64-v8a,armeabi-v7a,x86,x86_64)(nodpi)_apkmirror.com.apk',
			true)
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - Login'), 0)
	}
	
	@When("I enter a valid (.*)")
	def I_enter_a_valid_username(String username) {
		/* println username */
		Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Contoh emailgmail.com'), username, 0)
		
	}
	
	@And("a valid (.*)")
	def a_valid_password(String password) {
		/*println password */
		Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Masukkan Password'), password, 0)
	}

	@And("I click the login button")
	def I_click_the_login_button() {
		/*println "I click the login button"*/
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - Login (1)'), 0)
	}
	
	@Then("I should be logged in successfully")
	def I_should_be_logged_in_successfully() {
		/* println "I should be logged in successfully" */
		/* Mobile.closeApplication() */
	}
	
	/*TC2*/
	@Given("I am on the login page")
	def I_am_on_the_login_page1() {
		println "I am on the login page"
	}
	
	@When("I enter a valid (.*)")
	I_enter_a_valid_username()
	
	@And("an invalid password")
	def an_invalid_password() {
		println "an invalid password"
	}
	
	@Then("I click the login button")
	I_click_the_login_button()
	
	@Then("I should see an error message")
	def I_should_see_an_error_message() {
		println "I should see an error message"
	}
	
	/*TC3*/
	@Given("I am on the login page")
	def I_am_on_the_login_page2() {
		println "I am on the login page"
	}
	
	@When("I enter a invalid (.*)")
	I_enter_a_valid_username()
	
	@And("an invalid password")
	def an_invalid_password() {
		println "an invalid password"
	}
	
	@Then("I click the login button")
	I_click_the_login_button()
	
	@Then("I should see an error message")
	def I_should_see_an_error_message() {
		println "I should see an error message"
	}
	
	@Then("I should see an error message")
	def I_should_see_an_error_message() {
		println "Error message displayed"
	}
	
	@When("I enter an invalid (.*)")
	def I_enter_an_invalid_username(String username) {
		println "Entering invalid username: $username"
	}
	
	@When("I enter an invalid (.*)")
	def I_enter_an_invalid_password(String password) {
		println "Entering invalid username: $password"
	}
	
	@When("I leave the (.*) blank")
	def I_leave_the_field_blank(String field) {
		println "Leaving $field blank"
	}
	
	@Then("I should be redirected to the password recovery page")
	def I_should_be_redirected_to_the_password_recovery_page() {
		println "Redirected to the password recovery page"
	}
	
	@When("I click on the 'Lupa Password' (Forgot Password) link")
	def I_click_on_the_forgot_password_link() {
		println "Clicking on the 'Lupa Password' link"
	}
	
	@Then("I should be redirected to the account registration page")
	def I_should_be_redirected_to_the_account_registration_page() {
		println "Redirected to the account registration page"
	}
}