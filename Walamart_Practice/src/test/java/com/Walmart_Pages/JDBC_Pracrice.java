package src.test.java.com.Walmart_Pages;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.laibrarys.DataBaseManeger;

public class JDBC_Pracrice {

	public static WebDriver driver;

	DataBaseManeger conn = new DataBaseManeger();
	

	@Test
	public void JDBC_Practic1() throws SQLException, Exception {

		ResultSet quires = conn.database("selec first_name, Last_name from Emplyees");

		String FN = null;
		String LN = null;

		while (quires.next()) {

			FN = quires.getString("first_name");
			LN = quires.getString("Last_name");

		}
	// Update
		
		System.out.println("firstName"+ FN + "Last_name"+LN);

		WebElement name = driver.findElement(By.className(""));
		name.sendKeys(FN);

		WebElement ln = driver.findElement(By.className(""));
		ln.sendKeys(LN);
	}

}
