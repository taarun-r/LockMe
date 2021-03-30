package project.lockme;

public class LockMeMain {

	public static void main(String[] args) {
		
		
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", "Taarun R");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}