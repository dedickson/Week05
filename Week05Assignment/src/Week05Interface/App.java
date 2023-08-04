package Week05Interface;

public class App {

	public static void main(String[] args) {
		
		String word = "Week05";
		
		Logger loggerAsterisk = new AsteriskLogger();
		
		loggerAsterisk.log(word);
		loggerAsterisk.error(word);
		
		Logger spacedLogger = new SpacedLogger();
		
		spacedLogger.log(word);
		spacedLogger.error(word);
		
	}

}
