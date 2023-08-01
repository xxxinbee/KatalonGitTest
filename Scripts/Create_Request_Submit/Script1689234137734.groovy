import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String genBatch = GlobalVariable.batchNumber

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url_QAS)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login/usernameField'), 'w051')

WebUI.setText(findTestObject('Login/passwordField'), 'bi0farma')

WebUI.click(findTestObject('Login/button_Login'))

//WebUI.verifyElementAttributeValue(findTestObject('Login/account_Identity'), 'value', 'Ilham Aditya', 3)

if (WebUI.verifyElementVisible(findTestObject('Login/Popup_account_is_used'), FailureHandling.CONTINUE_ON_FAILURE)) {
	WebUI.click(findTestObject('Object Repository/Login/button_Yes_Pop_Up'))
}

WebUI.click(findTestObject('Object Repository/Request/span_Quality Control'))

WebUI.click(findTestObject('Object Repository/Request/span_Request'))

WebUI.focus(findTestObject('Object Repository/Request/div_batchNum',[('batchNum'):genBatch]))

String noper = WebUI.getText(findTestObject('Object Repository/Request/div_Noper'))

WebUI.click(findTestObject('Object Repository/Request/div_Noper', [('noper'):noper]))

WebUI.click(findTestObject('Object Repository/Request/button_Nextt'))

WebUI.click(findTestObject('Object Repository/Request/button_Nextt'))

WebUI.click(findTestObject('Object Repository/Request/button_Back'))

WebUI.click(findTestObject('Object Repository/Request/button_Edit'))

WebUI.click(findTestObject('Object Repository/Request/button_Save'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Request/save_em_pop_up'), 0)

WebUI.click(findTestObject('Object Repository/Request/button_Submit_Req'))

