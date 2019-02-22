/**
 * 
 */
package assignment4;

/**
 * @author chenjust
 *
 */
public class Organism {
	int energy;
	/**
	 * Constructor 
	 */
	public Organism() {
		this.energy = 0;
	}
	
	/**
	 *  energy will add by 1 
	 */
	public void update() {
		this.energy++;
	}
	/**
	 *  return energy
	 */
	public int getEnergy() {
		return this.energy;
	}
	/**
	 *  add energy by 1 
	 */
	public void incrementEnergy() {
		this.energy++;
	}
	
	/**
	 *  add minus energy by 1 
	 */
	public void decrementEnergy() {
		if (this.energy != 0) {
			this.energy--;
		}

	}

	/**
	 * @return a string 
	 */
	public String getType() {
		return "";
	}

	/**
	 * @return create a new organism 
	 */
	public Organism reproduce() {
		return new Organism();
	}
	
	/**
	 * @return a double 0.0
	 */
	public double getCooperationProbability() {
		return 0.0;
	}

	public boolean cooperates() {
		return true;
	}
}
