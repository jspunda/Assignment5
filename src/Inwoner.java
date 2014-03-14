/**
 * Klasse voor de inwoners
 * @author Laurens van den Bercken, s4057384 
 * @author Jeftha Spunda, s4174615
 */
public class Inwoner {

	/**
	 * Inwoner nummer
	 * Score van de inwoner (wie hij kan chanteren en door wij hij gechanteerd wordt)
	 * Lijst van inwoners die hij kan chanteren
	 * Of deze inwoner al bekeken is bij het pad bepalen
	 */
	private int id;
	private int score;
	private Inwoner[] aanpakkers;
	private boolean gepakt;
	
	/**
	 * Constructor
	 * @param id van de inwoner
	 */
	public Inwoner(int id){
		this.id = id;
		gepakt = false;
		score = 0;
	}
	
	/**
	 * Verhoogt score met 1
	 */
	public void increment() {
		score ++;
	}

	/**
	 * Verlaagt score met 1
	 */
	public void decrement() {
		score --;
	}
	
	/**
	 * @return score
	 */
	public int getScore(){
		return score;
	}
	
	/**
	 * @return of deze al is bekeken of niet
	 */
	public boolean gepakt(){
		return gepakt;
	}

	/**
	 * Kleur deze Inwoner
	 */
	public void pak() {
		gepakt = true;
	}
	
	/**
	 * @return aanpakkers
	 */
	public Inwoner[] getAanpakkers(){
		return aanpakkers;
	}
	
	/**
	 * Setter voor aanpakkers
	 * @param aanpakkers
	 */
	public void setAanpakkers(Inwoner [] aanpakkers) {
		this.aanpakkers = aanpakkers;
	}
	
	/**
	 * @return id
	 */
	public int getId (){
		return id;
	}
	
	/**
	 * Beppaalt of inwoner a gechanteerd kan worden door deze inwoner
	 * @param a de te bekijken inwoner
	 * @return of deze persoon gechanteerd kan worden
	 */
	public boolean kanPakken (Inwoner a) {
		for(int i = 0; i < aanpakkers.length; i++)
			if(aanpakkers[i].getId() == a.getId())
				return true;
		return false;				
	}
	
	/**
	 * toString functie. Print ook de inwoners die de deze persoon kan chanteren
	 */
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
