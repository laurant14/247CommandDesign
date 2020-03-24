/**
 * Class that implements Command using the execute and getName methods, which prompt the Document class to complete the specified action
 */


public class PrintCommand implements Command{
	
	private Document doc;
	
	
	/**
	 * Default constructor takes in doc as a paramter and sets the class variable doc to the parameter doc
	 */
	public PrintCommand(Document doc) {
		this.doc=doc;
	}
	
	@Override
	public void execute() {
		doc.print();
	}
	
	public String getName() {
		return "Print Document";
	}

}
