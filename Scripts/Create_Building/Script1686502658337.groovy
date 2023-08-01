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
import com.github.javafaker.Faker as Faker

Faker faker = new Faker()

String idRandom = faker.address()

String idBuilding = 'GD' + idRandom

String nameBuilding = 'Gedung ' + faker.address().firstName()

CustomKeywords.'auth.Authentification.login_to_QAS'(GlobalVariable.Op_Building.getAt('Username'), GlobalVariable.Op_Building.getAt(
        'Password'))

WebUI.click(findTestObject('Building/span_Master Data'))

WebUI.click(findTestObject('Building/span_Building'))

WebUI.click(findTestObject('Building/button_Create'))

WebUI.verifyElementPresent(findTestObject('Building/header_Create Building'), 0)

WebUI.setText(findTestObject('Object Repository/Building/input__dataMaster.buildingId'), idBuilding)

WebUI.setText(findTestObject('Object Repository/Building/input__dataMaster.buildingName'), nameBuilding)

String gdID = WebUI.getAttribute(findTestObject('Object Repository/Building/input__dataMaster.buildingId'), 'value')

String gdName = WebUI.getAttribute(findTestObject('Object Repository/Building/input__dataMaster.buildingName'), 'value')

WebUI.click(findTestObject('Object Repository/Building/button_Submit'))

WebUI.delay(10)

CustomKeywords.'auth.Authentification.logout'()

//CustomKeywords.'auth.Authentification.login_to_QAS'(GlobalVariable.Rev_Building.getAt('Username'), GlobalVariable.Rev_Building.getAt(
//        'Password'))
//
//WebUI.click(findTestObject('Object Repository/Building/Page_Testing - Q100 Application/span_Review Master Data'))
//
//WebUI.click(findTestObject('Object Repository/Building/Page_Testing - Q100 Application/span_Pending'))
//
//WebUI.findWebElements(findTestObject('Object Repository/Building/Page_Testing - Q100 Application/div_table_data'), 10)
//
//WebUI.click(findTestObject('Object Repository/Building/Page_Testing - Q100 Application/td_GD585', [('gdID') : gdID]))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Building/Page_Testing - Q100 Application/input_Building Id_Building Id'), 
//    gdID)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Building/Page_Testing - Q100 Application/input_Building Name_Building Name'), 
//    gdName)

