package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		current = current * commonFactor; 
		return current;
	}
	
	@Override
	public String toString() {
		int f = (int) this.firstValue();
		int cF = (int) this.commonFactor;
		return "Geom(" +  f + "," + cF +")";
	}

}
