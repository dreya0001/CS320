package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {

	@Test
	public void testConstructorAndGetters() {
		Contact contact = new Contact("4", "Andreya", "Wise", "12345678", "Sample");
		
		assertEquals("4", contact.getContactId());
		assertEquals("Andreya", contact.getFirstName());
		assertEquals("Wise", contact.getLastName());
		assertEquals("12345678", contact.getPhoneNumber());
		assertEquals("Sample", contact.getAddress());
	}
	@Test
	public void testContactClass() {
		Contact contact = new Contact("4", "Andreya", "Wise", "12345678", "Sample");
		assertTrue(contact.getFirstName().equals("Andreya"));
		assertTrue(contact.getLastName().equals("Wise"));	
	}
	@Test
	public void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("4", null, "Wise", "12345678", "Sample");
		});}
	@Test
	public void testLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("4","Andreya", null, "12345678", "Sample");
	});}
	@Test
	public void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Andreya", "Wise", "12345678", "Sample");
		});}
	@Test
	public void testPhoneNumerIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("4", "Andreya", "Wise", null, "Sample");
		});}
	@Test
	public void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("4", "Andreya", "Wise", "12345678", null);
		});}	
}
	


