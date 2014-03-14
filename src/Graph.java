import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Graph {

	private Inwoner[] inwoners;
	private static int aantal;
	private Inwoner best;

	public Graph(String filename) throws IOException {
		read(filename);
		best = null;
		determinebest();
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
	
	private boolean isPath(int a, int b) {
		Inwoner[] aantepakken = inwoners[a].getAanpakkers();
		if (inwoners[a].kanPakken(inwoners[b])) {
			inwoners[a].increment();
			inwoners[b].decrement();
			return true;
		}
		
		for(int i = 0; i < aantepakken.length; i++) {
			if(!aantepakken[i].gepakt()){
				aantepakken[i].pak();
				return isPath(aantepakken[i].getId(),b);
			}
		}
		return false;
	}
	
	private void determinebest() {
		for (int i = 0; i < aantal ; i++) {
			for(int j = 0; j < aantal; j++){
				isPath(inwoners[i].getId(), inwoners[j].getId());
			}
		}
		Inwoner temp = inwoners[0];
		for(int i = 1; i < aantal; i ++) {
			if(inwoners[i].getScore() > temp.getScore())
				temp = inwoners[i];
		}
		best = temp;
			
	}
	
	public String toString() {
		String s = "";
		for (int i=0; i < aantal; i++) {
			s += inwoners[i] + "\n";
		}
		
		s += "De machtigste inwoner is inwoner: " + best.getId();
		return s;
	}
	
}
