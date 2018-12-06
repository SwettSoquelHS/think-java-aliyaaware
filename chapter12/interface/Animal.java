public class Animal{
	String name;
	String owner;

	public Animal(){
		name = "unknown";
		owner = "unknown";
	}

	public Animal (String name){
		this();
		this.name = name;
	}

	public String toString(){
		String result = "\tName = " + name + "\n";
		result += "\tOwner = " + owner;
		return result;
	}
}