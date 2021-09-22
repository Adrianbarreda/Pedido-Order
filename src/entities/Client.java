package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private String email;
	private Date dateBirth;
	
	public Client() {		
	}

	public Client(String name, String email, Date dateBirth) {		
		this.name = name;
		this.email = email;
		this.dateBirth = dateBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}
	
	@Override
	public String toString() {
		return name + " (" + sdf.format(dateBirth) + ") - " + email;
 	}
}
