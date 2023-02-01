package POM;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bass.Base_Class;

import Bass_Class.Utility_Files;

public class Meth_pom extends com.bass.Base_Class{
	
	public static WebDriver driver=browserlaunch("chrome");
	public static Login log =new Login(driver);
	public static search_hotel s=new search_hotel(driver);
	
	public static void main(String[] args) throws IOException {
		//browserlaunch("chrome");
		urllaunch("https://adactinhotelapp.com//");
		max();
		title();
		
		
        sendValues(log.getUsername(),"jananandhu13");
        sendValues(log.getPassword(), "jananandhu13");
        Screenshot("C:\\Users\\JANA\\eclipse-workspace\\Amazon\\ScreenShot\\jj.png");
        clickOnElement(log.getLog_btn());
	    
		
		
	    dropudown_Index(s.getLocation(), 2);
		dropudown_Index(s.getHotels(), 3);
		dropudown_Index(s.getRoom_type(), 1);	
        dropudown_Index(s.room_nos, 6);
		clear(s.datepickin);
	    sendValues(s.datepickin, "20/02/2023");
	    clear(s.datepickout);
	    sendValues(s.datepickout, "22/02/2023");
	    dropudown_Index(s.adultroom, 4);
	    dropudown_Index(s.child_room, 4);
	   Screenshot("C:\\Users\\JANA\\eclipse-workspace\\Amazon\\ScreenShot\\jn.png");
	    clickOnElement(s.submit);
	    click(s.radiobutton);
	    clickOnElement(s.continuee);
	    sendValues(s.first_name, "jananandhu");
	    sendValues(s.lastname, "G");
	    sendValues(s.address, "chennai");
	    sendValues(s.credit_card, "7410258963014785");
	    dropudown_Index(s.creditcard2, 4);
	    dropudown_Index(s.Expirydate, 4);
	    dropudown_Index(s.selectyear, 6);
	    sendValues(s.cvvnumber, "147");
	   Screenshot("C:\\Users\\JANA\\eclipse-workspace\\Amazon\\ScreenShot\\j1.png");
	    clickOnElement(s.bookname);
	    clickOnElement(s.booked);
	    clickOnElement(s.orderid);
       Screenshot("C:\\Users\\JANA\\eclipse-workspace\\Amazon\\ScreenShot\\jnn.png");
        clickOnElement(s.getOrdercancel());

    Alert a=driver.switchTo().alert();
	  a.accept();
    clickOnElement(s.getLogout_btn());
   Screenshot("C:\\Users\\JANA\\eclipse-workspace\\Amazon\\ScreenShot\\jn2.png");
   
    
	   
	   
	   
	   
	   
	   
	   
	    
		
}
}
