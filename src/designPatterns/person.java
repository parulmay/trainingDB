package designPatterns;

public class person {

	int personId;
	String firstName;
	String lastName;
	int age;
	private static person personn;
	private person(int personId, String firstName, String lastName, int age) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public static synchronized person getInstance()
	{
		if(personn == null)
		{
			 personn = new person();
			return personn;
		}
		else
		{
		return personn;
		}
	}
	
	
	
}
