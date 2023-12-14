package main;

import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
	private Map<String, Appointment> appointmentMap;
	
	public AppointmentService() {
		this.appointmentMap = new HashMap<>();
	}
	
	public void addAppointment(Appointment appointment) {
		vallidateAppointmentId(appointment.getAppointmentId());
		appointmentMap.put(appointment.getAppointmentId(), appointment);
	}
	
	public void deleteAppointment(String appointmentId) {
		if(!appointmentMap.containsKey(appointmentId)) {
			throw new IllegalArgumentException("Appointment with ID " +appointmentId + " does not exist");
		}
		appointmentMap.remove(appointmentId);
		}
	public Map<String, Appointment> getAppointmentMap() {
		return appointmentMap;
	}
	public void vallidateAppointmentId(String appointmentId) {
		if (appointmentMap.containsKey(appointmentId)) {
			throw new IllegalArgumentException("Appointment with ID " + appointmentId + " already exists.");
		}
	}
}
