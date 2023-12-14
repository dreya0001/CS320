package Test;

import static org.junit.jupiter.api.Assertions.*;


import java.sql.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Appointment;
import main.AppointmentService;

class AppointmentTest {

	@Test
	public void testConstructorAndGetters() {
		Date currentDate = new Date(System.currentTimeMillis() + 10000);
		Appointment appointment = new Appointment("Abc123", currentDate, "meeting");
		
		assertEquals("Abc123", appointment.getAppointmentId());
		assertEquals(currentDate, appointment.getAppointmentDate());
		assertEquals("meeting", appointment.getDescription());
	}
	@Test
	public void testInvalidAppointmentId_Null() {
		Date futureDate = new Date(System.currentTimeMillis() + 100000);
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, futureDate, "meeting");
		});
	}
	@Test
	public void testInvalidAppointmentId_tooLong() {
		Date futureDate = new Date(System.currentTimeMillis() + 10000);
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("AppointmentIdTooLong", futureDate, "meeting");			
		});
	}
	@Test
	public void testInvalidAppointmentDate_Null() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("Abc123", null, "meeting");
		});
	}
	@Test
	public void testInvalidAppointmentDate_InPast() {
		Date pastDate = new Date(System.currentTimeMillis() - 100000);
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("Abc123", pastDate, "meeting");
		});
	}
	@Test
	public void testDescription_tooLong() {
		Date futureDate = new Date(System.currentTimeMillis() + 10000);
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("Abc123", futureDate, "meeting that is going to take all day and drive me crazy");			
		});
	}
	@Test
	public void testDescriptionNotNull() {
		Date futureDate = new Date(System.currentTimeMillis()+ 100000);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("Abc123", futureDate, null);
		});
}
}