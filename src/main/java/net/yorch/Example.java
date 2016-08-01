package net.yorch;

public class Example {

	public static void main(String[] args) {
		Interactive interactive = new Interactive();
        
		interactive.addQuestion("hostname", "Type hostname:");
		interactive.addQuestion("user","Type User Name:");
		interactive.addQuestion("password", "Type Password:");
		interactive.addQuestion("dbname", "Type Database Name:");
        
        interactive.interactive();
        interactive.save("config.properties");
	}
}
