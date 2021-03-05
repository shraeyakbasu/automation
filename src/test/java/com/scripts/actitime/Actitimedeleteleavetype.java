package com.scripts.actitime;

import org.testng.annotations.Test;

import com.generics.actitime.Basetestcrossbrowseractitime;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeLeaveTypePage;
import com.pages.actitime.ActitimeSettingsPage;

public class Actitimedeleteleavetype extends Basetestcrossbrowseractitime
{
	@Test
	public void deleteleavetype()
	{
		ActitimeHomePage acthp=new ActitimeHomePage(driver);
		acthp.settingsmethod();
		ActitimeSettingsPage actsp=new ActitimeSettingsPage(driver);
		actsp.leavetypesmethod();
		ActitimeLeaveTypePage actltp= new ActitimeLeaveTypePage(driver);
		actltp.maternitydeletemethod();
	}


}
