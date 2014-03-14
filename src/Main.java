import java.io.IOException;

/**
 * Main klasse. Maakt een nieuwe graph en bepaalt de machtigste persoon in Picolini.
 * @author Laurens van den Bercken, s4057384 
 * @author Jeftha Spunda, s4174615
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Graph g = new Graph("picolini.txt");
		System.out.println(g);
	}
}
