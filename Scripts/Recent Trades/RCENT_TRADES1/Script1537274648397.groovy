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

CustomKeywords.'utility.ValidLogin.Level4Login'()

WebUI.delay(10)

//Verify that the Recent Trades tab exists
WebUI.verifyElementPresent(findTestObject('trade.html/Recent Trades tab'), 10)

//Click on the Recent Trades tab
WebUI.click(findTestObject('trade.html/Recent Trades tab'))

//Verify that the user can view the Recent Trades order book
WebUI.verifyElementPresent(findTestObject('trade.html/Recent Trades ordrBk'), 3)

println('PASSED: Recent Trades order book is visible')

