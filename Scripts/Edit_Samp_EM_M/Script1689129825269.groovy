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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://q100-testing.biofarma.co.id/login')

WebUI.setText(findTestObject('Object Repository/Sampling/input_Login_userName'), 'w051')

WebUI.setEncryptedText(findTestObject('Object Repository/Sampling/input_Login_password'), 'J7V1mJALARKIbhS60E9e1Q==')

WebUI.click(findTestObject('Object Repository/Sampling/path'))

WebUI.click(findTestObject('Object Repository/Sampling/path'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Login'))

WebUI.click(findTestObject('Object Repository/Sampling/span_Quality Control'))

WebUI.click(findTestObject('Object Repository/Sampling/span_Sampling'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Req-9880'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Edit'))

WebUI.click(findTestObject('Object Repository/Sampling/input__chakra-input disabled-input css-ygxf8c'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Set Date'))

WebUI.click(findTestObject('Object Repository/Sampling/input_-_chakra-input disabled-input css-ygxf8c'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Set Date'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Next'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Next'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Masukkan ID Alat_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Sampling/div_118-AirS-06'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Bahan'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Pilih Nama Bahan_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Triptic Soy Agar'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Pilih Nomor Batch_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Sampling/div_T-330063'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Next'))

WebUI.click(findTestObject('Object Repository/Sampling/input_NOTES REVIEWER QA_chakra-input disabl_078c59'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Set Time'))

WebUI.click(findTestObject('Object Repository/Sampling/input_NOTES REVIEWER QA_chakra-input disabl_078c59'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Set Time'))

WebUI.click(findTestObject('Object Repository/Sampling/input_NOTES REVIEWER QA_chakra-input disabl_078c59'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Set Time'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Other'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Save'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Save as Draft'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Req-9880'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Edit'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Ruangan'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Alat'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Masukkan ID Alat_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Sampling/div_118-AirS-06_1'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Bahan'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Pilih Nama Bahan_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Contact Agar 2'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Pilih Nomor Batch_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Sampling/div_CA-334521'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Daftar Uji'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Bahan'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Add New'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Pilih Nama Bahan_css-19bb58m_1'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Contact Agar 2_1'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Pilih Nomor Batch_css-19bb58m_1'))

WebUI.click(findTestObject('Object Repository/Sampling/div_CA-623312'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Add New'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Pilih Nama Bahan_css-19bb58m_1_2'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Triptic Soy Agar_1'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Pilih Nomor Batch_css-19bb58m_1_2'))

WebUI.click(findTestObject('Object Repository/Sampling/div_T-330063_1'))

WebUI.click(findTestObject('Object Repository/Sampling/div_Daftar Uji'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Save'))

WebUI.click(findTestObject('Object Repository/Sampling/button_Save  Submit'))

