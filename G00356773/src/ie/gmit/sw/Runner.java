package ie.gmit.sw;

/**
 * This creates an instance of Menu and calls the menu() method in the menu
 * class and runs it.
 * 
 * @author William Vida
 */
public class Runner {

	/**
	 * This is the main main of the class where the menu class is declared and run.
	 * 
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws Exception
	 */
	public static void main(String[] args) throws ClassNotFoundException, Exception {
		/**
		 * Declare an instance of the Menu class and calls the menu() method.
		 */
		Menu menu = new Menu();

		/**
		 * Call the menu() method from the Menu class.
		 */
		menu.menu();
	}

}
