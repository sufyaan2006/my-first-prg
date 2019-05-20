package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * 
 * @author Moksha
 *
 */
public class EmailTemplate {
	
	@FindBy(name="profile")
	private WebElement newTemplateBtn;
	
	public void clickOnnewTemplateBtn(){
		newTemplateBtn.click();
	}

}
