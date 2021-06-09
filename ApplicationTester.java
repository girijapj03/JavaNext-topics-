class ApplicationTester{
public static void main(String[] args){	
//Application.displayApp();
	Application.addApps("GMail");
	Application.addApps("WhatsApp");
	Application.addApps("Instagram");
	Application.addApps("PayTM");
	Application.addApps("Amazon");
	Application.addApps("FlipKart");
	Application.addApps("Chrome");
	Application.addApps("Google");
	Application.addApps("TrickyPuzzle");
	Application.addApps("Sudoku");
	Application.displayApp();

	
	Application.displayAtIndex(2);
	Application.printFoundApp("Amazon");
}
}