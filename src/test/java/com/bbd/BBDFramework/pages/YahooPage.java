package com.bbd.BBDFramework.pages;

public class YahooPage {
	
	public String url()
	{
		return "https://in.search.yahoo.com/?fr2=inr";
	}
	public String title()
	{
		return "[class='title d-i fz-s fw-xl s-label']";
	}
	public String links()
	{
		return "li[class=icon-find] a";
	}
	public String covidLink()
	{
		return "a[title='COVID-19 in India']";
	}
	public String indiaCases()
	{
		return "tbody tr:nth-child(1) td:nth-child(2) div:nth-child(1) span:nth-child(1)";
	}
	public String indiaDeath()
	{
		return "tbody tr:nth-child(1) td:nth-child(4) div:nth-child(1) span:nth-child(1)";
	}
}
