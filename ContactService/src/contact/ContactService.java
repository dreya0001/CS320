package contact;

import java.util.ArrayList;

public class ContactService{
	private ArrayList<Contact> contacts;
	
	public ContactService() {
	
	contacts = new ArrayList<>();
}

	public boolean addContact(Contact contact) {
		boolean contactAlready = false;
		
		for (Contact contactList : contacts) {
			
			if (contactList.equals(contact)) {
				contactAlready = true;
			}
		}
		if(!contactAlready) {
			contacts.add(contact);
			
			return true;
		}else {
			return false;
		}
		}
	public boolean deleteContact(String contactID) {
		for (Contact contactList : contacts) {
			if(contactList.getContactId().equals(contactID)) {
				contacts.remove(contactList);
				return true;
			}
		}
		return false;
	}
	public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		for (Contact contactList : contacts) {
			
			if (contactList.getContactId().equals(contactID)) {
				if(!firstName.equals("") && !(firstName.length() > 10)) {
					contactList.setFirstName(firstName);
				}
				if(!lastName.equals("") && !(lastName.length() > 10)) {
					contactList.setLastName(lastName);
			}
				if(!phoneNumber.equals("") && (phoneNumber.length() == 10)) {
					contactList.setPhoneNumber(phoneNumber);
		}
				if(!address.equals("") && !(address.length() > 30)) {
					contactList.setAddress(address);
	}
				return true;
	}
		}
		return false;
	}
}