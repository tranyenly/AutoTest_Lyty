package automation.testsuite.TrangNguyen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

public final class TS_Test extends CommonBase {
 

  @BeforeMethod
  public void init() {
    driver = initDriverTest("https://partners-staging.capa.ai/");    
    //openPage("https://partners-staging.capa.ai/", driver);
    }

  @AfterMethod
 // public void after() {
    //quitDriver(driver);}

  @Test
  public void Epic1_Story1_SignInPage() {
	  click(By.xpath("//span[contains(text(),'로그인/회원가입')]"));
	  pause(3000);
   }
 
}
