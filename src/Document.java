/**
 * This class provides a string name for the name of the document that is entered by the user
 */

public class Document {
	String name;
	
	public Document(String name) {
		this.name = name;
		System.out.println("Documented named " + name + " is created");
	}
	
	public void load() {
		System.out.println("document " + this.name + " is loaded into view");
	}
	
	public void spell() {
		System.out.println("document " + this.name + " is being chekced for spelling errors");
	}
	
	public void save() {
		System.out.println("document " + this.name + " is being saved");
	}
	
	public void print() {
		System.out.println("document " + this.name + " is being saved");
	}

}
