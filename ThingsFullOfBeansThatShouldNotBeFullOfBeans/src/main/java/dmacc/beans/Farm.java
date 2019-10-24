package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Farm {

	private String name, city, state;
	
	public Farm() {
		super();
	}
	
	public Farm(String name, String city, String state) {
		this.name = name;
		this.city = city;
		this.state = state;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Farm [name=" + name + ", city=" + city + ", state=" + state + "]";
	}
}
