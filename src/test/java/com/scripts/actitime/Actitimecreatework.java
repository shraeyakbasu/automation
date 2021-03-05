package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.Basetestcrossbrowseractitime;
import com.pages.actitime.ActitimeCreateNewTypeofWorkPage;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeSettingsPage;
import com.pages.actitime.ActitimeTypesofWorkPage;

public class Actitimecreatework extends Basetestcrossbrowseractitime
{
	@Test
	public void creatework() throws IOException, InterruptedException 
	{
	ActitimeHomePage acthp=new ActitimeHomePage(driver);
	acthp.settingsmethod();
	ActitimeSettingsPage actsp=new ActitimeSettingsPage(driver);
	actsp.typesofworkmethod();
	ActitimeTypesofWorkPage acttwp=new ActitimeTypesofWorkPage(driver);
	acttwp.createtypeofworkmethod();
	ActitimeCreateNewTypeofWorkPage actntwp=new ActitimeCreateNewTypeofWorkPage(driver);
	actntwp.nametextmethod();
	actntwp.createtypeofworkmethod();
}
}
