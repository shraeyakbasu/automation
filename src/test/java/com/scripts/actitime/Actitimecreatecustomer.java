package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;
import com.generics.actitime.Basetestcrossbrowseractitime;
import com.pages.actitime.ActitimeCreateNewCustomerPage;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeTaskPage;

public class Actitimecreatecustomer extends Basetestcrossbrowseractitime
{

	@Test
	public void createcustomer() throws IOException, InterruptedException
	{
		ActitimeHomePage acthp=new ActitimeHomePage(driver);
		acthp.taskmethod();
		ActitimeTaskPage acttp=new ActitimeTaskPage(driver);
		acttp.addnewbuttonmethod();
		ActitimeCreateNewCustomerPage actncp=new ActitimeCreateNewCustomerPage(driver);
		actncp.entercustomernamemethod();
		actncp.createcustomermethod();
	}
	
}
