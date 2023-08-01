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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import com.github.javafaker.Faker as Faker

//CustomKeywords.'auth.Authentification.login2'(GlobalVariable.Op_Building.getAt('Username'), GlobalVariable.Op_Building.getAt(
//	'Password'))
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url_QAS)

WebUI.setText(findTestObject('Login/usernameField'), GlobalVariable.Op_Building.getAt('Username'))

WebUI.setText(findTestObject('Login/passwordField'), GlobalVariable.Op_Building.getAt('Password'))

WebUI.click(findTestObject('Object Repository/Login/button_Login'))

if (WebUI.verifyElementVisible(findTestObject('Login/Popup_account_is_used'),FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.verifyTextPresent('This account is being used on another device, will it continue to sign in?', false)
    WebUI.click(findTestObject('Login/button_Yes_Pop_Up'))
    WebUI.verifyTextPresent('Successfully Login', false)
} 

