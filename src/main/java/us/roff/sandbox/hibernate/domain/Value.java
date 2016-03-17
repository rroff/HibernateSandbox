package us.roff.sandbox.hibernate.domain;

import javax.persistence.Entity;

@Entity
public class Value extends AbstractDomainObject {

	private String name;
	
	private String value;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
