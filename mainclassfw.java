package ramesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mainclassfw {
	static WebDriver ramesh;
	 static baseclasspom mp=new baseclasspom();
	 @BeforeMethod
	 public void openthebrowser() {
		 ramesh=new ChromeDriver();
		 ramesh.manage().window().maximize();
		 ramesh.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/");
		 
		 
	 }
     @AfterMethod
     public void closethebrowser() {
    	 ramesh.quit();
     }
     @Test
     public void tc1() {
    	String title = ramesh.getTitle();
    	Reporter.log(title,true);
     }
     @Test
     public void tc2() {
     	String title = ramesh.getCurrentUrl();
     	Reporter.log(title,true);
      }
     
     @Test
     public void tc3() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.logo();
     }
     @Test
     public void tc4() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.logo2();
    	 
     }
     @Test
     public void tc5(){
    	 PageFactory.initElements(ramesh, mp);
    	 mp.logoclick();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
     }
     @Test
     public void tc6(){
    	 PageFactory.initElements(ramesh, mp);
    	 mp.logo2click();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
     }
     @Test
     public void tc7() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.findstore();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc8() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.help();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
     }
     @Test
     public void tc9() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.join();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
     }
     @Test
     public void tc10() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.signup();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
     }
     @Test
     public void tc11() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.newfeatures();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc12() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.mens();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);

    	 
     }
     @Test
     public void tc13() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.womens();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc14() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.kids();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc15() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.sale();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc16() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.snkrs();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc17() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.forget();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc18() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.keepmesignin();
    	 ramesh.navigate().refresh();
    	    	 }
     @Test
     public void tc19() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.privacy();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc20() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.termsofuse();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc21() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.fav();
    	 ramesh.navigate().refresh();
    	 
    	 }
     @Test
     public void tc22() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.bag();
    	 ramesh.navigate().refresh();
    	 
    	 }
     @Test
     public void tc23() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.search();
    	 ramesh.navigate().refresh();
    	 Reporter.log("the search option is working fine",true);
    	  }
     @Test
     public void tc24() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.instagram();
    	 ramesh.navigate().refresh();
    	 
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc25() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.facebook();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc26() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.youtube();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc27() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.twitter();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc28() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.findastore();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc29() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.becameamember();;
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc30() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.sendus();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc31() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.student();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc32() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.gethelp();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc33() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.order();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc34() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.delivery();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc35() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.returns();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc36() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.payment();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc37() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.nike();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void tc38() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.other();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
}
