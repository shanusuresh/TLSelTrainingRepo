package week2Day1;

import wrappers.GenericWrappers;


public class CreateLead {
	public static void main(String[] args) throws Exception {
		GenericWrappers wrapper = new GenericWrappers();
		wrapper.invokeApp("chrome", "http://leaftaps.com/");
		wrapper.enterById("username", "DemoSalesManager");
		wrapper.enterById("password", "crmsfa");
		wrapper.clickByClassName("decorativeSubmit");
		wrapper.clickByLink("CRM/SFA");
		wrapper.clickByLink("Create Lead");
		wrapper.enterById("createLeadForm_companyName", "Trimble");
		wrapper.enterById("createLeadForm_firstName", "Priya");
		wrapper.enterById("createLeadForm_lastName", "Suresh");
		wrapper.selectVisibileTextById("createLeadForm_dataSourceId", "Employee");
		wrapper.selectVisibileTextById("createLeadForm_marketingCampaignId", "Demo Marketing Campaign");
		wrapper.enterById("createLeadForm_generalProfTitle", "Sr. Test engineer");
		wrapper.selectVisibileTextById("createLeadForm_currencyUomId", "INR - Indian Rupee");		
		wrapper.clickByClassName("smallSubmit");
		
	}
}
