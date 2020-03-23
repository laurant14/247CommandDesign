import java.util.HashMap;

public class InputHandler {
	
	private HashMap<String, command> commands;
	
	public InputHandler(Document document){
		commands.put("load", LoadCommand);
		commands.put("save", SaveCommand);
		commands.put("spell", SpellCheckCommand);
		commands.put("print", PrintCommand);
	}
	
	public void inputEntered(String data){//This ain't right lol
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
