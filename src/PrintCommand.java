
public class PrintCommand implements Command{
	
	private Document doc;
	
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
