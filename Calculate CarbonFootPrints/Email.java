package com.carbonfootprints;

public class Email  {
	int inboxCount;
	int spamCount;
	int sentCount;
	String email;
	double spamEmail = 0.3;
	double sentEmail = 50.0;
	double inboxEmail = 4.0;
	double inboxCarbonCalculation;
	double spamCarbonCalculation;
	double sentCarbonCalculation;
	
	Email(String email, int inboxcount, int spamcount, int sentcount){
		this.inboxCount=inboxcount;
		this.sentCount=sentcount;
		this.spamCount=spamcount;
		this.email= email;
		
	}
	
	
	 public void calculateTotalCarbonFootprints() {
	        inboxCarbonCalculation = inboxCount * inboxEmail;
	        spamCarbonCalculation = spamCount * spamEmail;
	        sentCarbonCalculation = sentCount * sentEmail;
	    }

	    public void displayTotalCarbonFootprints() {
	        System.out.println("Email: " + email);
	        System.out.println("Total Carbon Footprint:");
	        System.out.println("Inbox Carbon Footprint: " + inboxCarbonCalculation + "grams");
	        System.out.println("Spam Carbon Footprint: " + spamCarbonCalculation + "grams");
	        System.out.println("Sent Carbon Footprint: " + sentCarbonCalculation + "grams");
	    }
	    
}
