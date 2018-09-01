package utility

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class ValidLogin {

	@Keyword
	def login() {

		//Open the browser
		WebUI.openBrowser('')

		//maximize the browser window
		WebUI.maximizeWindow ()

		//Navigate to the site
		WebUI.navigateToUrl(GlobalVariable.Url)

		//wait 30s for the page to load
		WebUI.waitForPageLoad(30)

		//Click Login button
		WebUI.click(findTestObject('Object Repository/Login/a_Login'))

		//Input valid username
		WebUI.setText(findTestObject('Object Repository/Login/input_name'), GlobalVariable.Gusername)

		//Input valid password
		WebUI.setText(findTestObject('Login/input_password'), GlobalVariable.Gpassword)

		//Click Login button
		WebUI.click(findTestObject('Object Repository/Login/button_Log In'))
	}
}

