package project_nike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mainclassfw {
	static WebDriver akbar;
	 static baseclasspom mp=new baseclasspom();
	 @BeforeMethod
	 public void openthebrowser() {
		 akbar=new ChromeDriver();
		 akbar.manage().window().maximize();
		 akbar.get("https://www.nike.com/in/");
				  
	 }
     @AfterMethod
     public void closethebrowser() {
    	 akbar.quit();
     }
     @Test
     public void tc1() {
    	String title = akbar.getTitle();
    	Reporter.log(title,true);
     }
     @Test
     public void tc2() {
     	String title = akbar.getCurrentUrl();
     	Reporter.log(title,true);
      }
     
     @Test
     public void tc3() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.logo();
     }
     @Test
     public void tc4() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.logo2();
    	 
     }
     @Test
     public void tc5(){
    	 PageFactory.initElements(akbar, mp);
    	 mp.logoclick();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
     }
     @Test
     public void tc6(){
    	 PageFactory.initElements(akbar, mp);
    	 mp.logo2click();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
     }
     @Test
     public void tc7() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.findstore();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc8() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.help();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
     }
     @Test
     public void tc9() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.join();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
     }
     @Test
     public void tc10() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.signup();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
     }
     @Test
     public void tc11() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.newfeatures();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc12() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.mens();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);

    	 
     }
     @Test
     public void tc13() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.womens();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc14() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.kids();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc15() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.sale();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc16() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.snkrs();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc17() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.forget();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc18() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.keepmesignin();
    	 akbar.navigate().refresh();
    	 }
     @Test
     public void tc19() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.privacy();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc20() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.termsofuse();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc21() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.fav();
    	 akbar.navigate().refresh();
    	 
    	 }
     @Test
     public void tc22() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.bag();
    	 akbar.navigate().refresh();
    	 
    	 }
     @Test
     public void tc23() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.search();
    	 akbar.navigate().refresh();
    	 Reporter.log("the search option is working fine",true);
    	  }
     @Test
     public void tc24() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.instagram();
    	 akbar.navigate().refresh();
    	 
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc25() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.facebook();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc26() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.youtube();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc27() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.twitter();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc28() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.findastore();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc29() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.becameamember();;
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc30() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.sendus();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc31() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.student();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc32() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.gethelp();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc33() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.order();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc34() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.delivery();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc35() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.returns();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc36() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.payment();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc37() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.nike();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc38() {
    	 PageFactory.initElements(akbar, mp);
    	 mp.other();
    	 akbar.navigate().refresh();
    	 String title = akbar.getTitle();
    	 Reporter.log(title,true);
    	 }
}

