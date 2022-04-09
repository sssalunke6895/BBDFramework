package com.bbd.BBDFramework.pages;

public class MyntraPage {
	
	public String url()
	{
		return "https://www.myntra.com/";
	}
	public String menSection()
	{
		return "//a[contains(text(),'Men')]";
	}
	public String item()
	{
		return "//a[contains(text(),'T-Shirts')]";
	}
	public String sortMenu()
	{
		return "//div[@class='sort-sortBy']";
	}
	public String whatsNew()
	{
		return "//label[contains(text(),\"What's New\")]";
	}
	public String brand()
	{
		return "ul[class='brand-list'] input[value='Puma']";
	}
	public String discount()
	{
		return "[class='discount-list'] li:nth-child(2)";
	}
	public String product()
	{
		return "//img[@title='Puma Men Yellow & Black Essentials Brand Logo Printed Pure Cotton T-shirt']";
	}
	public String brandSize()
	{
		return "//p[contains(text(),'L')]";
	}
	public String bag()
	{
		return "//div[contains(text(),'ADD TO BAG')]";
	}
	public String openBag()
	{
		return "//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']";
	}
	public String bagPopup()
	{
		return "//*[@id=\"cartItemsList\"]/div/div/div/div/div[1]/div/div[1]";
	}
	public String wishList()
	{
		return "//button[@class='inlinebuttonV2-base-actionButton bulkActionStrip-desktopBulkWishlist']";
	}
	public String wishListPopup()
	{
		return "//*[@id=\"appContent\"]/div/div/div/div/div[1]/div[5]/div[4]/div/div/div[2]/div[2]/button";
	}
}
