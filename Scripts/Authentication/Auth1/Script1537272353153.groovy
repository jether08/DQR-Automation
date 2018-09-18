import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.main.CustomKeywordDelegatingMetaClass
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

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
WebUI.click(findTestObject('Login/button_Log_In'))

WebUI.delay(10)

//get the value of the logged in user; if this fails, then this test case fails
loggedinUser = WebUI.getText(findTestObject('Login/loggedin_user'), FailureHandling.STOP_ON_FAILURE)

//convert text to lowercase
loginuser = loggedinUser.toLowerCase()

//Verify that the user displayed is the logged in user's username
WebUI.verifyMatch(loginuser, GlobalVariable.Gusername, true)

WebUI.comment('User Successfuly Login')

