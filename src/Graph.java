import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Graph {

	public int[][] matrix;

	public Graph(String filename) throws IOException {
		read(filename);
	}

	private void read(String filename) throws IOException {
		FileReader reader = new FileReader(filename);
		BufferedReader br = new BufferedReader(reader);

		int aantal = Integer.parseInt(br.readLine());
		matrix = new int[aantal][aantal];

		for (int i = 0; i < aantal; i++) {
			parse(br.readLine(), i);
		}
	}

	private void parse(String line, int i) {
		String[] lijst = line.split(" ");

		for (int j = 0; j < lijst.length; j++) {
			if(lijst[j].equals("0"))
				matrix[i][Integer.parseInt(lijst[j + 1])] = 1;
			System.out.println(lijst[j]);
		}
	}

}
