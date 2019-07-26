package com.db.designPatterns.builder;

public class User {

	private final String firstName;
	private final String lastName;
	private final int age;
	private final String phone;
	private final String address;
	private User(String firstName, String lastName, int age, String phone, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	private User(UserBuilder builder)
	{
	this.firstName = builder.firstName;	
	this.lastName = builder.lastName;
	this.age = builder.age;
	this.phone = builder.phone;
	this.address = builder.address;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	

@Override
public String toString() {
return "User [firstName=" + firstName + ", lastName=" + lastName
+ ", age=" + age + ", phone=" + phone + ", address=" + address
+ "]";
}

public static class UserBuilder {
	private final String firstName; //mandatory
	private final String lastName;
	private  int age;
	private String phone; //optional
	private String address;
	
	public UserBuilder(String firstName,String lastName)
	{
	this.firstName = firstName;
	this.lastName = lastName;
	
	}
	
	public UserBuilder age(int age)  {		//we are not using get-set for builder methods to avoid confusion
	this.age=age;
	return this;
	}
	public UserBuilder address(String address)  {		//we are not using get-set for builder methods to avoid confusion
		this.address=address;
		return this;
		}
	public UserBuilder phone(String phone)  {		//we are not using get-set for builder methods to avoid confusion
		this.phone=phone;
		return this;
		}
		public User build() {
		
			User user = new User(this);
			return user;
		}
	}
	
	public static void main(String[] args)
	{
	User user = new User.UserBuilder("par", "shar").age(20).build();	
		System.out.println(user);
	}
}

