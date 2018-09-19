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
WebUI.openBrowser('https://test.dqr-private.com/trade.html')

WebUI.waitForPageLoad(8)

//Click Hamburger Icon
WebUI.click(findTestObject('trade.html/Hamburger Menu'))


if (WebUI.verifyElementNotVisible(findTestObject('SideMenuBar/Deposit'),FailureHandling.OPTIONAL)) {
	
	println('Deposit SideMenu Bar is not visible with logout User')
} 
else 
{

	println('Deposit SideMenu Bar is visible even logout User')
}



