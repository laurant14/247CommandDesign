

public class Document {
	Command command;
	
	public Document(String name) {
		System.out.println("Documented named " + name + " is created");
	}
	
	public void load() {
		System.out.println("document " + command.getName() + " is loaded into view");
	}
	
	public void spell() {
		System.out.println("document " + command.getName() + " is being chekced for spelling errors");
	}
	
	public void save() {
		System.out.println("document " + command.getName() + " is being saved");
	}
	
	public void print() {
		System.out.println("document " +command.getName() + " is being saved");
	}

}
