import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import sapui5AutomationLibrary.*;
public class myscript {static WebDriver driver;public static void main(String[] args) throws Exception{
ChromeOptions options=new ChromeOptions();options.addArguments('--test-type');
File file2=new File('C:\Desktop_Data\selenium-2.42.2\chromedriver.exe');
System.setProperty('webdriver.chrome.driver',file2.getAbsolutePath());
driver=new ChromeDriver(options);driver.get('http://vepot731007.dhcp.wdf.sap.corp:50000/POT_CLOUD/Login.html');
ui5automation.sap_editbox(username_editbox.class ,'SET',driver);System.out.println('--------------------------------');
ui5automation.sap_editbox(password_editbox.class, 'SET',driver);
System.out.println('--------------------------------');
ui5automation.sap_button(login_button.class ,'CLICK',driver);}}