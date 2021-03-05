package com.script.yahoo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.Basetestcrossbrowseryahoo;
import com.pages.actitime.Yahoosignup;


public class Testyahoosignup extends Basetestcrossbrowseryahoo
{
	@Test
	public void yahoologin() throws IOException
	{
		
	Yahoosignup ysp=new Yahoosignup(driver);
	ysp.signup();
	}
	
}
