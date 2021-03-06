import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
	
	
	public static void saveAccounts() {
		Accounts accounts = Accounts.getInstance();
		ArrayList<Account> friends = accounts.getAccounts();
		JSONArray jsonFriends = new JSONArray();
		
		//creating all the json objects
		for(int i=0; i< friends.size(); i++) {
			jsonFriends.add(getAccountJSON(friends.get(i)));
		}
		
		//Write JSON file
        try (FileWriter file = new FileWriter(ACCOUNTS_FILE_NAME)) {
 
            file.write(jsonFriends.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static JSONObject getAccountJSON(Account account) {
		JSONObject accountDetails = new JSONObject();
		accountDetails.put(ACCOUNTS_NAME, Account.getName());
		accountDetails.put(ACCOUNTS_USERNAME, Account.getUsername());
		accountDetails.put(ACCOUNTS_PASSWORD, Account.getPassword());
        
        return accountDetails;
	}
}