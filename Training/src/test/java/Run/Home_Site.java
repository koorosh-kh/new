package Run;

import org.testng.annotations.Test;

import Common.browsers;


public class Home_Site extends browsers {
  @Test
  public void f() {
	 // Com.pages.Home home=new Com.pages.Home(driver);
	  Com.pages.Home h= new Com.pages.Home(driver);
		h.Emailidfield("Zoha.kharazmi@yahoo.com");
		h.psswordfield("zk");
		h.loginbt();
		driver.navigate().back();
  }
}
