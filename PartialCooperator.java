/**
 * 
 */
package assignment4;
import java.util.Random;
/**
 * @author chenjust
 *
 */
public class PartialCooperator extends Organism{

	double cooperationP;
	/**
	 * Constructor 
	 */
	public PartialCooperator() {
		super();
		Random randomGenerator = new Random();
		int random = randomGenerator.nextInt(2);
		this.cooperationP = random; 
	}
	
	/**
	 * @return a string 
	 */
	@Override
	public String getType() {
		return "PartialCooperator"; 
	}
	/**
	 * @return create a new PartialCooperator object 
	 */
	@Override 
	public Organism reproduce() {
		this.energy = 0;
		return new PartialCooperator();
	}
	
	/**
	 * @return return cooperationP 
	 */
	@Override
	public double getCooperationProbability() {
		return this.cooperationP;
	}
	
	public boolean cooperates() {
		if(this.cooperationP == 1) {
			return true;
		}else {
			return false; 
		}
		
	}
	

}