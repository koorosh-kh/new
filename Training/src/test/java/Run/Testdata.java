package Run;

import org.testng.annotations.Test;

import Common.browsers;

import org.testng.annotations.DataProvider;

public class Testdata extends browsers {
  @Test(dataProvider = "signin")
  public void f(String n, String s) throws InterruptedException  {
	  Com.pages.Home h= new Com.pages.Home(driver);
		h.Emailidfield(n);
		h.psswordfield(s);
		h.loginbt();
		driver.navigate().back();
		h.empty();
		Thread.sleep(2000);
}
  

  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { "Koorosh", "a" },
      new Object[] { "kuku", "b" },
      new Object[] { "nazanin", "C" },
    };
  }
}
