package AdminPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders
{

	public WebDriver driver;

@FindBy(xpath="")
public WebElement x;
@FindBy(xpath="//li[@id='menu-magento-sales-sales']")
public WebElement Sales;
@FindBy(xpath="(//*[text()='Orders']/parent::*)[1]")
public WebElement Orders1;
@FindBy(xpath="//button[@id='add']")
public WebElement createno;
@FindBy(xpath="//input[@id='sales_order_create_customer_grid_filter_email']")
public WebElement filteremail;
@FindBy(xpath="(//*[@title='Search'])[2]")
public WebElement search;
@FindBy(xpath="//div[@id='order-customer-selector']//tbody//td[1]")
public WebElement selectcustomer;
@FindBy(xpath="//button[@id='add_products']")
public WebElement addproducts;
@FindBy(xpath="//input[@id='sales_order_create_search_grid_filter_sku']")
public WebElement sku;
@FindBy(xpath="(//*[@title='Search'])[3]")
public WebElement skusearch;
@FindBy(xpath="//div[@id='order-search']//tr[1]//td[2]")
public WebElement selectproduct;
@FindBy(xpath="//*[@title='Add Selected Product(s) to Order']")
public WebElement addselected;
@FindBy(xpath="//*[text()='Get shipping methods and rates']/parent::*")
public WebElement selectshipping;
//shipping
@FindBy(xpath="//input[@id='s_method_flatrate_flatrate']")
public WebElement flatrate;
//payment
@FindBy(xpath="//label[contains(text(),'Check / Money order')]")
public WebElement checkorder;
@FindBy(xpath="//input[@id='check_number']")
public WebElement checknumber;
//ccauthorize
@FindBy(xpath="//label[contains(text(),'Credit Card Direct Post (Authorize.net)')]")
public WebElement ccauthorize;
@FindBy(xpath="//select[@id='authorizenet_directpost_cc_type']")
public WebElement cardtype;
//visa
@FindBy(xpath="//input[@id='authorizenet_directpost_cc_number']")
public WebElement cardnumber;
@FindBy(xpath="//select[@id='authorizenet_directpost_expiration']")
public WebElement month;
//03 - March
@FindBy(xpath="//select[@id='authorizenet_directpost_expiration_yr']")
public WebElement year;
//2020
@FindBy(xpath="//button[@id='submit_order_top_button']")
public WebElement submitorder;
@FindBy(xpath="//div[contains(text(),'You created the order.')]")
public WebElement ordersuccessmsg;
@FindBy(id="order-billing_address_vat_id")
public WebElement vat;
@FindBy(xpath="//*[text()='United States Postal Service']")
public WebElement uspstext;
@FindBy(id="order-comment")
public WebElement oc;



	
	
	// operations
	 
		public Orders (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	
		public void Sales()
		{	Sales.click();
		}
		public void Orders1()
		{	Orders1.click();
		}
		public void createno()
		{	createno.click();
		}
		public void filteremail(String arg)
		{	filteremail.sendKeys(arg);
		}
		public void search()
		{	search.click();
		}
		public void selectcustomer()
		{	selectcustomer.click();
		}
		public void addproducts()
		{	addproducts.click();
		}
		public void sku(String arg)
		{	sku.sendKeys(arg);
		}
		public void skusearch()
		{	skusearch.click();
		}
		public void selectproduct()
		{	selectproduct.click();
		}
		public void addselected()
		{	addselected.click();
		}
		public void selectshipping()
		{	selectshipping.click();
		}
		public void flatrate()
		{	flatrate.click();
		}
		public void checkorder()
		{	checkorder.click();
		}
		public void checknumber(String arg)
		{	checknumber.sendKeys(arg);
		}
		public void ccauthorize()
		{	ccauthorize.click();
		}
		public void cardtype()
		{	cardtype.click();
		}
		public void cardnumber(String arg)
		{	cardnumber.sendKeys(arg);
		}
		public void month()
		{	month.click();
		}
		public void year()
		{	year.click();
		}
		public void submitorder()
		{	submitorder.click();
		}
		public void oc()
		{	oc.click();
		}
		
		
}
