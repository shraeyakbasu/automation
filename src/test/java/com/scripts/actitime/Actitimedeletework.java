package com.scripts.actitime;

import org.testng.annotations.Test;

import com.generics.actitime.Basetestcrossbrowseractitime;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeSettingsPage;
import com.pages.actitime.ActitimeTypesofWorkPage;

public class Actitimedeletework extends Basetestcrossbrowseractitime
{
	@Test
	public void deletework() throws InterruptedException
	{
		ActitimeHomePage acthp=new ActitimeHomePage(driver);
		acthp.settingsmethod();
		ActitimeSettingsPage actsp=new ActitimeSettingsPage(driver);
		actsp.typesofworkmethod();
		ActitimeTypesofWorkPage acttwp=new ActitimeTypesofWorkPage(driver);
		acttwp.deleteabcdeworkmethod();
	
	}

}
