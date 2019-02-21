/**
 * 
 */
package assignment4;

/**
 * @author chenjust
 *
 */
public class Defector extends Organism{
	
	double cooperationP;
	
	public Defector() {
		super();
		this.cooperationP = 0; 
	}
	
	@Override
	public String getType() {
		return "Defector"; 
	}
	
	@Override 
	public Organism reproduce() {
		this.energy = 0;
		return new Defector();
	}
	
	@Override
	public double getCooperationProbability() {
		return this.cooperationP;
	}
	
	@Override 
	public boolean cooperates() {
		return false;
	}

}
