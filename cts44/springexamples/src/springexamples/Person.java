package springexamples;

public class Person
{

	String name;
	String age;
	Address Address;
	public Person(String name, String age,Address address) {
		super();
		this.name = name;
		this.age = age;
		Address = address;
	}
	public void showData()
	{
	System.out.println("student Name: "+name);
	System.out.println("student age: "+age);
	System.out.println("Address: "+Address);
}
}
