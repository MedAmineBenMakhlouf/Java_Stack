package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {

private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
	public Physician(int id)
	{
		super(id);
	}
	
    // TO DO: Implement HIPAACompliantUser!
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		if(pin!=4)
		{			
			return false;
		}
		else
		{
			setPin(pin);
			return true;
		}
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if(getId()==confirmedAuthID)
		{
			
			return true;
		}
		else
		{
			return false;
		}
	}
    
}
