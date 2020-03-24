/**
 * Class that implements Command using the execute and getName methods, which prompt the Document class to complete the specified action
 */

public class SaveCommand implements Command{
	private Document doc;
	
	
	/**
	 * Default constructor takes in doc as a paramter and sets the class variable doc to the parameter doc
	 */
	public SaveCommand(Document doc) {
		this.doc=doc;
	}
	
	@Override
	public void execute() {
		doc.save();
	}
	
	public String getName() {
		return "Save document";
	}

}
