/**
 * 
 */
package assignment4;

/**
 * @author chenjust
 *
 */
public class Defector extends Organism{
	/**
	 * Field 
	 */
	double cooperationP;
	/**
	 * Constructor
	 */
	public Defector() {
		super();
		this.cooperationP = 0; 
	}
	/**
	 * @return a string
	 */
	@Override
	public String getType() {
		return "Defector"; 
	}
	/**
	 * @return a new Defector object
	 */
	@Override 
	public Organism reproduce() {
		this.energy = 0;
		return new Defector();
	}
	/**
	 * @return cooperation probability
	 */
	@Override
	public double getCooperationProbability() {
		return this.cooperationP;
	}
	
	@Override 
	public boolean cooperates() {
		return false;
	}

}
