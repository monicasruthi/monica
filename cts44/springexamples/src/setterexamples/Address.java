package setterexamples;

public class Address {

	String dno;
	String name;
	String city;
	public Address()
	{
		
	}
	
	public Address(String dno, String name, String city) {
		super();
		this.dno = dno;
		this.name = name;
		this.city = city;
	}
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
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
	
}
