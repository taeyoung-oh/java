package test240731.object1;

import java.util.Objects;

public class Nut extends Farm{
	private String name;
	
	
	
	public Nut() {
		super();
	}
	public Nut(String kind, String name) {
		super();
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
		return "Nut [name=" + name + "]";
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
		Nut other = (Nut) obj;
		return Objects.equals(name, other.name);
	}
}
