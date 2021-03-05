package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.Basetestcrossbrowseractitime;
import com.pages.actitime.ActitimeCreateNewLeaveTypePage;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeLeaveTypePage;
import com.pages.actitime.ActitimeSettingsPage;

public class Actitimecreateleavetype extends Basetestcrossbrowseractitime
{
	@Test
	public void createleavetype() throws IOException
	{
		ActitimeHomePage acthp=new ActitimeHomePage(driver);
		acthp.settingsmethod();
		ActitimeSettingsPage actsp=new ActitimeSettingsPage(driver);
		actsp.leavetypesmethod();
		ActitimeLeaveTypePage actltp= new ActitimeLeaveTypePage(driver);
		actltp.createleavetypemethod();
		ActitimeCreateNewLeaveTypePage actnltp= new ActitimeCreateNewLeaveTypePage(driver);
		actnltp.leavetypemethod();
		actnltp.createleavemethod();
	}

}
