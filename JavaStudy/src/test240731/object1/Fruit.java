package test240731.object1;

import java.util.Objects;

public class Fruit extends Farm{
	private String name;
	
	
	
	public Fruit() {
		super();
	}
	public Fruit(String kind, String name) {
		super(kind);
		this.name = name;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(name, other.name);
	}
}
