/**
 * 
 */
package assignment4;

/**
 * @author chenjust
 *
 */
public class Cooperator extends Organism{
	
	double cooperationP;
	
	public Cooperator() {
		super();
		this.cooperationP = 1; 
	}
	
	@Override
	public String getType() {
		return "Cooperator"; 
	}
	
	@Override 
	public Organism reproduce() {
		this.energy = 0;
		return new Cooperator();
	}
	
	@Override
	public double getCooperationProbability() {
		return this.cooperationP;
	}
	
	@Override 
	public boolean cooperates() {
		return true;
	}
	

}
