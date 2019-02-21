/**
 * 
 */
package assignment4;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author chenjust
 *
 */
public class Population {
	Organism[] populations;

	public Population(Pair<String, Integer>[] counts) throws IllegalArgumentException {
		int counter = 0;
		int sum = 0;
		for (int m = 0; m < counts.length; m++) {
			sum += counts[m].right;
		}
		this.populations = new Organism[sum];
		for (int i = 0; i < counts.length; i++) {
			for (int j = 0; j < counts[i].right; j++) {
				if (counts[i].left.equals("Cooperator")) {
					populations[counter] = new Cooperator();
					counter++;
				} else if (counts[i].left.equals("Defector")) {
					populations[counter] = new Defector();
					counter++;
				} else if (counts[i].left.equals("PartialCooperator")) {
					populations[counter] = new PartialCooperator();
					counter++;
				} else {
					throw new IllegalArgumentException("Invalid input");
				}
			}
		}

	}

	public void update() {
		for (int i = 0; i < this.populations.length; i++) {
			this.populations[i].update();
			if (this.populations[i].cooperates()) {
				this.populations[i].decrementEnergy();
				ArrayList<Integer> numbers = new ArrayList<Integer>();
				numbers.add(i);
				Random randomGenerator = new Random();
				if (this.populations.length < 9) {
					for (int m = 0; m < this.populations.length; m++) {
						if (m != i) {
							this.populations[m].incrementEnergy();
						}
					}
				} else {
					while (numbers.size() < 9) {
						int random = randomGenerator.nextInt(this.populations.length);
						if (!numbers.contains(random)) {
							numbers.add(random);
						} else {
							numbers.add(random);
							this.populations[random].incrementEnergy();
						}
					}
				}
			}
			if (this.populations[i].getEnergy() >= 10) {
				Random randomGenerator = new Random();
				int random = randomGenerator.nextInt(this.populations.length);
				this.populations[random] = this.populations[i].reproduce();
			}
		}
	}

	public double calculateCooperationMean() {
		double sum = 0;
		for (int i = 0; i < this.populations.length; i++) {
			sum += this.populations[i].getCooperationProbability();
		}
		return sum / this.populations.length;
	}

	@SuppressWarnings({ "unchecked" })
	public Pair<String, Integer>[] getPopulationCounts() {
		Pair<String, Integer>[] pop = (Pair<String, Integer>[]) (new Pair[3]);
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		for (int i = 0; i < this.populations.length; i++) {
			if (this.populations[i] instanceof Cooperator) {
				counter1++;
			} else if (this.populations[i] instanceof Defector) {
				counter2++;
			} else if (this.populations[i] instanceof PartialCooperator) {
				counter3++;
			}
		}
		pop[0] = new Pair<String, Integer>("Cooperator", counter1);
		pop[1] = new Pair<String, Integer>("Defector", counter2);
		pop[2] = new Pair<String, Integer>("PartialCooperator", counter3);
		return pop;
	}

}
