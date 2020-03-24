import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class InputHandler {
	Document doc;
	LoadCommand lc;
	SaveCommand sc;
	SpellCommand spc;
	PrintCommand pc;
	
	private HashMap<String, Command> commands=new HashMap<String, Command>();
	
	public InputHandler(Document document) {
		//this.doc = document;
		this.lc = new LoadCommand(document);
		this.sc = new SaveCommand(document);
		this.spc = new SpellCommand(document);
		this.pc = new PrintCommand(document);
	}
	
	public void inputEntered(String data) {
		switch(data) {
		case "load":
			lc.execute();
			break;
		case "save":
			sc.execute();
			break;
		case "spell":
			spc.execute();
			break;
		case "print":
			pc.execute();
			break;
		}
			
	}

}
