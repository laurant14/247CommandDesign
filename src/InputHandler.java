import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class InputHandler {
	Document doc;
	LoadCommand lc=new LoadCommand(doc);
	SaveCommand sc=new SaveCommand(doc);
	SpellCommand spc=new SpellCommand(doc);
	PrintCommand pc=new PrintCommand(doc);
	
	private HashMap<String, Command> commands=new HashMap<String, Command>();
	
	public InputHandler(Document document){
		commands.put("load", lc);
		commands.put("save", sc);
		commands.put("spell", spc);
		commands.put("print", pc);
	}
	
	public void inputEntered(String data){
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
