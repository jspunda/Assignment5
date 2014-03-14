import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Graph {

	private Inwoner[] inwoners;
	private static int aantal;

	public Graph(String filename) throws IOException {
		read(filename);
	}

	private void read(String filename) throws IOException {
		FileReader reader = new FileReader(filename);
		BufferedReader br = new BufferedReader(reader);

		aantal = Integer.parseInt(br.readLine());
		inwoners = new Inwoner [aantal];
		for(int i = 0; i < aantal; i++) {
			inwoners[i] = new Inwoner(i);
		}

		for (int i = 0; i < aantal; i++)
			insert(br.readLine(), i);
	}

	private void insert(String line, int i) {
		String[] lijst = line.split(" ");
		Inwoner[] aanpakkers = new Inwoner [Integer.parseInt(lijst[0])];
		for(int j = 0; j < aanpakkers.length; j ++) {
			aanpakkers[j] = inwoners[Integer.parseInt(lijst[j+1])];
		}
		inwoners[i].setAanpakkers(aanpakkers);
	}
	
	public String toString() {
		String s = "";
		for (int i=0; i < aantal; i++) {
			s += inwoners[i] + "\n";
		}
		return s;
	}
	
}
