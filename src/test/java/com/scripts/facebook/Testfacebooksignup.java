package com.scripts.facebook;


import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.Basetestcrossbrowser;
import com.pages.actitime.Facebooksignup;

public class Testfacebooksignup extends Basetestcrossbrowser

{
	@Test
	public void signup() throws IOException
	{
		
	Facebooksignup fbsp=new Facebooksignup(driver);
	fbsp.signup();
	}
}
