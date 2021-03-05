package com.scripts.irctc;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.Basetestcrossbrowserirctc;
import com.pages.actitime.Irctchomepage;
import com.pages.actitime.Irctclogin;

public class Testirctcsignup extends Basetestcrossbrowserirctc
{

	@Test
	public void irctclogin() throws IOException
	{
		
		Irctchomepage ihp=new Irctchomepage(driver);
		ihp.alertmsgclick();
		ihp.loginbuttonclick();
		Irctclogin il=new Irctclogin(driver);
		il.login();
	}
}
