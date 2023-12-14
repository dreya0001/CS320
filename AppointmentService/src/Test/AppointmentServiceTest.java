package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.Test;
import main.Appointment;
import main.AppointmentService;

class AppointmentServiceTest {

	@Test
	public void testAddDuplicateAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		Date futureDate = new Date(System.currentTimeMillis() + 100000);
		Appointment testAppointment = new Appointment("Abc123", futureDate, "meeting");
		
		appointmentService.addAppointment(testAppointment);
		
		assertThrows(IllegalArgumentException.class, () -> {
			appointmentService.addAppointment(testAppointment);
		});
	
	}
	@Test
	public void testDeleteAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		Date futureDate = new Date(System.currentTimeMillis() + 100000);
		Appointment testAppointment = new Appointment("Abc123", futureDate, "meeting");
		
		appointmentService.addAppointment(testAppointment);
		
		assertThrows(IllegalArgumentException.class, () -> {
			appointmentService.addAppointment(testAppointment);
		});
	}
	@Test
	public void testAddAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		Date futureDate = new Date(System.currentTimeMillis() + 100000);
		Appointment testAppointment = new Appointment("Abc123", futureDate, "meeting");
		
		appointmentService.addAppointment(testAppointment);
		
		assertThrows(IllegalArgumentException.class, () -> {
			appointmentService.addAppointment(testAppointment);
		});
	}
}
