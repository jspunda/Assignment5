
public class Inwoner {

	private int id;
	private Inwoner[] aanpakkers;
	
	public Inwoner(int id){
		this.id = id;
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
