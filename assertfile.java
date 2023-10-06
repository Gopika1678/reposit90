package assertandverify;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class brokenlinks {

	public static void main(String[] args) {
        HttpURLConnection huc = null;
        int respCode = 200;
        
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
	      driver.get("https://demoqa.com/links");
	      List<WebElement> list=driver.findElements(By.tagName("a"));
	     String url="";
	     for(int i=0;i<list.size();i++) {
	    	String links= list.get(i).getText();
	    	System.out.println(links);
	     }
	      Iterator<WebElement> iterator = list.iterator();
	      while (iterator.hasNext()) {
	    	  url = iterator.next().getAttribute("href");
	    	  System.out.println(url);
	    	  
	    	  if(url==null||url.isEmpty()) {
	    		  System.out.println("url is empty");
	    	  }
	      }
	}

}
