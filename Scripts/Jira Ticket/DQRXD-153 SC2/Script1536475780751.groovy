import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Open the browser
WebUI.openBrowser('http://test.dqr-private.com/registration.html')

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Registration/reg_username'), username)

WebUI.setText(findTestObject('Registration/reg_email'), email)

WebUI.setText(findTestObject('Registration/reg_password'),password)

WebUI.setText(findTestObject('Registration/reg_confirm-password'),confirmpassword)

WebUI.verifyTextPresent("Password confirmation and Password must match", false, FailureHandling.CONTINUE_ON_FAILURE)

println("Validation for mismatch password is display")



