import java.io.IOException;


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
