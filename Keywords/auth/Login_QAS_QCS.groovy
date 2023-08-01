package auth

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

public class Authentification {
	@Keyword

	public login(String Username, String Password){
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.Url_QAS)
		WebUI.setText(findTestObject('Login/usernameField'), Username)
		WebUI.setText(findTestObject('Login/passwordField'), Password)
		WebUI.click(findTestObject('Object Repository/Login/button_Login'))
		WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)
	}

	public logout() {
		WebUI.click(findTestObject('Object Repository/Login/button_Account'))
		WebUI.click(findTestObject('Object Repository/Login/button_Logout'))
		WebUI.verifyElementPresent(findTestObject('Login/div_Are you sure you want to log outCancelLogout'), 0)
		WebUI.click(findTestObject('Login/button_Logout_Pop_up'))
	}
	public login2(String Username, String Password){
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.Url_QAS)
		WebUI.setText(findTestObject('Login/usernameField'), Username)
		WebUI.setText(findTestObject('Login/passwordField'), Password)
		WebUI.click(findTestObject('Object Repository/Login/button_Login'))


		if (WebUI.verifyElementVisible(findTestObject('Login/Popup_account_is_used'),FailureHandling.CONTINUE_ON_FAILURE)) {
			WebUI.verifyTextPresent('This account is being used on another device, will it continue to sign in?', false)
			WebUI.click(findTestObject('Login/button_Yes_Pop_Up'))
			WebUI.verifyTextPresent('Successfully Login', false)
		}
	}
}


