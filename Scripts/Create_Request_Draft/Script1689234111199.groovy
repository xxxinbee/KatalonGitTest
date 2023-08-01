import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.github.javafaker.Faker as Faker
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

//WebDriver driver = DriverFactory.getWebDriver()
Faker faker = new Faker()

String batchNum = faker.numerify('Req-####')

GlobalVariable.batchNumber = batchNum

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

WebUI.waitForElementClickable(findTestObject('Request/button_Create Request'), 0)

WebUI.click(findTestObject('Request/button_Create Request'))

WebUI.click(findTestObject('Object Repository/Request/div_FilterStatusSelect AllDraftNewCompleted_c5ae96'))

WebUI.click(findTestObject('Object Repository/Request/div_Pilih Jenis Permohonan_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Request/div_Environment Monitoring'))

WebUI.click(findTestObject('Object Repository/Request/svg_Pilih Tujuan Pengujian_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Request/div_Klasifikasi'))

WebUI.setText(findTestObject('Object Repository/Request/input_Nomor Batch_noBatch'), GlobalVariable.batchNumber)

WebUI.click(findTestObject('Object Repository/Request/div_Pilih Kondisi_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Request/div_In Operation'))

WebUI.click(findTestObject('Object Repository/Request/button_Next'))

WebUI.click(findTestObject('Object Repository/Request/div_Pilih Fasilitas_css-19bb58m'))

WebUI.setText(findTestObject('Object Repository/Request/input__react-select-8-input'), 'gd')

WebUI.click(findTestObject('Object Repository/Request/div_GD-15-L1  Fasilitas Pemurnian Toksoid'))

WebUI.click(findTestObject('Object Repository/Request/button_Add Ruangan'))

WebUI.click(findTestObject('Object Repository/Request/check_room_a'))

WebUI.click(findTestObject('Object Repository/Request/button_Add'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Request/button_Next'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Request/tab_daftar_uji'))

WebUI.click(findTestObject('Object Repository/Request/button_Save'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Request/save_em_pop_up'), 0)

WebUI.click(findTestObject('Object Repository/Request/button_Draft_Req'))

WebUI.delay(5)

WebUI.focus(findTestObject('Object Repository/Request/div_batchNum',[('batchNum'):genBatch]))

String noper = WebUI.getText(findTestObject('Object Repository/Request/div_Noper'))

WebUI.click(findTestObject('Object Repository/Request/div_Noper', [('noper'):noper]))

