package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Amazon1 extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	
	launchBrowser("Chrome");
	launchUrl("https://www.amazon.in/");
	FirstPage f=new FirstPage();
	enter(f.getSearch(), "iphone");
	
  System.out.println("==========PAGE1=============");
  //GET PHONE NAME
  List<WebElement> phonename = d.findElements(By.xpath("//span[@Class='a-size-medium a-color-base a-text-normal']"));
  for (WebElement x : phonename) {
	System.out.println(x.getText());}
  
   //GET PRICE
   List<WebElement> price = d.findElements(By.xpath("//span[@Class='a-price-whole']"));
	for (WebElement y : price) {
		System.out.println(y.getText());
	}
	
	
	System.out.println("=========PAGE2===============");
	WebElement nextpage = d.findElement(By.xpath("//a[text()='Next']"));
	click(nextpage);
	
	//GET PHONE NAME
    Thread.sleep(2000);
	List<WebElement> phonename2 = d.findElements(By.xpath("//span[@Class='a-size-medium a-color-base a-text-normal']"));
    for (WebElement a : phonename2) {
		System.out.println(a.getText());
	}
    
    //GET PRICE
    List<WebElement> price2 = d.findElements(By.xpath("//span[@Class='a-price-whole']"));
	for (WebElement b : price2) {
		System.out.println(b.getText());
	}
	
	System.out.println("=========PAGE3===============");
	WebElement nxtpage3 = d.findElement(By.xpath("//a[text()='Next']"));
	click(nxtpage3);
	
	//GET PHONE NAME
	Thread.sleep(2000);
	List<WebElement> phonename3 = d.findElements(By.xpath("//span[@Class='a-size-medium a-color-base a-text-normal']"));
	for (WebElement p : phonename3) {
	System.out.println(p.getText());
	}
	
	//GET PRICE
    List<WebElement> price3 = d.findElements(By.xpath("//span[@Class='a-price-whole']"));
	for (WebElement c : price3) {
		System.out.println(c.getText());
	}
	
}
}
