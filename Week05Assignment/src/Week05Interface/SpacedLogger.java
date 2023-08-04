package Week05Interface;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		String logWord = "";
		for (int i = 0; i < log.length(); i++) {
			logWord += log.charAt(i) + " ";}
			System.out.println(logWord);
		}
		
	

	@Override
	public void error(String error) {
		String errorWord = "";
		for (int i = 0; i < error.length(); i++) {
			errorWord += error.charAt(i) + " ";}
			System.out.println("ERROR: " + errorWord);
		}
		
	

}
