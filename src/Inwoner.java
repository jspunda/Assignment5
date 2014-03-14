
public class Inwoner {

	private int id;
	private int score;
	private Inwoner[] aanpakkers;
	private boolean gepakt;
	
	public Inwoner(int id){
		this.id = id;
		gepakt = false;
		score = 0;
	}
	
	public void increment() {
		score ++;
	}

	public void decrement() {
		score --;
	}
	
	public int getScore(){
		return score;
	}
	
	public boolean gepakt(){
		return gepakt;
	}

	public void pak() {
		gepakt = true;
	}
	
	public Inwoner[] getAanpakkers(){
		return aanpakkers;
	}
	
	public void setAanpakkers(Inwoner [] aanpakkers) {
		this.aanpakkers = aanpakkers;
	}
	
	public int getId (){
		return id;
	}
	
	public boolean kanPakken (Inwoner a) {
		for(int i = 0; i < aanpakkers.length; i++)
			if(aanpakkers[i].getId() == a.getId())
				return true;
		return false;				
	}
	
	public String toString() {
		String s = "Ik ben inwoner " + id + " en ik kan aanpakken:\t";
		for(int i = 0; i < aanpakkers.length; i ++) 
			if(i == aanpakkers.length - 1)
				s+= aanpakkers[i].getId() + ".";
			else
				s += aanpakkers[i].getId() + ", ";
		
		if(aanpakkers.length == 0)
			s+= "Niemand.";
		return s;
	}
}
