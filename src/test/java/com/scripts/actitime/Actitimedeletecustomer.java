package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.Basetestcrossbrowseractitime;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeQspidersPage;
import com.pages.actitime.ActitimeQspidersSettingsPage;
import com.pages.actitime.ActitimeTaskPage;

public class Actitimedeletecustomer extends Basetestcrossbrowseractitime
{
	
	@Test
	public void deletecustomer() throws InterruptedException, IOException
	{

	ActitimeHomePage acthp=new ActitimeHomePage(driver);
	acthp.taskmethod();
	ActitimeTaskPage acttp=new ActitimeTaskPage(driver);
	//acttp.qspidersmethod();
	//ActitimeJspidersPage actjp=new ActitimeJspidersPage(driver);
	//actjp.settingsmethod();
	acttp.starttypingnamemethod();
	acttp.qspidersmethod();
	ActitimeQspidersPage actqp=new ActitimeQspidersPage(driver);
	actqp.settingsmethod();
	ActitimeQspidersSettingsPage actqsp=new ActitimeQspidersSettingsPage(driver);
	actqsp.actionsbuttonclickmethod();
	actqsp.deletebuttonclickmethod();

}
}
