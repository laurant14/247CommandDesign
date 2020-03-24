import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class InputHandler {
	
	private HashMap<String, command> commands = new HashMap<String, command>();
	
	public InputHandler(Document document){
		commands.put("load", LoadCommand);
		commands.put("save", SaveCommand);
		commands.put("spell", SpellCheckCommand);
		commands.put("print", PrintCommand);
	}
	
	public void inputEntered(String data){
		switch(data) {
		case "load":
			commands.execute();
			break;
		case "save":
			commands.execute();
			break;
		case "spell":
			commands.execute();
			break;
		case "print":
			commands.execute();
			break;
		}
			
	}

}
