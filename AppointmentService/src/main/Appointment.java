package main;

import java.util.Date;


public class Appointment {
	private String appointmentId;
	private Date appointmentDate;
	private String description;
	
	public Appointment(String appointmentId, Date appointmentDate, String description) {
		validateAppointmentId(appointmentId);
		validateAppointmentDate(appointmentDate);	
		validateDescription(description);
		
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
		this.description = description;
		
	}

	public String getAppointmentId() {
		return appointmentId;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public String getDescription() {
		return description;
	}
	private void validateAppointmentId(String appointmentId) {
		if(appointmentId == null || appointmentId.length() > 10) {
			throw new IllegalArgumentException("Appointment ID must not be null and cannot exceed 10 characters.");			
		}
	}
	private void validateAppointmentDate(Date appointmentDate) {
		if(appointmentDate == null || appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("Appointment Date must not be null and must be in the future");			
		}
	}
	private void validateDescription(String description) {
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Description must not be null and cannot exceed 50 characters.");			
}
	}
}