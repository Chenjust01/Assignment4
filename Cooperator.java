/**
 * 
 */
package assignment4;

/**
 * @author chenjust and Ricardo Xi
 *
 */


public class Cooperator extends Organism{
	/**
	 * Field 
	 */
	double cooperationP;
	/**
	 * Constructor
	 */
	public Cooperator() {
		super();
		this.cooperationP = 1; 
	}
	/**
	 * @return a string
	 */
	@Override
	public String getType() {
		return "Cooperator"; 
	}
	
	/**
	 * @return a new cooperator object
	 */
	@Override 
	public Organism reproduce() {
		this.energy = 0;
		return new Cooperator();
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
		return true;
	}
	

}
