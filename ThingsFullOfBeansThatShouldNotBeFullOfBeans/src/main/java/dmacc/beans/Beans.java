package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Beans {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String type, color;
	@Autowired
	private Farm farm;
	
	public Beans() {
		super();
	}
	
	public Beans(String type) {
		this.type = type;
	}
	
	public Beans(String type, String color) {
		this.type = type;
		this.color = color;
	}
	
	public Beans(int id, String type, String color) {
		this.id = id;
		this.type = type;
		this.color = color;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Farm getFarm() {
		return farm;
	}
	public void setFarm(Farm farm) {
		this.farm = farm;
	}

	@Override
	public String toString() {
		return "Beans [id=" + id + ", type=" + type + ", color=" + color + ", farm=" + farm + "]";
	}
}
